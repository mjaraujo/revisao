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
    AGUARDANDO_ORCAMENTO("Aguardando orçamento"),
    CANCELADO("Cancelado"),
    CONCLUIDO("Concluído"),
    EM_PROGRESSO("Em progresso"),
    FINALIZADO("Finalizado"),
    ORCAMENTO_ENVIADO("Orçamento enviado"),
    PAUSADO("Pausado");
    
    private final String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
