/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "tb_parcelaPagamento")
public class Pagamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pag_codigo")
    private long codigo;
    
    @Column(name = "pag_dtPag")
    private Date dataPagamento;
    
    @Column(name = "pag_vlTot")
    private double valorTotal;
    
    @Column(name = "pag_numParc")
    private int numParcela;
    
    @Column(name = "pag_parPaga")
    private boolean parcelaPaga;
    
    @Column(name = "pag_forPag", nullable = false)
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.LAZY)   
    private FormaPagamento formaPagamento;
    
    @ManyToOne
    @JoinColumn(name = "pag_servico")    
    private Servico servico;

    
    
    public Pagamento() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public boolean isParcelaPaga() {
        return parcelaPaga;
    }

    public void setParcelaPaga(boolean parcelaPaga) {
        this.parcelaPaga = parcelaPaga;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
}
