/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.TimeUtil;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.ModelTarefa;
import util.Conexao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelTipoTarefa;
/**
 *
 * @author PICHAU
 */
public class DaoTarefa {
     
     Conexao conn = new Conexao();
   public List<ModelTarefa> buscarTarefas(int idUser){
       
         try {
            conn.connect();
            conn.executeSql("SELECT * FROM TAREFA where pessoa ='"+ idUser +"'");
           
            List<ModelTarefa> listaTarefa =  new ArrayList<ModelTarefa>();
            
	while(conn.rs.next()){	
            ModelTarefa result;
               
            
                    result = new ModelTarefa(
                            conn.rs.getInt("id"),
                            conn.rs.getString("titulo"),
                            conn.rs.getString("descricao"),
                            conn.rs.getString("titulo"),
                            conn.rs.getInt("prioridade"),
                            conn.rs.getTime("h_inicio"),
                            conn.rs.getTime("h_fim"),
                            conn.rs.getDate("data_tarefa"));
               
            
            listaTarefa.add(result);
            
                
	}
         conn.disconect();
         return listaTarefa;
         
           } catch (SQLException ex) {
                    Logger.getLogger(DaoTarefa.class.getName()).log(Level.SEVERE, null, ex);
                     return null;
                }finally{
            conn.disconect(); 
         }  
            
            
           
       
 }  
  public boolean cadastrarTarefa(int idPessoa,ModelTarefa modelTarefa,List<Integer> tipoTarefa){
      int idTarefa = 0;
      Date data = new Date();
//      String a = "2015/05/01";
//      SimpleDateFormat formatodata = new SimpleDateFormat("dd/MM/yyyy");
//      formatodata.format(a);
        SimpleDateFormat dataTarefa = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat horaTarefa = new SimpleDateFormat("HH:mm");
//        dataTarefa.format( data );
//       horaTarefa.format(modelTarefa.getHoraInicio());
//        horaTarefa.format(modelTarefa.getHoraFim());
        
        Date horaFimDate;
        
//        horaInicioDate = (Date)horaTarefa.parse(horaInicio);
//            horaFimDate = (Date)horaTarefa.parse(horaFim);
      
      
      
      
//      String sql ="INSERT INTO tarefa(pessoa,titulo,descricao,subtitulo,prioridade,h_inicio,h_fim,data_tarefa)"
//              + " VALUES("+idPessoa+",'"+ modelTarefa.getTitulo()+"','"+ modelTarefa.getDescricao()+"','"+ modelTarefa.getSubtitulo()+"',"+ modelTarefa.getPrioridade()+","
//                      + "'"+ horaTarefa.format(modelTarefa.getHoraInicio())+"','"+ horaTarefa.format(modelTarefa.getHoraFim())+"','"+ dataTarefa.format(modelTarefa.getDataTarefa())+"')";
       
    String sql = "INSERT INTO tarefa(pessoa,titulo,descricao,subtitulo,prioridade,h_inicio,h_fim,data_tarefa) VALUES(?,?,?,?,?,?,?,?)";
         try {
       conn.connect();   
       java.util.Date dataUtil = new java.util.Date();
  java.sql.Date dataSql = new java.sql.Date(modelTarefa.getDataTarefa().getTime());
          java.sql.PreparedStatement pst = conn.con.prepareStatement(sql,com.mysql.jdbc.PreparedStatement.RETURN_GENERATED_KEYS);
          pst.setInt(1, idPessoa);
          pst.setString(2, modelTarefa.getTitulo());
          pst.setString(3, modelTarefa.getDescricao());
          pst.setString(4, modelTarefa.getSubtitulo());
          pst.setInt(5, modelTarefa.getPrioridade());
          pst.setString(6, horaTarefa.format(modelTarefa.getHoraInicio()));
          pst.setString(7, horaTarefa.format(modelTarefa.getHoraFim()));
          pst.setDate(8,dataSql);
          pst.execute();
          
            ResultSet  rs = pst.getGeneratedKeys();
     if (rs.next()) {
        idTarefa = rs.getInt(1);
     }
             
         } catch (SQLException ex) {
             Logger.getLogger(DaoTarefa.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         for(int tt : tipoTarefa){
         
         String sql1 = "INSERT INTO tarefa_tipo_tarefa(tarefa,tipo_tarefa) VALUES(?,?)"; 
         
         conn.connect();
         try {
             java.sql.PreparedStatement pst1 = conn.con.prepareStatement(sql1);
             pst1.setInt(1,idTarefa);
             pst1.setInt(2,tt);
             pst1.execute();
             
             
         } catch (SQLException ex) {
             Logger.getLogger(DaoTarefa.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         }
         
         
      
      
      return true;
  } 
 
  
  public boolean removerTarefa(ModelTarefa tarefa){
      conn.connect();
      String sqlTipoTarefa ="DELETE FROM tarefa_tipo_tarefa where tarefa = ?";
             try {
           
       java.sql.PreparedStatement pst1 = conn.con.prepareStatement(sqlTipoTarefa);
        pst1.setInt(1,tarefa.getId());
         pst1.execute();
        
         } catch (SQLException ex) {
             Logger.getLogger(DaoTarefa.class.getName()).log(Level.SEVERE, null, ex);
         }
      
      
      
      
      String sqlTarefa = "DELETE FROM tarefa where id = ?";
       
       try {
           
       java.sql.PreparedStatement pst2 = conn.con.prepareStatement(sqlTarefa);
        pst2.setInt(1,tarefa.getId());
         pst2.execute();
        
         } catch (SQLException ex) {
             Logger.getLogger(DaoTarefa.class.getName()).log(Level.SEVERE, null, ex);
         }
      
      return true;
  }
  
 
}
