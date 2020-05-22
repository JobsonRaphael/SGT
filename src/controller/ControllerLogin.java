
package controller;

import javax.swing.JOptionPane;
import model.ModelLogin;
import util.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerLogin {
    Conexao con = new Conexao();
    
    
    
    public boolean checkLogin(ModelLogin modelLogin) throws SQLException{
        
        
        if((!(modelLogin.getLogin().equals("")) && modelLogin.getLogin() != null) && (!(modelLogin.getPassword().equals("")) && modelLogin.getPassword() != null)){
           con.connect();
          ResultSet res = con.executeSql("SELECT * FROM PESSOA where nome_usuario ='"+ modelLogin.getLogin() +"' and senha = '"+ modelLogin.getPassword()+"'");
           
                if(res.getString("nome_usuario").equals(modelLogin.getLogin()) && res.getString("senha").equals(modelLogin.getPassword())){
                    JOptionPane.showMessageDialog(null,"Logado com sucesso!");
                    
                }
                    
        }else{
            JOptionPane.showMessageDialog(null,"Preencha os campos 'Usuário' e 'Senha'");
            return false;
        }
    return false;
    }
}
