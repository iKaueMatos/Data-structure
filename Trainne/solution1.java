package Trainne;

import java.util.Scanner;

// 1 - escreva para o usuario um programa que peça dois numeros e exiba a soma a multiplicação e a divisão entre eles

public class solution1 {
    public static void main(String[] args) throws Exception {
        Scanner enter = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero: ");
        int valueOne = enter.nextInt();

        System.out.println("Digite seu segundo numero: ");
        int valueTwo = enter.nextInt();

        System.out.println("Digite o numero do operador que você deseja utilizar para fazer o calculo: \n");
        System.out.println("1- Adição +");
        System.out.println("2 - Subtração -");
        System.out.println("3 - multiplicação x");
        System.out.println("4 - Divisão /");
        int operator = enter.nextInt();

        if (valueOne == 0 && valueTwo == 0 && operator == 0) {
            return;
        }

        if (operator > 4) {
            throw new Exception("Digite um operador valido para continuar! ");
        }

        switch ((int) operator) {
            case 1:
                System.out.println("Resultado:");
                System.out.println(valueOne + valueTwo);
                break;
            case 2:
                System.out.println("Resultado: ");
                System.out.println(valueOne - valueTwo);
                break;
            case 3:
                System.out.println("Resultado: ");
                System.out.println(valueOne * valueTwo);
                break;
            case 4:
                System.out.println("Resultado: ");
                System.out.println(valueOne / valueTwo);
                break;
            default:
                break;
        }
    }
}
