/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosintaxebasica;

/**
 *
 * @author Samuel Seven
 */
public class ProjetoSintaxeBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade  = 25;
        
        System.out.println(idade);
        
        double salario = 3500.50;
        boolean isEstudante = true;
        char inicial = 'S';

        // Operadores aritméticos
        int soma = idade + 5; // 22
        double metadeSalario = salario / 2; // 1750.25

        // Operadores de comparação
        boolean maiorDeIdade = idade >= 18; // false
        boolean salarioAlto = salario > 3000; // true

        // Operadores lógicos
        boolean isJovemEstudante = isEstudante && !maiorDeIdade; // true

        // Expressões
        double ajusteSalario = (salario * 1.10) - 200; // 3700.55

        // Saída
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Estudante: " + isEstudante);
        System.out.println("Inicial: " + inicial);
        System.out.println("Soma: " + soma);
        System.out.println("Metade do salário: " + metadeSalario);
        System.out.println("Maior de idade: " + maiorDeIdade);
        System.out.println("Salário alto: " + salarioAlto);
        System.out.println("Jovem estudante: " + isJovemEstudante);
        System.out.println("Ajuste de salário: " + ajusteSalario);
             
    }
    
// Tipos Primitivos:
//  byte: 8 bits, inteiros de -128 a 127
//  short: 16 bits, inteiros de -32,768 a 32,767
//  int: 32 bits, inteiros de -2^31 a 2^31-1
//  long: 64 bits, inteiros de -2^63 a 2^63-1
//  float: 32 bits, ponto flutuante de precisão simples
//  double: 64 bits, ponto flutuante de precisão dupla;
//  char: 16 bits, um único caractere Unicode;
//  boolean: true ou false
    
    
}
