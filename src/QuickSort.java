import java.util.Random;

public class QuickSort extends Sort{
    public void sort(int[] array) {
        System.out.println("----QUICK SORT----");
        System.out.println("Time Complexity: O(nLogN)");
        System.out.println("Original Array");
        printArray(array);
        sort(array, 0, array.length-1);
        System.out.println("Sorted Array");
        printArray(array);
    }

    private void sort(int[] array, int low , int high) {
        if (low < high+1) {
            int p = partition(array, low, high);
            sort(array, low, p-1);
            sort(array, p+1, high);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition(int[] array, int low, int high) {
        swap(array, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (array[i] < array[low]) {
                swap(array, i, border++);
            }
        }
        swap(array, low, border-1);
        return border-1;
    }



}
