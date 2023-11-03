public class usingbreakloop {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int currentDay = 6; 

        while (currentDay >= 0) {
            System.out.println("Today is " + daysOfWeek[currentDay]);
            
            if (currentDay == 0) {
                System.out.println("It's finally Friday!");
                break;
            }

            currentDay--;
        }
    }
}
