/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle_remoto;

/**
 *
 * @author rafael
 */
public class Controle {
    
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.abrirMenu();
    }
}
