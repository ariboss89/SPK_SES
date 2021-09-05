/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Koneksi.Koneksi;
import java.io.File;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ariboss89
 */
public class ReportDao {
    private Koneksi con;

    public void CetakHasil(String tanggal,String idRiwayat, String dari, String sampai, String namaBarang, String nilaiAlpha, String akurasi, String hasil) {
        
        con = new Koneksi();

        try {
            HashMap parameter = new HashMap();
            File file = new File("src/Report/LaporanHasil.jasper");
            parameter.put("tanggal", tanggal);
            parameter.put("barang", namaBarang);
            parameter.put("nilaialpha", nilaiAlpha);
            parameter.put("mae", akurasi);
            parameter.put("hasil", hasil);
            parameter.put("dari", dari);
            parameter.put("sampai", sampai);
            parameter.put("idriwayat", idRiwayat );
            JasperReport jp = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jp, parameter, con.connect());
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void CetakRiwayat(String dari, String sampai){
        con = new Koneksi();

        try {
            HashMap parameter = new HashMap();
            File file = new File("src/Report/LaporanRiwayat.jasper");
            parameter.put("dari", dari);
            parameter.put("sampai", sampai);
            JasperReport jp = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jp, parameter, con.connect());
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
