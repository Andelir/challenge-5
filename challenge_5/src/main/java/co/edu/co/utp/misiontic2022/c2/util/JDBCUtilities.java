/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.util;
import java.sql.*;
/**
 *
 * @author anderson
 */
public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "/home/anderson/NetBeansProjects/challenge_4/src/database/ProyectosConstruccion.db";
     public static Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;
        return DriverManager.getConnection(url);
    }
}
