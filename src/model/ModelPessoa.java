/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class ModelPessoa {
  
    private int id;
    private String nomeUsuario;
    private String senha;
    private String sexo;
    private String nome;
    private Date horaEstudoInicio;    
    private Date horaEstudoFim;
    private Date horaSonoInicio;
    private Date horaSonoFim;
    private boolean visitante;
    private List<ModelRecomendacao> recomendacao;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getHoraEstudoInicio() {
        return horaEstudoInicio;
    }

    public void setHoraEstudoInicio(Date horaEstudoInicio) {
        this.horaEstudoInicio = horaEstudoInicio;
    }

    public Date getHoraEstudoFim() {
        return horaEstudoFim;
    }

    public void setHoraEstudoFim(Date horaEstudoFim) {
        this.horaEstudoFim = horaEstudoFim;
    }

    public Date getHoraSonoInicio() {
        return horaSonoInicio;
    }

    public void setHoraSonoInicio(Date horaSonoInicio) {
        this.horaSonoInicio = horaSonoInicio;
    }

    public Date getHoraSonoFim() {
        return horaSonoFim;
    }

    public void setHoraSonoFim(Date horaSonoFim) {
        this.horaSonoFim = horaSonoFim;
    }

    public boolean isVisitante() {
        return visitante;
    }

    public void setVisitante(boolean visitante) {
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ModelRecomendacao> getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(List<ModelRecomendacao> recomendacao) {
        this.recomendacao = recomendacao;
    }


}
