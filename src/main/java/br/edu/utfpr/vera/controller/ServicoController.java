/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.controller;

import br.edu.utfpr.vera.modelo.vo.Servico;
import br.edu.utfpr.vera.modelo.vo.TipoServico;

/**
 *
 * @author Vera
 */
public class ServicoController {

    private Servico servico;

    public ServicoController(Servico servico) {
        this.servico = servico;
    }

    public String validar() {
        if (servico.getDocumento() == null) {
            return "Selecione o documento";
        }
        if (servico.getTiposervicoList().isEmpty()) {
            return "Selecione ao menos um serviço contratado";
        }
        if (servico.getQtdParcelas() <= 0) {
            return "Informe a quantidade de parcelas do pagamento";
        }

        return "OK";
    }

    public void recalcular() {
        if (servico.getDocumento() == null) {
            servico.setValorServico(0.00);
            return;
        }
        double valor = 0.00;
        int numPag = (int) (servico.getDocumento().getQtCaracteres() / 2000.0);
        for (TipoServico ts : servico.getTiposervicoList()) {
            valor += ts.getValorPagina() * numPag;
        }
        servico.setValorServico(valor);
    }

}
