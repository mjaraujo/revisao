/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Vera
 */
@Entity
@Table(name = "tb_servico")
@NamedQueries({
    @NamedQuery(name = "Servico.findByTitulo", query = "SELECT s FROM Servico s WHERE s.documento.titulo LIKE :titulo ORDER BY s.documento.titulo ")}
)

public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ser_codigo")
    private long codigo;

    @ManyToOne
    @JoinColumn(name = "ser_funcionario")
    private Funcionario funcionario;

    @Column(name = "ser_valor")
    private double valorServico;

    @Column(name = "ser_qtParc")
    private int qtdParcelas;

    @Column(name = "ser_dtPrevEntrega")
    private Date dataPrevEntrega;

    @Column(name = "ser_dtVenc")
    private Date dataVencimento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ser_docum")
    private Documento documento;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_servico_tb_tiposervico",
            joinColumns = {
                @JoinColumn(name = "servico")},
            inverseJoinColumns = {
                @JoinColumn(name = "tiposervico")})
    @Fetch(FetchMode.SUBSELECT)
    private List<TipoServico> tiposervicoList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pagamento> pagamentoList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Historico> historicoList;

    public Servico() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public List<TipoServico> getTiposervicoList() {
        return tiposervicoList;
    }

    public void setTiposervicoList(List<TipoServico> tiposervicoList) {
        this.tiposervicoList = tiposervicoList;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public Date getDataPrevEntrega() {
        return dataPrevEntrega;
    }

    public void setDataPrevEntrega(Date dataPrevEntrega) {
        this.dataPrevEntrega = dataPrevEntrega;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
    }

    public List<Historico> getHistoricoList() {
        return historicoList;
    }

    public void setHistoricoList(List<Historico> historicoList) {
        this.historicoList = historicoList;
    }

}
