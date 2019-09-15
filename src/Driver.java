import java.util.Random;


public class Driver {
    public static void main(String[] args) {
        int[] intArray = generateIntArray(10);

        //BUBBLE SORT
        BubbleSort bs = new BubbleSort();
        bs.sort(intArray);
        //SELECTION SORT
        intArray = generateIntArray(10);
        SelectionSort ss = new SelectionSort();
        ss.sort(intArray);
        //INSERTION SORT

        //QUICK SORT
        intArray = generateIntArray(15);
        System.out.println("----QUICK SORT----");
        System.out.println("Time Complexity: O(nLogN)");
        System.out.println("Original Array");
        printArray(intArray);
        MergeSort ms = new MergeSort();
        ms.sort(intArray, 0 , intArray.length-1);
        System.out.println("Sorted Array");
        printArray(intArray);

    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] generateIntArray(int size) {
        size -= 1;
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            int n = rand.nextInt(50);
            n+=1;
            intArray[i] = n;
        }
        return intArray;
    }

}
