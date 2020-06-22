/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoTarefa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelTarefa;
import model.ModelTipoTarefa;
import util.Util;
import view.FrmCadastrarTarefa;

/**
 *
 * @author PICHAU
 */
public class ControllerTarefa {
    
    public boolean registrarTarefa(int idPessoa,String titulo, String subtitulo, String descricao,String prioridade, String horaInicio,String horaFim,List<Integer> tipoTarefa) throws ParseException{
      
        Util u = new Util();
        if(u.isNull(idPessoa) || u.isNull(titulo) || u.isNull(subtitulo) || u.isNull(descricao) || u.isNull(prioridade) || u.isNull(horaInicio) || u.isNull(horaFim)){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos.");
            
        }else{
        
        
        
        
       Date data = new Date();
        SimpleDateFormat dataTarefa = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat horaTarefa = new SimpleDateFormat("HH:mm");
        dataTarefa.format( data );
        Date horaInicioDate;
        Date horaFimDate;
      try {
            horaInicioDate = (Date)horaTarefa.parse(horaInicio);
            horaFimDate = (Date)horaTarefa.parse(horaFim);
            int prioridadeInt = Integer.parseInt(prioridade);

        ModelTarefa modelTarefa = new ModelTarefa(titulo,descricao,subtitulo,prioridadeInt,horaInicioDate,horaFimDate,data);
        
        DaoTarefa daoTarefa = new DaoTarefa();
        daoTarefa.cadastrarTarefa(idPessoa,modelTarefa,tipoTarefa);
        return true;
       } catch (ParseException ex) {
            Logger.getLogger(FrmCadastrarTarefa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Tarefa");
            return false;
        }
           
  }  
        return false;
    }
        public boolean removerTarefa(ModelTarefa tarefa){
     
           DaoTarefa daoTarefa = new DaoTarefa();
           
           if(tarefa.getId() > 0){
           return daoTarefa.removerTarefa(tarefa);
            
           }
     
     
        return false;
 }
}
