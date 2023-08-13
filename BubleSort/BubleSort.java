package BubleSort;

import java.util.Arrays;

//Metodo bolha

//Percorra o vetor e execute as opera;o~es a seguir
//Tome seus elementos dois a dois adjacentes
//se os elementos não estão em ordem ,então ordene
//Senão, avance para o proximo par
//repita a opera;ão até que nenhuma troca possa ser feita no veotr inteiro
public class BubleSort {
    public static void main( String[] args) {
        int[] vetor = {55,55,60,66,643,66,444,33,1,2,3,4,5,6,7,8,10,9,10};
        blister(vetor);

        System.out.println(Arrays.toString(vetor));
    }
    
    /**
     * @param vetor
     */
    private static void blister(int[] vetor) {
        //Enquanto last tiver elementos no vetor para serem avaliados 
        //continue percorrendo e decrementando o valor que esta dentro do vetor
        for (int last = vetor.length - 1; last > 0; last --) {
            for (int processingVariable = 0; processingVariable < last; processingVariable++ ) {
                //enquanto o vetor for maior que vetor de processamento ele ira trocar
                // que estão dentro do vetor
                if (vetor[processingVariable] > vetor[processingVariable + 1]) {
                    swapTheElements(vetor, processingVariable, processingVariable +1 );
                }
            }
        }
    }

    /**
     *  variavel auxiliar recebe o valor do vetor de processamento e faz
     *  uma substituição dos valores de processamento sub
     *  logo em seguido armazena  na variavel auxiliar em tempo de mémoria
     * @param vetor
     * @param processingVariable
     * @param processingVariableSub
     */
    public static void swapTheElements(
        int[]vetor, 
        int processingVariable, 
        int processingVariableSub
        ) {
        int auxiliary = vetor[processingVariable];
        vetor[processingVariable] = vetor[processingVariableSub];
        vetor[processingVariableSub] = auxiliary;
    }
}
