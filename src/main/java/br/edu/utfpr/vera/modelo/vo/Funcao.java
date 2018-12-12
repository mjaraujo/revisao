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
public enum Funcao {
    REVISOR("Revisor ortográfico-gramatical"),
    FORMATADOR("Formatador de texto"),
    REVISOR_GERAL("Revisor e formatador");
    
    private final String descricao;

    private Funcao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
        
}
