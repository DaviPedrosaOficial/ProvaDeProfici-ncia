package Parte_2;

import java.util.Scanner;

public class Exercício_4 {
    
    public static void main (String [] args) throws Exception{

        double a;
        double b;
        double c;
        
        Scanner scanner = new Scanner(System.in);

        /* Coeficiente A */
        System.out.printf("%n-------- Resolvendo equações de segundo grau --------");
        System.out.printf("%n%nDigite o valor desejado para o coeficiente 'a': ");
        a = scanner.nextDouble();

        /* Coeficiente B */
        System.out.printf("%nDigite o valor desejado para o coeficiente 'b': ");
        b = scanner.nextDouble();

        /* Coeficiente C */
        System.out.printf("%nDigite o valor desejado para o coeficiente 'c': ");
        c = scanner.nextDouble();

        scanner.close();

        /* Processamento */
        double x1 = (-b + (Math.sqrt((Math.pow(b,2))-4*(a*c)))) / (2*a);
        double x2 = (-b - (Math.sqrt((Math.pow(b,2))-4*(a*c)))) / (2*a);

        if (a == 0){
            System.out.printf("%nImpossivel calcular!");
        }
        else if ((Math.sqrt((Math.pow(b,2))-4*(a*c))) < 0){
            System.out.printf("%nImpossivel calcular!");
        }
        else {
            System.out.printf("%nX1 = %.5f %nX2 = %.5f",x1,x2);
        }
        
    }
    
}
