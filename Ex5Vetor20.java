package com.mycompany.aulavetores;
// Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
// 10
// ∑ (A[1] – A[21–1])
// i = 1


// @author FATEC ZONA LESTE

import javax.swing.JOptionPane;


public class Ex5Vetor20 {
    public static void main (String[]args){
    
        int vetor[] = new int[20];
        int i;
        int soma = 0;
        
        for(i = 0; i < 20; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a posição " + i));
        }
        
        for(i = 0; i < 10; i++){
            soma = soma + (vetor[i] - vetor[19-i]);
        }
        
        JOptionPane.showMessageDialog(null,"A soma é: " + soma);
    }
}