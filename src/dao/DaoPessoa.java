/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelPessoa;
import util.Conexao;
import java.sql.ResultSet;

/**
 *
 * @author PICHAU
 */
public class DaoPessoa {
    
    Conexao con = new Conexao();
    
 
 public ModelPessoa buscarLogin(ModelPessoa pessoa){
    boolean sucessoLogin = false;
    ModelPessoa resultPessoa = new ModelPessoa();
        try {
            con.connect();
            con.executeSql("SELECT * FROM PESSOA where nome_usuario ='"+ pessoa.getNomeUsuario() +"' and senha = '"+ pessoa.getSenha()+"'");
           
            
            
	while(con.rs.next()){										                                   	
		resultPessoa.setId(con.rs.getInt("id"));
                resultPessoa.setNomeUsuario(con.rs.getString("nome_usuario"));
		resultPessoa.setNome(con.rs.getString("nome"));
                if(con.rs.getInt("visitante") == 1){
                resultPessoa.setVisitante(true);
                }else{
                resultPessoa.setVisitante(false);
                }
                
                
	}
            
            
            con.disconect();
            return resultPessoa;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
 }
    
}