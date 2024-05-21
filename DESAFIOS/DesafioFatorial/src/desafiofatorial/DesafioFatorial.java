/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package desafiofatorial;

import java.util.Scanner;

//Importação do SCANNER para leitura de DADOS

/**
 *
 * @author Aluno
 */
public class DesafioFatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite um valor: ");
        int valor_a_ser_fatorado = scanner.nextInt();
        
        int fatorial = valor_a_ser_fatorado;
        
        for(int i = valor_a_ser_fatorado-1; i > 0; i--) {
            fatorial *= i;
            System.out.println("Fatorial: "+ fatorial+ "\n Contado: "+ i+"\n");
        }
        
        System.out.println("\n1O seu número fatorado é: "+fatorial);
    }
    
}
