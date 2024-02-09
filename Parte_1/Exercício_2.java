package Parte_1;

import java.util.Scanner;

public class Exercício_2 {

    public static void main (String [] args) throws Exception{

        /* Parametros */
        double pi = 3.14159;
        double raio;
        double area;

        /* Entrada */
        System.out.printf("Insira a seguir o raio do circulo: ");
        Scanner scanner = new Scanner (System.in);
        raio = scanner.nextFloat();

        scanner.close();

        /* Processo */
        area = pi * (Math.pow(raio,2));

        /* Saida */
        System.out.printf("%nA area do circulo sera %.4f !",area);
        

    }
}
