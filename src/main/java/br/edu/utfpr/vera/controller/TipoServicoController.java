/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.controller;

import br.edu.utfpr.vera.modelo.vo.TipoServico;

/**
 *
 * @author Vera
 */
public class TipoServicoController {

    private TipoServico tipoServico;

    public TipoServicoController(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String validar() {
        if (tipoServico.getDescricao()== null || tipoServico.getDescricao().trim().isEmpty()) {
            return "Informe o tipo de servico";
        }               
      
        return "OK";
    }

}