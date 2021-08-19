/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.challenge_5;
import co.edu.co.utp.misiontic2022.c2.view.ViewFinal;
import co.edu.co.utp.misiontic2022.c2.view.VistaRequerimientos;
import java.sql.SQLException;

/**
 *
 * @author anderson
 */
public class App {
    public static void main(String[] args) throws SQLException {
       /*System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
    
    */
    ViewFinal dashboard = new ViewFinal();
    dashboard.setVisible(true);
    
    }
}
