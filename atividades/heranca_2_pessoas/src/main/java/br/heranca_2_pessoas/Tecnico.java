/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.heranca_2_pessoas;

/**
 *
 * @author rafael
 */
public final class Tecnico extends Aluno {
    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public void praticar() {
        System.out.println("Praticando...");
    }
}
