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
public class Ave extends Animal {
    
    Ave(){
        this.setClasse("Ave");
    }
    
    @Override
    public void falar() {
        System.out.println("piu, piu");
    }
    
    public void voar(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("voando");
        }
    }
}
