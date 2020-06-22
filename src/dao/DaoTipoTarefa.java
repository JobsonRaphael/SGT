/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelTipoTarefa;
import util.Conexao;

/**
 *
 * @author PICHAU
 */
public class DaoTipoTarefa {
    
    Conexao con = new Conexao();
   public List<ModelTipoTarefa> buscarTipoTarefa(){
       
         try {
            con.connect();
            con.executeSql("SELECT * FROM tipo_tarefa");
           
            List<ModelTipoTarefa> listaTipoTarefa =  new ArrayList<ModelTipoTarefa>();
            
	while(con.rs.next()){	
            ModelTipoTarefa result = new ModelTipoTarefa();
            result.setId(con.rs.getInt("id"));
            result.setDescricao(con.rs.getString("descricao"));
            listaTipoTarefa.add(result);
            
                
	}
         con.disconect();
         return listaTipoTarefa;
         
           } catch (SQLException ex) {
                    Logger.getLogger(DaoTipoTarefa.class.getName()).log(Level.SEVERE, null, ex);
                     return null;
                }finally{
            con.disconect(); 
         }  
            
            
           
       
 }  
      
    
}
