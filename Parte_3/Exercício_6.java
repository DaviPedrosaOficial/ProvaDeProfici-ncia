package Parte_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercício_6 {
    
    public static void main (String [] args) throws Exception{

        /* Variaveis */
        int len;
        int parametro = 1;
        int in = 0;
        int out = 0;

        /* Lista para armazenar os numeros de entrada */
        List<Numeros> cliente = new ArrayList<>();

        /* Abrindo o scanner de entrada (input) */
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("%n-------- Entre 10 e 20 -------");
        System.out.printf("%nInsira a seguir a quantidade de numeros que serão averiguados: ");
        len = scanner.nextInt();

        System.out.printf("%nAgora insira os numeros de sua escolha: ");

        /* Condicional que adicionará os numeros inseridos pelo cliente a lista de numeros */
        while (parametro <= len){
            cliente.add(new Numeros(scanner.nextInt()));
            parametro += 1;
        }

        /* Fechando o scanner */
        scanner.close();

        /* Condicional que medirá se o numero esta entre 10 e 20, e caso estejam ou não, notificara as respectivas variaveis */
        for (Numeros num: cliente){
            if (num.getNum() >= 10 && num.getNum() <=20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.printf("%n%nNos %d numeros escolhidos por você, %d está(ão) dentre 10 e 20, e %d está(ão) fora do parametro.",len,in,out);
    
    }
}
