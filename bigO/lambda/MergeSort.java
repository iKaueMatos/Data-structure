package bigO.lambda;

import java.util.Random;
import java.util.stream.IntStream;

public class MergeSort {
    
    // The `main` method is the entry point of the program. It generates an array of random integers using the `IntStream.generate` method and then calls the `mergeSort` method to sort the array using the merge sort algorithm.
    public static void main(String[] args) {
        
        Random random = new Random();
        int numberAleatory = 25;

        int[] vetor = IntStream.generate(() -> random.nextInt(numberAleatory))
        .limit(numberAleatory).toArray();

        int[] subVetor = new int[vetor.length];
        mergeSort(vetor, subVetor, 0, vetor.length - 1);
    }

    /**
     * The function `mergeSort` recursively divides an array into smaller subarrays and then merges them in sorted order.
     * 
     * @param vetor The "vetor" parameter is an array of integers that needs to be sorted using the merge sort algorithm.
     * @param subVetor The parameter "subVetor" is an auxiliary array used for merging the subarrays during the merge sort algorithm. It is used to store the sorted elements temporarily before merging them back into the original array.
     * @param start The starting index of the array or subarray that needs to be sorted.
     * @param theEnd The parameter "theEnd" represents the index of the last element in the subarray that needs to be sorted.
     */
    public static void mergeSort(int[] vetor, int[] subVetor, int start, int theEnd) {
        if (start < theEnd) {
            int middle = (start + theEnd) / 2;
            mergeSort(vetor, subVetor, start, theEnd);
            mergeSort(vetor, subVetor, middle + 1, theEnd);
            intercalate(vetor, subVetor, start, middle, theEnd);
        }
    }

    /**
     * The intercalate function merges two subarrays within a larger array in ascending order.
     * 
     * @param vetor An array of integers that represents the main array.
     * @param subVetor The `subVetor` parameter is an array that contains a subset of elements from the `vetor` array.
     * @param start The starting index of the range in the main array where the subarray should be intercalated.
     * @param middle The parameter "middle" represents the index that divides the subarray into two halves. It is used to determine the starting point of the second half of the subarray.
     * @param theEnd The parameter "theEnd" represents the index of the last element in the array or subarray.
     */
    private static void intercalate(int[] vetor, int[] subVetor, int start, int middle, int theEnd) {
        copyToSubArray(vetor, subVetor, start, theEnd);
        
        int startVariable = start;
        int theEndVariable = middle + 1;
    
        for (int startIsTheEnd = start; startIsTheEnd <= theEnd; startIsTheEnd++) {
            if (startVariable > middle) {
                copyFromSubArray(vetor, subVetor, startIsTheEnd, theEndVariable++);
            } else if (theEndVariable > theEnd) {
                copyFromSubArray(vetor, subVetor, startIsTheEnd, startVariable++);
            } else if (subVetor[startVariable] < subVetor[theEndVariable]) {
                copyFromSubArray(vetor, subVetor, startIsTheEnd, startVariable++);
            } else {
                copyFromSubArray(vetor, subVetor, startIsTheEnd, theEndVariable++);
            }
        }
    }
    
    /**
     * The function copies elements from the source array to the destination array starting from the specified start index and ending at the specified end index.
     * 
     * @param source An array of integers that contains the values to be copied.
     * @param destination The `destination` parameter is an array of integers where the elements from the `source` array will be copied to.
     * @param start The start parameter is the index of the first element in the source array that should be copied to the destination array.
     * @param theEnd The "theEnd" parameter represents the index of the last element in the subarray that needs to be copied.
     */
    private static void copyToSubArray(int[] source, int[] destination, int start, int theEnd) {
        for (int valueVetor = start; valueVetor <= theEnd; valueVetor++) {
            destination[valueVetor] = source[valueVetor];
        }
    }
    
    /**
     * The function copies an element from a source array to a destination array at specified indices.
     * 
     * @param destination The `destination` parameter is an array of integers where the elements from the `source` array will be copied to.
     * @param source The source parameter is an array of integers from which we want to copy elements.
     * @param destinationIndex The index at which the element from the source array will be copied to the destination array.
     * @param sourceIndex The `sourceIndex` parameter is the index of the element in the `source` array that you want to copy to the `destination` array.
     */
    private static void copyFromSubArray(int[] destination, int[] source, int destinationIndex, int sourceIndex) {
        destination[destinationIndex] = source[sourceIndex];
    }
}
