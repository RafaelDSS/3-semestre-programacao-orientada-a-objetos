/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class JOptionPaneInfos {

    public static void main(String args[]) {
        int quantidadeValores = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int quantidadeValoresAcima100 = 0;
        int somaValores = 0;
        int mediaValores = 0;

        while (true) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número\n(0 interrompre):"));

            if (valor == 0) {
                break;
            }

            quantidadeValores++;
            somaValores = somaValores + valor;

            // Incrementa a quantidade de valores pares e ímpares.
            if (valor % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }

            // Incrementa a quantidade de valores acima de 100.
            if (valor > 100) {
                quantidadeValoresAcima100++;
            }
        }

        // Verifica se a quantidade de valores é diferente de zero, para que não ocorra divisão por zero.
        if (quantidadeValores != 0) {
            mediaValores = somaValores / quantidadeValores;
        } else {
            mediaValores = 0;
        }

        JOptionPane.showMessageDialog(
                null,
                String.format(
                        "Total de valores: %d\n"
                        + "Total de pares: %d\n"
                        + "Total de ímpares: %d\n"
                        + "Acima de 100: %d\n"
                        + "Média dos valores: %d",
                        quantidadeValores,
                        totalPares,
                        totalImpares,
                        quantidadeValoresAcima100,
                        mediaValores
                )
        );
    }
}
