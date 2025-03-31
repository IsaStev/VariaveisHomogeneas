package com.mycompany.aulavetores;

/**
 *
 * @author Isabela PC
 */

import javax.swing.JOptionPane;
public class Ex6VetorBubleSort {
    public static void main(String[] args){
        
        int vetor1[]= new int[20];
        int i, j, aux;
        String resultado = " ";
        
        for(i = 0; i < 20; i++){
            vetor1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o números aleatórios."));
        }
        
        for(i = 0; i < 19; i++){
            for (j = 0; j < 19-i; j++){
                
                if(vetor1[j] > vetor1[j + 1]){
                    aux = vetor1[j];
                    vetor1[j] = vetor1[j+1];
                    vetor1[j+1] = aux;
                }
            }
        }
        
        for(j = 0; j < 20 ; j++){
            resultado = resultado + vetor1[j] + ", ";
        }
        
        JOptionPane.showMessageDialog(null, ("O vetor classificado em ordem crescente é: " + resultado));
        
    }
}
