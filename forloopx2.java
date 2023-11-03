public class forloopx2 {
    public static void main(String[] args) {
        int[] numbers = {80, 15, 8, 12, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the numbers in the array is: " + sum);
    }
}
