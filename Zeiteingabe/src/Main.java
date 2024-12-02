import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        int hour;
        int minute;
        int seconds;
        boolean currentCorrect;

        int futureHour;
        int futureMinute;
        int futureSecond;

        Scanner scanHour = new Scanner(System.in);
        Scanner scanMinute = new Scanner(System.in);
        Scanner scanSecond = new Scanner(System.in);

        Scanner FutureHour = new Scanner(System.in);
        Scanner FutureMinute = new Scanner(System.in);
        Scanner FutureSecond = new Scanner(System.in);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println("The current time is " + localTime);



        System.out.println("If you want a time to be calculated then follow the instructions below: ");

        System.out.println("Enter your desired hour time");
        hour = scanHour.nextInt();
        System.out.println("Enter your desired minute time");
        minute = scanMinute.nextInt();
        System.out.println("Enter your desired seconds time");
        seconds = scanSecond.nextInt();


        while (hour > 24 || minute > 60 || seconds > 60){
            System.out.println("Unvalid input");
            currentCorrect = false;
        }

        if (currentCorrect = true){

        }

        System.out.println("Enter hour to go forward");
        futureHour = FutureHour.nextInt();
        System.out.println("Enter minute to go forward");
        futureMinute = FutureMinute.nextInt();
        System.out.println("Enter second to go forward");
        futureSecond = FutureSecond.nextInt();

        System.out.println("The answer is " + (hour + futureHour) + ":" + (minute + futureMinute)+ ":"+ (seconds + futureMinute));

    }
}