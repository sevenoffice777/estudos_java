/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestruturasfluxo;

/**
 *
 * @author Aluno
 */
public class ProjetoEstruturasFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estrutura De Condição
        // IF e IF/ELSE
        int numero = 10;

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo ou zero");
        }

        // IF/ELSE E IF/ELSE (CADEIA)
        int nota = 85;
        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        // SWITCH
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            // Outros cases...
            default:
                System.out.println("Dia inválido");
                break;
        }

        // WHILE
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // DO-WHILE
        int cont = 0;
        do {
            System.out.println("Contador: " + cont);
            cont++;
        } while (cont < 5);

        // FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

    }

}
