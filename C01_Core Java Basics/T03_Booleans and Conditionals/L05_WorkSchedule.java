public class L05_WorkSchedule {
    public static void main(String[] args) {
        int day = 3;   // 3rd day of the week...
        boolean holiday = true;
        
        // if it's a holiday, print: );
        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
    }
}