public class Breakwithloopex2 {
    public static void main(String[] args) {
        int number = 1;

        while (number <= 20) {
            System.out.println("Count: " + number);
            number++;

            if (number > 20) {
                System.out.println("Counting up to 20 is complete!");
                break;
            }
        }
    }
}
