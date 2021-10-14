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
public class Vaca extends Mamifero {
    private boolean permiteOrdenha;

    public boolean isPermiteOrdenha() {
        return permiteOrdenha;
    }

    public void setPermiteOrdenha(boolean permiteOrdenha) {
        this.permiteOrdenha = permiteOrdenha;
    }
    
    public void ordenhar() {
        if (this.isPermiteOrdenha()) {
            System.out.println("ordenhando");
        }
    }
    
    @Override
    public void falar() {
        System.out.println("Muuuu");
    }
}
