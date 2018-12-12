/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.vo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/*
 * @author Vera
 */
@Entity
@Table(name = "tb_tpServico")
public class TipoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tse_codigo")
    private long codigo;
    
    @Column(name = "tse_descricao")
    private String descricao;
    
    @Column(name = "tse_valPagina")
    private double valorPagina;
    
    @ManyToMany(mappedBy = "tiposervicoList")
    private List<Servico> servicoList;
            
    public TipoServico() {
        
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorPagina() {
        return valorPagina;
    }

    public void setValorPagina(double valorPagina) {
        this.valorPagina = valorPagina;
    }

    public List<Servico> getServicoList() {
        return servicoList;
    }

    public void setServicoList(List<Servico> servicoList) {
        this.servicoList = servicoList;
    }
    
}
