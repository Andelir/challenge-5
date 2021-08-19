/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.co.utp.misiontic2022.c2.view;
import co.edu.co.utp.misiontic2022.c2.model.vo.Request_1;
import co.edu.co.utp.misiontic2022.c2.model.vo.Request_2;
import co.edu.co.utp.misiontic2022.c2.model.vo.Request_3;
import static co.edu.co.utp.misiontic2022.c2.view.VistaRequerimientos.controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author anderson
 */
public class ViewFinal extends JFrame {
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JLabel query1;
    private JLabel query2;
    private JLabel query3;
    private JLabel title1;
    private JLabel title2;
    private JTable table1;
    private JTable table2;
    private JTable table3;
    private JScrollPane jspane;
    private JLabel Summary;
    
    
    //Builder
    public ViewFinal(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setTitle("Dashboard");
        setLayout(null);
        setLocationRelativeTo(null);
        init();
        
    }

    private void init() {
        
        
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 394, 700);
        panel1.setBackground(new java.awt.Color(36, 37, 42));
        
       
        panel2.setLayout(null);
        panel2.setBounds(400, 0, 800, 700);
        panel2.setBackground(new java.awt.Color(255,255,255));
        
        
        title1 = new JLabel("H&L Builders ");
        title1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(254, 254, 254));
        title1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        title1.setBounds(95, 50, 228, 43);

        title2 = new JLabel("Association");
        title2.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 250, 250));
        title2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        title2.setBounds(115, 95, 228, 43);

        query1 = new JLabel("                    Query 1");
        query1.setFont(new java.awt.Font("Liberation Sans", 0, 24));
        query1.setForeground(new java.awt.Color(255, 255, 255));
        query1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        query1.setOpaque(true);
        query1.setBackground(new java.awt.Color(36, 37, 42));
        query1.setBounds(0,200,400,28);
        query1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    query1MouseClicked(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                query1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                query1MouseExited(evt);
            }
        });
        
        
        query2 = new JLabel("                    Query 2");
        query2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        query2.setForeground(new java.awt.Color(255, 255, 255));
        query2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        query2.setOpaque(true);
        query2.setBackground(new java.awt.Color(36, 37, 42));
        query2.setBounds(0,240,400,28);
        query2.addMouseListener(new java.awt.event.MouseAdapter() {
          @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    query2MouseClicked(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                query2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                query2MouseExited(evt);
            }
            
        });
        
        query3 = new JLabel("                    Query 3");
        query3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        query3.setForeground(new java.awt.Color(255, 255, 255));
        query3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        query3.setOpaque(true);
        query3.setBackground(new java.awt.Color(36, 37, 42));
        query3.setBounds(0,280,400,28);
        query3.addMouseListener(new java.awt.event.MouseAdapter() {
          @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    query3MouseClicked(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                query3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                query3MouseExited(evt);
            }
            
        });
        
        
        panel1.add(title1);
        panel1.add(title2);
        panel1.add(query1);
        panel1.add(query2);
        panel1.add(query3);
        
        panel1.setVisible(true);
       
        
        add(panel1);
        add(panel2);
        
    }
    private void query1MouseClicked(java.awt.event.MouseEvent evt) throws SQLException { 
        ArrayList<Request_1> numLideresCiudad = controlador.consultarRequerimiento1();
        
        
        if(panel2.getComponentCount() != 0){
            panel2.removeAll();
        }
        Summary = new JLabel("Number of leaders per city with your city");
        Summary.setFont(new java.awt.Font("Liberation Sans", 0, 18));
        Summary.setForeground(Color.black);
        Summary.setBounds(60, 80, 600, 30);
        String namecolumn[] = { "Leaders", "City" };
        String rowsData[][] = new String[numLideresCiudad.size()][namecolumn.length];
        for (int i = 0; i < numLideresCiudad.size(); i++) {
            rowsData[i][0] = numLideresCiudad.get(i).getNumLeaders()+"";
            rowsData[i][1] = numLideresCiudad.get(i).getCity();
        }
        table1 = new JTable(rowsData, namecolumn);
        jspane = new JScrollPane(table1);
        jspane.setBounds(60, 120, 500,278 );
        panel2.add(Summary);
        panel2.add(jspane);
        panel2.revalidate();
        panel2.repaint();
        
    
    }
      private void query1MouseEntered(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        query1.setBackground(Color.gray);
    }                                    

    private void query1MouseExited(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        query1.setBackground(new Color(36,37,42));
    }   
        private void query2MouseClicked(java.awt.event.MouseEvent evt) throws SQLException { 
        ArrayList<Request_2> materialesNoPagados = controlador.consultarRequerimiento2();
       
        if(panel2.getComponentCount() != 0){
            panel2.removeAll();
        }
        Summary = new JLabel("Materials that have not been paid to Homecenter");
        Summary.setFont(new java.awt.Font("Liberation Sans", 0, 18));
        Summary.setForeground(Color.black);
        Summary.setBounds(60, 50, 600, 30);
        String namecolumn[] = { "Id_Project", "Provider", "Prepaid", "Id_BuildingMaterial", "Material_Name" };
        String rowsData[][] = new String[materialesNoPagados.size()][namecolumn.length];
        for (int i = 0; i < materialesNoPagados.size(); i++) {
            rowsData[i][0] = materialesNoPagados.get(i).getIdProject()+"";
            rowsData[i][1] = materialesNoPagados.get(i).getProvider();
            rowsData[i][2] = materialesNoPagados.get(i).getPrepaid();
            rowsData[i][3] = materialesNoPagados.get(i).getIdBuildingMaterial()+"";
            rowsData[i][4] = materialesNoPagados.get(i).getMaterialName();
        }
        table1 = new JTable(rowsData, namecolumn);
        jspane = new JScrollPane(table1);
        jspane.setBounds(60, 100, 700, 500 );
        panel2.add(Summary);
        panel2.add(jspane);
        panel2.revalidate();
        panel2.repaint();
        
    
    }
    private void query2MouseEntered(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        query2.setBackground(Color.gray);
    }                                    

    private void query2MouseExited(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        query2.setBackground(new Color(36,37,42));
    }  
        private void query3MouseClicked(java.awt.event.MouseEvent evt) throws SQLException { 
        ArrayList<Request_3> lideresDebenDinero = controlador.consultarRequerimiento3();
        if(panel2.getComponentCount() != 0){
            panel2.removeAll();
        }
        Summary = new JLabel("Data of the leader who owes money for the purchase of materials");
        Summary.setFont(new java.awt.Font("Liberation Sans", 0, 18));
        Summary.setForeground(Color.black);
        Summary.setBounds(60, 50, 600, 30);
         
        String namecolumn[] = { "Id_Leader", "Name", "Surname", "Second_Surname"};
        String rowsData[][] = new String[lideresDebenDinero.size()][namecolumn.length];
        for (int i = 0; i < lideresDebenDinero.size(); i++) {
            rowsData[i][0] = lideresDebenDinero.get(i).getIdLeader()+"";
            rowsData[i][1] = lideresDebenDinero.get(i).getName();
            rowsData[i][2] = lideresDebenDinero.get(i).getSurname();
            rowsData[i][3] = lideresDebenDinero.get(i).getSecondSurname();
           
        }
        table1 = new JTable(rowsData, namecolumn);
        jspane = new JScrollPane(table1);
        jspane.setBounds(60, 100, 700, 500 );
        panel2.add(Summary);
        panel2.add(jspane);
        panel2.revalidate();
        panel2.repaint();
        
    
    }
    private void query3MouseEntered(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        query3.setBackground(Color.gray);
    }                                    

    private void query3MouseExited(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        query3.setBackground(new Color(36,37,42));
    }  
 
    
}
