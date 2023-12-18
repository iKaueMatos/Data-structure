package Trainne;

import java.util.Scanner;

//2 - Escreva um programa que calcule a media aritmetica de dois numeros

public class solution2 {
    public static void main(String[] args) throws Exception {
        Scanner enter = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int valueOne = enter.nextInt();

        System.out.println("Digite o segundo numero: ");
        int valueTwo = enter.nextInt();

        if(valueOne == 0 || valueTwo == 0) {
            throw new Exception("numero vazios por favor preecha os campos");
        }

        int media  = (valueOne + valueTwo ) / 2;
        System.out.println(media);
    }
}
