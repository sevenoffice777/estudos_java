/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocontroledefluxo;

/**
 *
 * @author Aluno
 */
public class ExercicioControleDeFluxo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Escreva um programa que imprime todos os números de 1 a 100 que são múltiplos de 3.
        for(int i = 0; i <= 100; i++) {
            if(i%3 == 0) {
                System.out.println(i + " é Divisivel por 3 \n");
            } else {
                System.out.println(i +" não é Divisivel por 3 \n");
            }
                
        }
    }
    
}
