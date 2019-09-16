public class HeapSort extends Sort{
    public void sort(int[] array) {
        System.out.println("----HEAP SORT----");
        System.out.println("Time Complexity: O(nLogN)");
        System.out.println("Original Array");
        printArray(array);


        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        System.out.println("Sorted Array");
        printArray(array);
    }

    private void heapify(int[] array, int n, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        //We are bubbling up the larger numbers
        //Therefore we have to check if the children of this current index (node in the array)
        //are greater than its parent at the int index
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        //if the largest ended up being a child node...
        if (largest != index) {
            //switch the parent and the largest child
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);

        }
    }
}
