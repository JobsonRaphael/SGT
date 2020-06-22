/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class Conexao {
    
    public  Statement stm;
    public ResultSet rs;
    public Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/gestao_tempo";
    private String user = "root";
    private String password = "";
    
    
    public void connect(){
        try{
        System.setProperty("jdbc.Drivers", driver);
        con = DriverManager.getConnection(url,user,password);
       
        }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Erro ao abrir conex�o BANCO DE DADOS --> " + ex.getMessage());
            
        }
    }
    
    public void disconect(){
        
        try{
            con.close();
         
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro ao fechar cconex�o BANCO DE DADOS --> " + ex.getMessage());
        }
        
    }
    
    public ResultSet executeSql(String sql){
        
        try {
            Statement stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
                                
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
