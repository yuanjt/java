/** Created by IntelliJ IDEA. @Author: Yuan Jiangtao @Created: 2025/11/13 13:17 */
public class ArrayUtils {
    /**
     * Reverses the elements of the given array in place.
     *
     * @param array the array to be reversed
     */
    public static void reverse(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * summary the elements of the given array.
     *
     * @param array the array to be summarized
     * @return the sum of the elements
     */
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    /**
     * Finds the maximum element in the given array.
     *
     * @param array the array to be searched
     * @return the maximum element, or Integer.MIN_VALUE if the array is null or empty
     */
    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverse(arr);
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = sum(arr);
        System.out.println("Sum of elements: " + sum);

        int max = max(arr);
        System.out.println("Maximum element: " + max);
    }
}
