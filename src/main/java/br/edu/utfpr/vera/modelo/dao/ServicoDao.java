/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.dao;

import br.edu.utfpr.vera.modelo.dao.util.GenericDAO;
import br.edu.utfpr.vera.modelo.vo.Servico;
import java.util.List;

/**
 *
 * @author Marcio
 */
public class ServicoDao extends GenericDAO<Servico> {

    public List<Servico> getByNome(String titulo) {
        titulo = "%" + titulo + "%";
        this.addParams("titulo", titulo);
        return this.newQueryBuilder("Servico.findByTitulo");
    }
}
