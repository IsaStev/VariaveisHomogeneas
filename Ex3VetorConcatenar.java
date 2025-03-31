package com.mycompany.aulavetores;

// @author FATEC ZONA LESTE

// Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar 
// esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex: 
// VT1| 1| 2| 3|       |VT2| 4| 5| 6|      |VT3| 1| 2| 3| 4| 5| 6 

import javax.swing.JOptionPane;
public class Ex3VetorConcatenar {

    public static void main (String[] args){

        int vetor1[] = new int [3];
        int vetor2[] = new int [3];
        int vetor3[] = new int [6];
        int i;
        String resultado;

        for (i = 0; i < 3; i++){
                vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite números: "));
                vetor3[i] = vetor1[i];
        }

        for (i = 0; i < 3; i++){
           vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite números: "));
            vetor3[i + 3] = vetor2[i];
        }

        resultado = "VT1: ";
        for (i = 0; i < 3; i++){
            resultado = resultado + vetor1[i] + " ";
        }

        resultado = resultado + "\nVT2: ";
        for (i=0; i < 3; i++){
            resultado = resultado + vetor2[i] + " ";
        }

        resultado = resultado + "\nVT3: ";
        for(i = 0; i < 6; i++){
            resultado = resultado + vetor3[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}