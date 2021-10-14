/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.avaliacao.animais;

/**
 *
 * @author rafael
 */
public abstract class Animal {
    private String nome;
    private String classe;

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Classe: " + this.getClasse());
    }
    
    public void falar() {
        System.out.println("");
    }
}
