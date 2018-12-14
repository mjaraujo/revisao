/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.controller;

import br.edu.utfpr.vera.controller.util.ValidarCPF;
import br.edu.utfpr.vera.modelo.vo.Documento;
import br.edu.utfpr.vera.modelo.vo.Funcionario;

/**
 *
 * @author Vera
 */
public class FuncionarioController {

    private Funcionario funcionario;

    public FuncionarioController(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String validar() {
        if (funcionario.getNome()== null || funcionario.getNome().trim().isEmpty()) {
            return "Informe o nome do funcionário";
        }
        if (funcionario.getFuncao() == null) {
            return "Selecione a função";
        }
        if (funcionario.getCpf() == null) {
            return "Informe o CPF";
        }

        boolean cpfValido = ValidarCPF.isCPF(funcionario.getCpf());
        if(cpfValido == false){
            return "CPF inválido";
        }
        return "OK";
    }

}
