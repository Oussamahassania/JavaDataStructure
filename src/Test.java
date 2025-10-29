import java.util.Arrays;

public class Test {
    public static void main(String[] args){
      /*
       DynamicArray dynamicArray = new DynamicArray();
       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");
       dynamicArray.delete("C");
       dynamicArray.insert(2,"M");
        System.out.println(dynamicArray.search("G"));
        System.out.println(dynamicArray);
        System.out.println(" the size is: "+dynamicArray.size);
        System.out.println(" the capacity is: "+dynamicArray.capacity);
        System.out.println("empty is :"+dynamicArray.isEmpty());

       */
        //========================================================================================================
        // Linear search = Iterate through a collection one element at a time

        // runtime complexity O(n)

        // Disadvantages
        // slow for large data sets

        // Advantages
        // Fast for searches of small to medium data sets
        // Does not need to sorted
        // Useful for data structures that do not have random access (Linked list)
        /*
        int [] array={1,2,3,4,5,6,7,8,9};
        int index = linearSearch(array,0);
        if(index != -1){
            System.out.println("element found at index " + index);
        }else{
            System.out.println("element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

         */

    //========================================================================================================
        // Binary search = search algorithm that find the position for a target value within a sorted array
          // half of array is eliminated during each step

      /*  int []array = new int[100];
        int target=49;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int index = binarySearch(array,target);
        if (index == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index " + index);
        }

    }
    public static int binarySearch(int []array,int target){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middle = low + (high - low)/2;
            int value = array[middle];
            System.out.println("middle: " + value);
            if(value < target)low = middle + 1;
            else if (value > target)high = middle - 1;
            else return middle;
        }
        return -1;

       */

        int []array={9,8,2,3,1,4,5,7,0,6};
        insertionSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }
//Insertion sort is a simple sorting algorithm that builds
// a final sorted array (or list) one item at a time.
// It operates by taking elements from the unsorted part of the list
// and inserting them into their correct position within the already sorted portion.
// Quadratique time O(n**2)
//Small data set = decent
// Large data set = Bad
// less steps than bubble sort
// best case in O(n) compared to selection sort O(n**2)

    private static void insertionSort(int[] array) {
        for (int i=1; i<array.length; i++) {
            int temp = array[i];
            int j= i-1;
            while (j>=0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
//Selection sort is an in-place comparison sorting algorithm that works by repeatedly finding
// the minimum (or maximum) element from the unsorted part
// of a list and putting it at the beginning of the sorted part
// Quadratique time O(n**2)
//Small data set = Okay
// Large data set = Bad
  /*
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min=i;
            for (int j=i+1;j<array.length;j++) {
                if (array[min]>array[j]) {
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
   */
    //Bubble sort is a simple sorting algorithm that repeatedly steps through a list,
    // compares adjacent elements, and swaps them if they are in the wrong order.
    // The algorithm gets its name because smaller or larger elements "bubble" to the top of the list,
    // depending on the desired sorting order.
    //Quadratique time O(n**2)
    // Small data set = Okay-ish
    // large data set = BAD (plz don't)
    /*
    private static void bubbleSort(int[] array) {
        for (int i=0;i<array.length-1;i++) {
            for (int j=0;j<array.length-1-i;j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
     */
    /*
    //========================================================================================================
        //Interpolation Search is an improved searching algorithm for ordered arrays that estimates the position of the target element based on its value.
        //It works best for uniformly distributed data, offering faster performance than binary search in some cases.
    private static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (value>=array[low] && value<=array[high] && low<=high) {
            int probe=low+(high-low) * (value - array[low])/
                    (array[high] - array[low]);
            System.out.println("probe: "+probe);
            if (array[probe]==value) {
                return probe;
            } else if (array[probe]<value) {
                low= probe+1;
            }else{
                high= probe-1;
            }
        }
        return -1;
    }


     */



}
