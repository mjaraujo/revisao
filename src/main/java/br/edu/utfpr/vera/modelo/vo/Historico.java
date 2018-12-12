/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
  * @author Vera
 */
@Entity
@Table(name = "tb_historico")
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "his_codigo")
    private long codigo;    
    
    @Column(name = "his_data")
    private Date data;
    
    @Column(name = "his_comenta")
    private String comentario;
    
    @Column(name = "his_situacao", nullable = false)
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.LAZY)    
    private Situacao situacao;
    
    @ManyToOne
    @JoinColumn(name = "his_servico")
    private Servico servico;

    public Historico() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
}
