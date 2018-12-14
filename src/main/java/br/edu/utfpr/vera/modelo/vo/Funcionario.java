/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Vera
 */
@Entity
@Table(name = "tb_funcionario")
@NamedQueries({
        @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome LIKE :nome ORDER BY f.nome ")}
)
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fun_codigo")
    private long codigo;
    
    @Column(name = "fun_cpf")
    private String cpf;
    
    @Column(name = "fun_nome")
    private String nome;    
    
    @Column(name = "fun_func", nullable = false)
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.LAZY)        
    private Funcao funcao;

    public Funcionario() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
