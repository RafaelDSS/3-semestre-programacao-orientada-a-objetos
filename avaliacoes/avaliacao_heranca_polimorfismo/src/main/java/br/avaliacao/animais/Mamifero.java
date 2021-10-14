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
public class Mamifero extends Animal {
    private int velocidade;

    public Mamifero() {
        this.setClasse("Mamífero");
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void correr() {
        for (int i = 0; i < this.getVelocidade(); i++) {
            System.out.println("correndo");
        }
    }
}
