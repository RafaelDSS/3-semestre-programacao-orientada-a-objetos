/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.heranca_pessoas;

/**
 *
 * @author rafael
 */
public class Professor extends Pessoa {
    
    // Atributos
    private String especialidade;
    private float salario;
    
    // Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // Métodos
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + 1);
    }
}
