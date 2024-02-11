package searchbinary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchBinary {

    public static void main(String[] args) {
        SearchBinary searchBinary = new SearchBinary();
        List<Integer> array = searchBinary.inputAdd();
        searchBinary.searchBinary(array, 40); 
    }

    public List<Integer> inputAdd() {
        Scanner input = new Scanner(System.in);
        List<Integer> arrayNumbers = new ArrayList<>();

        System.out.println("Digite os números (digite qualquer letra para parar):");

        while (input.hasNextInt()) {
            int inputNumber = input.nextInt();
            arrayNumbers.add(inputNumber);
        }

        return arrayNumbers;
    }

    public Integer searchBinary(List<Integer> arrayNumbers, int item) {
        int low = 0;
        int high = arrayNumbers.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int kick = arrayNumbers.get(mid);

            if (kick == item) {
                return kick;
            } else if (kick < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}
