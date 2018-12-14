/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.controller;

import br.edu.utfpr.vera.modelo.vo.Documento;

/**
 *
 * @author Vera
 */
public class DocumentoController {

    private Documento documento;

    public DocumentoController(Documento documento) {
        this.documento = documento;
    }

    public String validar() {
        if (documento.getTitulo() == null || documento.getTitulo().trim().isEmpty()) {
            return "Informe o título do documento";
        }
        if (documento.getCliente() == null) {
            return "Selecione o cliente";
        }
        if (documento.getTipoDocumento() == null) {
            return "Selecione o tipo de documento";
        }

        if (documento.getQtCaracteres() < 1) {
            return "Quantidade de caracteres inválida";
        }
        return "OK";
    }

}
