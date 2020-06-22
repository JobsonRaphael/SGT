/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PICHAU
 */
public class ModelTipoTarefa {
 
    private int id;
    private String descricao;

    public ModelTipoTarefa() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ModelTipoTarefa(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
