public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 5, 6, 7, 8, 9, 10 };
        int target = 10;
        int ans = binarySe(arr, target);
        System.out.println(ans);
    }

    // binary search in sorteddddddd order onlyyyyyyyyyyyyy
    static int binarySe(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
