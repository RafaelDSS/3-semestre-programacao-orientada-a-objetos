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
public class Cachorro {
    private boolean tipoLatido;

    public boolean isTipoLatido() {
        return tipoLatido;
    }

    public void setTipoLatido(boolean tipoLatido) {
        this.tipoLatido = tipoLatido;
    }
    
    public void setLateAlto() {
        this.setTipoLatido(true);
    }
    
     public void setLateBaixo() {
        this.setTipoLatido(false);
    }
     
    public void falar() {
        if (this.isTipoLatido()) {
            System.out.println("AU, AU");
        } else {
            System.out.println("au, au");
        }
    }
    
}
