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
    
    public Statement stm;
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
            JOptionPane.showMessageDialog(null,"Conectado com Sucesso");
        }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Erro ao abrir conex�o BANCO DE DADOS --> " + ex.getMessage());
            
        }
    }
    
    public void disconect(){
        
        try{
            con.close();
            JOptionPane.showMessageDialog(null,"Desconectado com Sucesso");
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro ao fechar cconex�o BANCO DE DADOS --> " + ex.getMessage());
        }
        
    }
    
    public ResultSet executeSql(String sql){
        
        try {
            Statement stm = con.createStatement();
            ResultSet response = stm.executeQuery(sql);
             con.close();
             stm.close();
             response.close();
            if(response.next()){
            System.out.println(response.getString(2));
            }
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
