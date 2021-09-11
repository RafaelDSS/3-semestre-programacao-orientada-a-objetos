/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.conta_bancaria;

/**
 *
 * @author rafael
 */
public class Cliente {
    public static void main(String[] args) {
        Conta cliente = new Conta();
        cliente.setNumeroConta(432349393);
        cliente.setDono("João");
        cliente.abrirConta("CC");
        cliente.extrato();
        
    }
}
