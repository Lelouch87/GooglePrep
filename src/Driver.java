import java.util.Random;


public class Driver {
    public static void main(String[] args) {
        int[] intArray = generateIntArray(10);

        //BUBBLE SORT
        bubbleSort(intArray);
        //SELECTION SORT
        intArray = generateIntArray(10);
        selectionSort(intArray);
        //INSERTION SORT

    }

    private static void bubbleSort(int[] array) {
        System.out.println("----BUBBLE SORT----");
        System.out.println("Time Complexity: O(n)^2");
        System.out.println("Original Array");
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1;j ++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        printArray(array);
    }

    private static void selectionSort(int[] array) {
        System.out.println("----INSERTION SORT----");
        System.out.println("Time Complexity: O(n)^2");
        System.out.println("Original Array");
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j+1] < array[minIndex]) {
                    minIndex = j+1;

                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println("Sorted Array");
        printArray(array);
    }

    private static void insertionSort(int[] array) {
        System.out.println("----SELECTION SORT----");
        System.out.println("Time Complexity: ");
        System.out.println("Original Array");
        printArray(array);




        System.out.println("Sorted Array");
        printArray(array);
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
