package merge;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftSubarray = new int[n1];
        int[] rightSubarray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftSubarray[i] = array[left + i];
        }
        
        for (int j = 0; j < n2; j++) {
            rightSubarray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                array[k] = leftSubarray[i];
                i++;
            } else {
                array[k] = rightSubarray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftSubarray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightSubarray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Insira um numero: ");
                array[i] = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Insira um número inteiro.");
                input.next(); 
                i--; 
            }
        }

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
