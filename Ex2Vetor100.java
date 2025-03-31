package com.mycompany.aulavetores;

import javax.swing.JOptionPane;

/**
Criar e coletar um vetor [100] inteiro e exibir: 
a. O maior e o menor valor; 
b. A média dos valores. 

@author FATEC ZONA LESTE
 */
public class Ex2Vetor100 {
    public static void main (String[] args){
    
        int vetor[] = new int[100];
        int i, maior, menor;
        int soma = 0;
        double media;
        
        vetor[0] = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número."));
        maior = vetor[0];
        menor = vetor[0];
        soma = vetor[0];
        
        for (i = 1; i < 99; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
            soma = soma + vetor[i];
            
            if (vetor[i] > maior){
                maior = vetor[i];
            }
            else if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        
        media = soma / 100.0;
        
        JOptionPane.showMessageDialog(null, ("O maior número digitado foi " + maior + 
                                             "\n O menor número digitado foi: " + menor));
        
        JOptionPane.showMessageDialog(null, ("A media dos valores digitados foi: " + media));
    }   
}