abstract class Sort {
    abstract void sort(int[] array);
    final void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
