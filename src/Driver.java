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
        intArray = generateIntArray(10);
        InsertionSort is = new InsertionSort();
        is.sort(intArray);
        //MERGE SORT
        intArray = generateIntArray(15);
        MergeSort ms = new MergeSort();
        ms.sort(intArray);
        //QUICK SORT
        intArray = generateIntArray(20);
        QuickSort qs = new QuickSort();
        qs.sort(intArray);
        //HEAP SORT
        intArray = generateIntArray(10);
        HeapSort hs = new HeapSort();
        hs.sort(intArray);

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
