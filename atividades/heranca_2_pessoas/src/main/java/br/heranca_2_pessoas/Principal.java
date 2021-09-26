/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.heranca_2_pessoas;

/**
 *
 * @author rafael
 */
public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(345678);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(344);
        b1.setNome("Jubileu");
        b1.setBolsa(15.4f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
    }
}
