/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.controller;
import co.edu.co.utp.misiontic2022.c2.model.dao.*;
import co.edu.co.utp.misiontic2022.c2.model.vo.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author anderson
 */
public class Controller {
    private final Request_1Dao query1;
    private final Request_2Dao query2;
    private final Request_3Dao query3; 

    public Controller() {
        this.query1 = new Request_1Dao();
        this.query2 = new Request_2Dao();
        this.query3 = new Request_3Dao();
    }
    
    public ArrayList<Request_1> consultarRequerimiento1() throws SQLException{
        return this.query1.request1();
    }

    public ArrayList<Request_2> consultarRequerimiento2() throws SQLException{
        return this.query2.request2();
    }

    public ArrayList<Request_3> consultarRequerimiento3() throws SQLException{
        return this.query3.request3();
    }
    
}
