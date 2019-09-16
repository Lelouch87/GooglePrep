class MergeSort extends Sort{
    private void merge(int[] array, int left, int right, int midpoint) {
        int leftArraySize = midpoint - left + 1;
        int rightArraySize = right - midpoint;
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];
        //Copied all data over into temporary arrays
        for (int i = 0; i < leftArraySize; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < rightArraySize; ++i) {
            rightArray[i] = array[midpoint + 1 + i];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedArrayIndex = left;
        while (leftIndex < leftArraySize && rightIndex < rightArraySize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mergedArrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[mergedArrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mergedArrayIndex++;
        }

        while(leftIndex < leftArraySize) {
            array[mergedArrayIndex] = leftArray[leftIndex];
            leftIndex++;
            mergedArrayIndex++;
        }
        while (rightIndex < rightArraySize) {
            array[mergedArrayIndex] = rightArray[rightIndex];
            rightIndex++;
            mergedArrayIndex++;
        }
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int midpoint = (left + right) / 2;

            sort(array, left, midpoint);
            sort(array, midpoint+1, right);

            merge(array, left, right, midpoint);
        }
    }

    public void sort(int[] array) {
        System.out.println("----MERGE SORT----");
        System.out.println("Time Complexity: O(nLogN)");
        System.out.println("Original Array");
        printArray(array);
        sort(array, 0, array.length-1);
        System.out.println("Sorted Array");
        printArray(array);
    }
}
