/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Koneksi.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ariboss89
 */
public class PrediksiDao {
    
    Koneksi con;
    Statement st;
    String query;
    ResultSet res;
    
    public String IdRiwayat() {
        String idKriteria = "";
        con = new Koneksi();
        try {
            st = con.connect().createStatement();
            res = st.executeQuery("select *from tb_riwayat ORDER BY id_riwayat DESC");
            if (res.first() == false) {
                idKriteria = ("R001");
            } else {
                res.first();
                System.out.println("COT: " + res.getString("id_riwayat").substring(3, 4));
                int no = Integer.valueOf(res.getString("id_riwayat").substring(3, 4)) + 1;
                System.out.println(no);
                if (no < 10) {
                    idKriteria = ("R00" + no);
                }
                if (no >=10 && no < 100 ) {
                    idKriteria = ("R0" + no);
                }
                if (no >=100 && no < 999) {
                    idKriteria = ("R" + no);
                }
            }
            res.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }

        return idKriteria;
    };
    
    public void SaveIdRiwayat(String idRiwayat) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.createStatement();
            query = "insert into tb_riwayat(id_riwayat)values('" + idRiwayat + "')";
            st.executeUpdate(query);
            st.close();
            con.conn.close();
            //JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
        } catch (SQLException e) {
        }
    }
    
    public void Save(String tanggal, String idRiwayat, String dari, String sampai, String namaBarang, String nilaiAlpha, String mse, String hasil) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.createStatement();
            query = "insert into tb_hasil(tanggal, id_riwayat, dari, sampai, nama_barang, nilai_alpha, mse, hasil)values('" + tanggal + "','" + idRiwayat + "','" + dari + "','" + sampai + "','" + namaBarang + "', '"+nilaiAlpha+"', '"+mse+"', '"+hasil+"')";
            st.executeUpdate(query);
            st.close();
            con.conn.close();
        } catch (SQLException e) {
        }
    }
}
