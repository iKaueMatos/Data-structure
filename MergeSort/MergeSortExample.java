package MergeSort;
//Ordenação por intercaão

// divida o vetor ao meio 
//Recursivamente ordene a primeira parte do vetor
//Recursivamente ordena a segunda metade do vetor
//Intercale os dois sub-vetores gerando um vetor ordenado

import java.util.Arrays;

public class MergeSortExample {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
                    // 0,1,2,3,4,5,6,7,8
        int[] vetor = {4,6,7,3,5,1,2,8}; 
        //Armazenando os valores temporarios durante a execução do array
        int[] subVetor = new int[vetor.length];

        mergeSort(vetor, subVetor, 0, vetor.length - 1); // Eliminando o 0 = 1,2,3,4,5,6,7,8

        //Vetor ordenado
        System.out.println(Arrays.toString(vetor));
    }

    /**
     * @param vetor
     * @param subVetor
     * @param start
     * @param theEnd
     */
    private static void mergeSort(
        int[] vetor, 
        int[] subVetor, 
        int start, 
        int theEnd
        ) {
        //Enquanto o inicio for menor que o fim
        if (start < theEnd) {
            int middle = (start + theEnd) / 2;
            //Ordenando do inicio até o meio do vetor
            mergeSort(vetor, subVetor, start, middle);
            mergeSort(vetor, subVetor, middle + 1, theEnd);
            intercalary(vetor, subVetor, start, middle, theEnd);
        }  
    }

    /**
     * @param vetor
     * @param subVetor
     * @param start
     * @param middle
     * @param theEnd
     */
    private static void intercalary(
        int[] vetor, 
        int[] subVetor, 
        int start, 
        int middle, 
        int theEnd
        ) {
        for (int valueVetor = start; valueVetor <= theEnd; valueVetor++) {
            subVetor[valueVetor] = vetor[valueVetor];
        }
    
        int startVariable = start;
        int theEndVariable = middle + 1;
    
        // Vai do inicio até o fim do vetor
        for (int startIsTheEnd = start; startIsTheEnd <= theEnd; startIsTheEnd++) {
            if (startVariable > middle) {
                vetor[startIsTheEnd] = subVetor[theEndVariable++];
            } else if (theEndVariable > theEnd) {
                vetor[startIsTheEnd] = subVetor[startVariable++];
            } else if (subVetor[startVariable] < subVetor[theEndVariable]) {
                vetor[startIsTheEnd] = subVetor[startVariable++];
            } else {
                vetor[startIsTheEnd] = subVetor[theEndVariable++];
            }
        }
    }
}
