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
public class ModelTarefa {
    
    private int id;
    private ModelPessoa pessoa;
    private String titulo;
    private String descricao;
    private String subtitulo;
    private int prioridade;
    private Date horaInicio;
    private Date horaFim;
    private Date dataTarefa;
    private List<ModelTipoTarefa> tipoTarefa;

    
    public void setIdPessoa(int id){
        pessoa.setId(id);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(ModelPessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    public Date getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(Date dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    public List<ModelTipoTarefa> getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(List<ModelTipoTarefa> tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }

    public ModelTarefa(int id,String titulo, String descricao, String subtitulo, int prioridade, Date horaInicio, Date horaFim, Date dataTarefa) {
            this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.subtitulo = subtitulo;
        this.prioridade = prioridade;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.dataTarefa = dataTarefa;
    }
    public ModelTarefa(String titulo, String descricao, String subtitulo, int prioridade, Date horaInicio, Date horaFim, Date dataTarefa) {
            
        this.titulo = titulo;
        this.descricao = descricao;
        this.subtitulo = subtitulo;
        this.prioridade = prioridade;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.dataTarefa = dataTarefa;
    }


    
    
}
