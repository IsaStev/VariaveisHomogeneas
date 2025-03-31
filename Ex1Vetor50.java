package com.mycompany.aulavetores;

 //@author FATEC ZONA LESTE
//Criar e coletar um vetor [50] inteiro. Calcular e exibir: 
//a. A média dos valores entre 10 e 200; 
//b. A soma dos números ímpares. 

import javax.swing.JOptionPane;
public class Ex1Vetor50 {
    
    public static void main (String[] args){
        
        int vetor[] = new int[50];
        int i;
        int soma = 0;
        int somaImpares = 0;
        int cta = 0;
        double media = 0.0;
        
        for (i = 0; i < 50; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
            
            if (vetor[i] >= 10 && vetor[i] <= 200){
                soma = soma + vetor[i];
                cta = cta + 1;
                
            }
            
            
            if (vetor [i] % 2 != 0){
                somaImpares = somaImpares + vetor[i];
            }
            
            if (cta > 0){
                media = soma / (double) cta;
            }
            
        }
        
        JOptionPane.showMessageDialog(null, ("A média dos valores digitados entre 10 e 200 é: " + media + 
                                             "\n A soma dos numeros impares é: " + somaImpares));
    }
}
