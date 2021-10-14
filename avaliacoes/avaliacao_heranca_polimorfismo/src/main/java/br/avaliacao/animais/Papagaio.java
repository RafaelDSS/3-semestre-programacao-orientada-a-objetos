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
public class Papagaio extends Ave {
    private String vocabulario;

    public Papagaio() {
        this.setVocabulario("Sons de papagaio");
    }

    public String getVocabulario() {
        return vocabulario;
    }

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
    
    @Override
    public void falar() {
        System.out.println(this.getVocabulario());
    }
}
