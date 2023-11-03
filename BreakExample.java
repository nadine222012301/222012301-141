public class BreakExample {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 4, 9, 6, 11, 2, 8};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println("The first even number found in the array is: " + num);
                break; // Exit the loop when the first even number is found
            }
        }
    }
}
