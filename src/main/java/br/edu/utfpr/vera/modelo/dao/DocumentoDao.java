/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.dao;

import br.edu.utfpr.vera.modelo.dao.util.GenericDAO;
import br.edu.utfpr.vera.modelo.vo.Documento;
import java.util.List;

/**
 *
 * @author Vera
 */
public class DocumentoDao extends GenericDAO<Documento> {

    public List<Documento> getByNome(String titulo) {
        titulo = "%" + titulo + "%";
        this.addParams("titulo", titulo);
        return this.newQueryBuilder("Documento.findByTitulo");
    }

    public List<Documento> getOrfaos() {
        return this.newQueryBuilder("Documento.findOrfaos");
    }

}
