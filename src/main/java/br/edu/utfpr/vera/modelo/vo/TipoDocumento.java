/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

/**
 * @author Vera
 */
public enum TipoDocumento {
    TESE("Tese de Doutorado"),
    DISSERTACAO("Dissertação de Mestrado"),    
    MONOGRAFIA("Monografia de Especialização"),
    TCC("Trabalho de Conclusão de Curso"),
    PROJETO("Projeto acadêmico"),    
    ARTIGO("Artigo acadêmico"),
    RESUMO("Resumo acadêmico"),
    LIVRO("Livro"),
    MANUAL("Manual"),
    CAPLIVRO("Capítulo de livro"),
    RELATÓRIO("Relatórios diversos");
        
    private final String descricao;

    private TipoDocumento(String descricao) {
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
