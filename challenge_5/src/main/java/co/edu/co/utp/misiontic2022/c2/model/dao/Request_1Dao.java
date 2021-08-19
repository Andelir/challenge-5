/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.model.dao;
import co.edu.co.utp.misiontic2022.c2.util.JDBCUtilities;
import co.edu.co.utp.misiontic2022.c2.model.vo.Request_1;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author anderson
 */
public class Request_1Dao {
    public ArrayList<Request_1> request1() throws SQLException{
        ArrayList<Request_1> result = new ArrayList<Request_1>();
        Connection database_connection = JDBCUtilities.getConnection();
        
        try{
            
            String query = "SELECT COUNT(l.ID_Lider) numLideres,l.Ciudad_Residencia"+
                              " FROM Lider l GROUP BY l.Ciudad_Residencia;";
            PreparedStatement statement = database_connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int numLeaders = resultSet.getInt("numLideres");
                String city = resultSet.getString("Ciudad_Residencia");
                Request_1 obj1 = new Request_1(numLeaders,city);
                obj1.setNumLeaders(numLeaders);
                obj1.setCity(city);
                result.add(obj1);
            }
            resultSet.close();
            statement.close();
        
        }catch(SQLException e){
             System.err.println("Error consultando Número de lideres por ciudad: "+e);  
        }
        return result;
    }
}
