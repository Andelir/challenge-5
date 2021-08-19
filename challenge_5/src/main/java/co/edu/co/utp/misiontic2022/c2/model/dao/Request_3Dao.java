/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.model.dao;
import co.edu.co.utp.misiontic2022.c2.model.vo.Request_3;
import co.edu.co.utp.misiontic2022.c2.util.JDBCUtilities;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author anderson
 */
public class Request_3Dao {
    public ArrayList<Request_3> request3() throws SQLException{
        ArrayList<Request_3> result = new ArrayList<Request_3>();
        Connection database_connection = JDBCUtilities.getConnection();
        try{  
            String query = "SELECT DISTINCT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido"+
                              " FROM proyecto p "+
                              "INNER JOIN lider l ON p.ID_Lider = l.ID_Lider";
            PreparedStatement statement = database_connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int idLeader = resultSet.getInt("ID_Lider");
                String name = resultSet.getString("Nombre");
                String surname = resultSet.getString("Primer_Apellido");
                String secondSurname = resultSet.getString("Segundo_Apellido");
                
                Request_3 obj3 = new Request_3(idLeader,name,surname,secondSurname);
                result.add(obj3);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.err.println("Error consultando Proyectos que deben dinero por compra de materiales: "+e);
        
        }
        return result;
    }    
}
