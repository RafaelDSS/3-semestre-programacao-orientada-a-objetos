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
public class Circulo extends Forma {
    private float raio;

    public Circulo(float raio) {
        this.setRaio(raio);
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(this.getRaio(), 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * this.getRaio());
    }
    
    public float calcularDiametro() {
        return 2 * this.getRaio();
    }
    
}
