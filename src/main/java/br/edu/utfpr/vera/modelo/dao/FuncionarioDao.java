/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.vera.modelo.dao;

import br.edu.utfpr.vera.modelo.dao.util.GenericDAO;
import br.edu.utfpr.vera.modelo.vo.Funcionario;
import java.util.List;

/**
 *
 * @author Vera
 */
public class FuncionarioDao extends GenericDAO<Funcionario>{
     
    public List<Funcionario> getByNome(String nome) {
        nome = "%" + nome + "%";
        this.addParams("nome", nome);
        return this.newQueryBuilder("Funcionario.findByNome");
    }
}
