/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.avaliacao.formas;

/**
 *
 * @author rafael
 */
public class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.setLado(lado);
        this.setAltura(altura);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.getLado() * this.getAltura();
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (this.getLado() + this.getAltura());
    }
    
}
