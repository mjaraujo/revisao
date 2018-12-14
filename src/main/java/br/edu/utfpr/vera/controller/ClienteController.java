/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.controller;

import br.edu.utfpr.vera.controller.util.ValidarCPF;
import br.edu.utfpr.vera.modelo.vo.Documento;
import br.edu.utfpr.vera.modelo.vo.Cliente;

/**
 *
 * @author Vera
 */
public class ClienteController {

    private Cliente cliente;

    public ClienteController(Cliente cliente) {
        this.cliente = cliente;
    }

    public String validar() {
        if (cliente.getNome()== null || cliente.getNome().trim().isEmpty()) {
            return "Informe o nome do cliente";
        }
       
        if (cliente.getCpf() == null) {
            return "Informe o CPF";
        }

        boolean cpfValido = ValidarCPF.isCPF(cliente.getCpf());
        if(cpfValido == false){
            return "CPF inválido";
        }
        return "OK";
    }

}
