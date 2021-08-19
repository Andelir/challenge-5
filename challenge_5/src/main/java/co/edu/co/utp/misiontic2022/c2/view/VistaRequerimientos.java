/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.view;
import co.edu.co.utp.misiontic2022.c2.controller.Controller;
import co.edu.co.utp.misiontic2022.c2.model.vo.*;
/**
 *
 * @author anderson
 */
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientos {

    public static final Controller controlador = new Controller();

    public static void requerimiento1() throws SQLException{
        ArrayList<Request_1> numLideresCiudad = controlador.consultarRequerimiento1();

        //Encabezado del resultado
        System.out.println("Nro_Lideres Ciudad_Residencia");
        try {
            for(Request_1 requerimiento : numLideresCiudad){
                System.out.println(requerimiento.getNumLeaders() + "  " +
                                   requerimiento.getCity());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2()throws SQLException{
        ArrayList<Request_2> materialesNoPagados = controlador.consultarRequerimiento2();

        //Encabezado del resultado
        System.out.println("ID_Proyecto Proveedor Pagado  ID_MaterialConstruccion  Nombre_Material");
        try {
            for(Request_2 requerimiento : materialesNoPagados){
                System.out.println(requerimiento.getIdProject()+ "  " +
                                   requerimiento.getProvider() + "  " +
                                   requerimiento.getPrepaid() + "  " +
                                   requerimiento.getIdBuildingMaterial() + "  " +
                                   requerimiento.getMaterialName());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3()throws SQLException{
        ArrayList<Request_3> lideresDebenDinero = controlador.consultarRequerimiento3();

        //Encabezado del resultado
        System.out.println("ID_Lider Nombre Primer_Apellido Segundo_Apellido");
        try {
            for(Request_3 requerimiento : lideresDebenDinero){
                System.out.println(requerimiento.getIdLeader()+ "  " +
                                   requerimiento.getName()+ "  " +
                                   requerimiento.getSurname()+ "  " +
                                   requerimiento.getSecondSurname());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
