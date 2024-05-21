/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosomade1a10;

/**
 *
 * @author Aluno
 */
public class ExercicioSomaDe1a10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escreva um programa que calcula a soma dos números de 1 a 10.
        
        int soma = 0;
        
        for(int i = 0; i <= 10; i++) {
           soma += i;
           
           System.out.println(soma+"\n");
        }
        
        System.out.println(soma);
    }
    
}
