package com.mycompany.aulavetores;
/**
Criar e coletar em um vetor [30] real e calcular e exibir: 
a. A média do grupo; 
b. A quantidade de notas acima do grupo; 
c. As posições dos valores abaixo da média do grupo. 
* 
@author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
public class Ex4Vetor30 {
    public static void main (String[] args){
        
        int vetor[]= new int[10];
        int i;
        int soma = 0;
        double media;
        int acimaDaMedia = 0;
        
        for (i=1; i<=10; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            
            soma = soma + vetor[i];
        }
        
        media = soma / i;
         
        for (i=1; i<=10; i++){
            if (vetor[i] > media){
                acimaDaMedia = acimaDaMedia +1;
            } 
            else if (vetor[i] < media){
                JOptionPane.showMessageDialog(null, ("O aluno: " + i + " está abaixo da media"));
            }
        }
        JOptionPane.showMessageDialog(null, ("A média do grupo foi: " + media));
    }         
}