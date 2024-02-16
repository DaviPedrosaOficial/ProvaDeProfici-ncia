package Parte_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercício_6 {
    
    public static void main (String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        int len;
        int parametro = 0;
        List<Numeros> cliente = new ArrayList<>();
        
        System.out.printf("%n-------- Entre 10 e 20 -------");
        System.out.printf("%nInsira a seguir a quantidade de numeros que serão averiguados: ");
        len = scanner.nextInt();

        System.out.printf("%nAgora insira os numeros de sua escolha: ");

        while (parametro <= len){
            cliente.add(new Numeros(scanner.nextInt()));
        }

        for (Numeros num: cliente){
            
        }
        

    }
}
