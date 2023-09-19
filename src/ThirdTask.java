import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the seconds:");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(("Result: " +hours+":"+minutes+":"+seconds));

        //здесь сложнее было намного так как не понимал какое значение использовать
        // и все таки гугл и гпт помог но редактировал сам и соединял в одну строку

    }
}
