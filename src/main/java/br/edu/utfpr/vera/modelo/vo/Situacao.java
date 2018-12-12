/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

/**
 *
 * @author Vera
 */
public enum Situacao {
    EMPROGRESSO("Em progresso"),
    CANCELADO("Cancelado"),
    PAUSADO("Pausado"),
    CONCLUIDO("Concluído");
    
    private final String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
