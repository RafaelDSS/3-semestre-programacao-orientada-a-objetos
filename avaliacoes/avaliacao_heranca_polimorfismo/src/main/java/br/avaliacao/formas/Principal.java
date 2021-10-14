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
public class Principal {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        
        formas[0] = new Retangulo(12, 20);
        formas[1] = new Circulo(30);
        formas[2] = new Quadrado(20);
        
        for (Forma forma: formas) {
            float area = forma.calcularArea();
            System.out.println("Área: " + area);
            float perimetro = forma.calcularPerimetro();
            System.out.println("Perimetro: " + perimetro);
            System.out.println("===================");
        };
    }
}
