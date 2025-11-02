import java.util.Arrays;

/**
 * A demonstration class covering multiple data structure and algorithm examples:
 * - Dynamic Array
 * - Searching algorithms (Linear, Binary, Interpolation)
 * - Sorting algorithms (Insertion, Selection, Bubble)
 * - Recursion
 *
 * Each section is self-contained and well-documented for learning purposes.
 */
public class Test {

    public static void main(String[] args) {

        /* ============================================================
         *                  🧱 Dynamic Array Example
         * ============================================================
         *
         * Demonstrates adding, inserting, deleting, and searching in
         * a custom dynamic array implementation.
         *
         * DynamicArray dynamicArray = new DynamicArray();
         * dynamicArray.add("A");
         * dynamicArray.add("B");
         * dynamicArray.add("C");
         * dynamicArray.delete("C");
         * dynamicArray.insert(2, "M");
         *
         * System.out.println(dynamicArray.search("G"));
         * System.out.println(dynamicArray);
         * System.out.println("Size: " + dynamicArray.size);
         * System.out.println("Capacity: " + dynamicArray.capacity);
         * System.out.println("Is Empty: " + dynamicArray.isEmpty());
         */

        /* ============================================================
         *                  🔍 Linear Search
         * ============================================================
         *
         * Definition:
         * Linear search iterates through a collection one element at a time
         * until the target element is found.
         *
         * 🔹 Time Complexity: O(n)
         *
         * ✅ Advantages:
         *   - Simple to implement
         *   - Works for unsorted collections
         *   - Ideal for small or medium datasets
         *
         * ❌ Disadvantages:
         *   - Inefficient for large datasets
         *
         * Example:
         *
         * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         * int index = linearSearch(array, 5);
         *
         * if (index != -1)
         *     System.out.println("Element found at index " + index);
         * else
         *     System.out.println("Element not found");
         */
        int []array={8,9,7,6,5,4,2,3,1};
        mergeSort(array);
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
    /* ============================================================
     *                   Merge sort
     * ============================================================
     *
     * Merge Sort is an efficient, comparison-based sorting algorithm that employs the divide and conquer strategy.
     * It was invented by John von Neumann in 1945.
     *
     * run-time complexity O(n log(n))
     * space complexity O(n)
     */
    private static void mergeSort(int[] array) {
        int length=array.length;
        if (length<=1)return;//base case
        int middle = length/2;
        int []leftArray=new int[middle];
        int []rightArray=new int[length-middle];
        int i=0;
        int j=0;
        for(;i<length;i++){
            if (i<middle) {
                leftArray[i]=array[i];
            }else{
                rightArray[j]=array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }
    private static void merge( int[] leftArray,int[]rightArray,int[]array) {
         int leftSize=array.length/2;
         int rightSize=array.length-leftSize;
         int i=0,l=0,r=0;
         while (r<rightSize && l<leftSize) {
             if (leftArray[l] < rightArray[r]) {
                 array[i]=leftArray[l];
                 i++;
                 l++;
             }else{
                 array[i]=rightArray[r];
                 i++;
                 r++;
             }
         }
         while (r<rightSize){
             array[i]=rightArray[r];
             i++;
             r++;
         }
         while (l<leftSize){
             array[i]=leftArray[l];
             i++;
             l++;
         }
    }

    /**
     * Performs a linear search in an integer array.
     */
    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    /* ============================================================
     *                  ⚙️ Binary Search
     * ============================================================
     *
     * Definition:
     * Binary Search is a fast searching algorithm used on sorted arrays.
     * It repeatedly divides the search range in half.
     *
     * 🔹 Time Complexity: O(log n)
     *
     * ✅ Advantages:
     *   - Much faster than linear search for large datasets
     *   - Easy to implement with loops or recursion
     *
     * ❌ Disadvantages:
     *   - Requires sorted data
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle;
        }
        return -1;
    }

    /* ============================================================
     *                  🔁 Recursion Example
     * ============================================================
     *
     * Recursion in Java is a technique where a method calls itself
     * to solve smaller subproblems.
     *
     * ✅ Advantages:
     *   - Easier to write and read
     *   - Elegant for problems like factorial, Fibonacci, etc.
     *
     * ❌ Disadvantages:
     *   - Higher memory usage (stack)
     *   - Slower for very deep recursions
     */
    private static int factorial(int num) {
        if (num < 1) return 1;
        return num * factorial(num - 1);
    }

    /* ============================================================
     *                  🧩 Insertion Sort
     * ============================================================
     *
     * Description:
     * Builds a sorted array one item at a time by inserting elements
     * into their correct position.
     *
     * 🔹 Time Complexity: O(n²)
     * 🔹 Best Case: O(n)
     *
     * ✅ Good for small datasets
     * ❌ Inefficient for large datasets
     */
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    /* ============================================================
     *                  🔽 Selection Sort
     * ============================================================
     *
     * Description:
     * Repeatedly selects the minimum element from the unsorted part
     * and moves it to the beginning.
     *
     * 🔹 Time Complexity: O(n²)
     *
     * ✅ Simple and easy to understand
     * ❌ Not efficient for large datasets
     */
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    /* ============================================================
     *                  💨 Bubble Sort
     * ============================================================
     *
     * Description:
     * Repeatedly compares adjacent elements and swaps them
     * if they are in the wrong order.
     *
     * 🔹 Time Complexity: O(n²)
     *
     * ✅ Easy to implement
     * ❌ Very inefficient for large datasets
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /* ============================================================
     *                  🎯 Interpolation Search
     * ============================================================
     *
     * Description:
     * Improved searching algorithm for sorted, uniformly distributed arrays.
     * It estimates the position of the target value based on its value.
     *
     * 🔹 Time Complexity:
     *   - Best: O(log(log n))
     *   - Worst: O(n)
     *
     * ✅ Faster than binary search for uniform data
     * ❌ Not suitable for non-uniform distributions
     */
    private static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) /
                    (array[high] - array[low]);
            System.out.println("Probe: " + probe);

            if (array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe - 1;
        }
        return -1;
    }
}
