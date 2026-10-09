package Pertemuan4;
import java.util.Scanner;

public class PemilihanHari21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        String dayName, dayType;
        System.out.print("Input day name : ");
        dayName = raysha.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
            dayType = "weekend";
                break;
                default:
                    dayType = "invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
        raysha.close();
    }
}
