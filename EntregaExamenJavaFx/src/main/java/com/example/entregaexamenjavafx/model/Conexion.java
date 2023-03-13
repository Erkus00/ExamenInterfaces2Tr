package com.example.entregaexamenjavafx.model;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Clase para configurar la conexion con la Base de Datos
 */
public class Conexion {


    private static final Connection con;
    private static final String URL = "jdbc:mysql://localhost:3307/";
    // Contraseña
    private static final String PASS = "root";
    // Usuario
    private static final String USSER = "root";

    static {
        // Nombre de la Base de Datos
        String database = "calificaciones";
        try {
            con = DriverManager.getConnection(URL + database, USSER, PASS);
            System.out.println("Conexion realizada con exito a '" + database + "'");
        } catch (Exception e) {
            System.out.println("Problema al conectar con la base de Datos: " + database);
            throw new RuntimeException(e);
        } finally {
            System.out.println("Proceso de conexion terminado");
        }
    }

    public static Connection getCon() {
        return con;
    }
}