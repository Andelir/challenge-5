/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.model.dao;
import co.edu.co.utp.misiontic2022.c2.model.vo.Request_2;
import co.edu.co.utp.misiontic2022.c2.util.JDBCUtilities;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author anderson
 */
public class Request_2Dao {
    public ArrayList<Request_2> request2() throws SQLException{
        ArrayList<Request_2> result = new ArrayList<Request_2>();
        Connection database_connection = JDBCUtilities.getConnection();
         try{       

            String consulta = "SELECT c.ID_Proyecto, c.Proveedor, c.Pagado, mc.ID_MaterialConstruccion, mc.Nombre_Material"+
             " FROM compra c "+
            "INNER JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
            "WHERE c.Proveedor = 'Homecenter' AND c.Pagado = 'No' ORDER BY c.ID_Proyecto;";
            PreparedStatement statement = database_connection.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int idProject = resultSet.getInt("ID_Proyecto");
                String provider = resultSet.getString("Proveedor");
                String prepaid = resultSet.getString("Pagado");
                int idBuildingMaterial = resultSet.getInt("ID_MaterialConstruccion");
                String materialName = resultSet.getString("Nombre_Material");
                Request_2 obj2 = new Request_2(idProject, provider, prepaid, idBuildingMaterial, materialName);
                obj2.setIdProject(idProject);
                obj2.setProvider(provider);
                obj2.setPrepaid(prepaid);
                obj2.setIdBuildingMaterial(idBuildingMaterial);
                obj2.setMaterialName(materialName);
                result.add(obj2);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.err.println("Error consultando Materiales no pagados al proveedor Homecenter: "+e);
        
        }
        return result;
        
        
    }
}
