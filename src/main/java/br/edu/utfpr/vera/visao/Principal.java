/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.visao;

import br.edu.utfpr.vera.modelo.dao.TipoServicoDao;
import br.edu.utfpr.vera.modelo.vo.TipoServico;

/**
 *
 * @author Vera
 */
public class Principal {
    public static void main(String[] args) {
//        TipoServico tipoServico = new TipoServico();
//        tipoServico.setDescricao("Revisão completa");
//        tipoServico.setValorPagina(10.00);
//        
//        TipoServicoDao tipoServicoDao = new TipoServicoDao();
//        tipoServicoDao.save(tipoServico);
        
        PrincipalForm principalForm = new PrincipalForm();
        principalForm.setVisible(true);
    }
}
