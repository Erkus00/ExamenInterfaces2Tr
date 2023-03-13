package com.example.entregaexamenjavafx.model;

import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.swing.JRViewer;

import javax.swing.*;

public class Informe {
    public static void showReportCalificaciones() throws JRException {
        HashMap hm = new HashMap();
        String report = "reports/calificaciones.jasper";
        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, hm, Conexion.getCon()
        );
        JRViewer viewer = new JRViewer(jasperPrint);
        JFrame frame = new JFrame("Calificaciones");
        frame.getContentPane().add(viewer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);

        System.out.println("Informe DONE!");

    }

    public static void showPDFCalificaciones() throws JRException {
        HashMap hm = new HashMap();

        String report = "reports/calificaciones.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report,
                hm,
                Conexion.getCon()
        );

        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("pdf/calificaciones_media.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();

        System.out.print("PDF Done!");
    }
}
