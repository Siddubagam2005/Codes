public class LinearSearchStr {
    public static void main(String args[]) {
        int[] arr = { 23, 24, 98, 90, 21 };
        int target = 21;
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                System.out.println("Target is found" + " " + num);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.print("Target is not found" + " ");
        }
    }
}
