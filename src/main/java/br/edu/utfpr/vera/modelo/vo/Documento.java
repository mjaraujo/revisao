/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

import java.util.List;
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Vera
 */
@Entity
@Table(name = "tb_documento")
@NamedQueries({
    @NamedQuery(name = "Documento.findOrfaos", query = "SELECT d FROM Documento d WHERE SIZE(d.servicoList) = 0 ")
    ,@NamedQuery(name = "Documento.findByTitulo", query = "SELECT d FROM Documento d WHERE d.titulo LIKE :titulo ORDER BY d.titulo ")}
)
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doc_codigo")
    private long codigo;

    @Column(name = "doc_tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.LAZY)
    private TipoDocumento tipoDocumento;

    @Column(name = "doc_titulo")
    private String titulo;

    @Column(name = "doc_qtCaract")
    private long qtCaracteres;

    @ManyToOne
    @JoinColumn(nullable = false, name = "doc_cliente")
    private Cliente cliente;

    @OneToMany
    private List<Servico> servicoList;

    public Documento() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getQtCaracteres() {
        return qtCaracteres;
    }

    public void setQtCaracteres(long qtCaracteres) {
        this.qtCaracteres = qtCaracteres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return cliente.getNome() + " - " + titulo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
