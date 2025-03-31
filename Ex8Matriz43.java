package com.mycompany.aulavetores;

import javax.swing.JOptionPane;

public class Ex8Matriz43 {
    public static void main(String[] args) {
        int vendas[][] = new int[4][3]; // 4 semanas x 3 produtos
        int i, j;
        String resultado = "";

        // Preenchendo a matriz com entrada do usuário
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                vendas[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite a quantidade vendida do produto " + (j + 1) + " na semana " + (i + 1) + ":"));
            }
        }

        // a. Quantidade de cada produto vendido no mês
        int totalProduto[] = new int[3]; 
        for (j = 0; j < 3; j++) {
            for (i = 0; i < 4; i++) {
                totalProduto[j] += vendas[i][j];
            }
        }

        resultado += "Quantidade total vendida por produto no mês:\n";
        for (j = 0; j < 3; j++) {
            resultado += "Produto " + (j + 1) + ": " + totalProduto[j] + "\n";
        }

        // b. Quantidade de produtos vendidos por semana
        int totalSemana[] = new int[4]; 
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                totalSemana[i] += vendas[i][j];
            }
        }

        resultado += "\nQuantidade total vendida por semana:\n";
        for (i = 0; i < 4; i++) {
            resultado += "Semana " + (i + 1) + ": " + totalSemana[i] + "\n";
        }

        // c. Total de produtos vendidos no mês
        int totalMes = 0;
        for (i = 0; i < 4; i++) {
            totalMes += totalSemana[i];
        }

        resultado += "\nTotal de produtos vendidos no mês: " + totalMes;

        // Exibir resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
