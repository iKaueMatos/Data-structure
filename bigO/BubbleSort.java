package bigO;

public class BubbleSort {
    public static void main(String[] args) {
        int[] inArray = { 20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = inArray.length -1; lastUnsortedIndex > 0;lastUnsortedIndex --) {
            for(int processingVariable = 0; processingVariable < lastUnsortedIndex; processingVariable ++) {
                if (inArray[processingVariable] > inArray[processingVariable + 1]) {
                    swap(inArray, processingVariable, processingVariable + 1);
                }
            }
        }

        for (int j = 0; j < inArray.length; j ++) {
            System.out.println(inArray[j]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
