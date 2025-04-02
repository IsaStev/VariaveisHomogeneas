package com.mycompany.aulavetores;
import javax.swing.JOptionPane;

public  class Ex8Matriz43{
    public static void main (String [] args){
    
        int vendas[][] = new int [4][3];
        int i, j;
        int totalProdutos[] = new int[3];
        int totalSemanas[] = new int[4];
        int totalMes = 0;
        String resultado = "";
        
        
        //Entrada de dados
        for (i = 0; i < 4; i++){
            for(j = 0; j <3; j++){
                
                vendas[i][j] = Integer.parseInt(JOptionPane.showInputDialog ("Digite a quantidade vendida do produto " + (j+1) + " na semana " + (i+1) + ":"));
            }
        }
        
        //Quantodade ventida por produto
        for(j = 0; j < 3; j++){
            for(i = 0; i < 4; j++){
                totalProdutos[j] = totalProdutos[j] + vendas[i][j];
                
            }
        }
        
        resultado = resultado + "Quantidade total vendida por produto no mes: \n";
        for(j = 0; j < 3; j++){
            resultado = resultado + "Produto " + (j + 1) + ": " + totalProdutos[j] + "\n";
            
        }
    
        //Quantodade vendida por semana
        for (i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                totalSemanas[i] = totalSemanas[i] + vendas[i][j];
                
            }
        }
        
        resultado = resultado + "Quantidade total vendida por semana no mes: \n";
        for(i = 0; i < 4; i++){
            resultado = resultado + "Semana " + (i + 1) + ": " + totalSemanas[i] + "\n";
            
        }
        
        //Total mes
        for (i = 0; i< 4; i ++){
            totalMes = totalMes + totalSemanas[i];
            
        }
        
        resultado = resultado + "\n Total de produtos vendidos no mês: " + totalMes;
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
