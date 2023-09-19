import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // ask name
        System.out.println("Hello Friend, what you name?");
        String name = (myScanner.nextLine());
        System.out.println("Welcome, " + name);

        // ask user for height and width
        System.out.println("Please enter body weight:");
        double weight = Double.parseDouble(myScanner.nextLine());
        System.out.println("Please enter body height:");
        double height = Double.parseDouble(myScanner.nextLine());


        // calculate body mass
        double BMI = weight/(height*height);
        System.out.println(("Your Body Mass Index " + name +": " +BMI));
        // напишу здесь для тебя по русски - я взял код с первого задания
        // и редактировал его под задание, надеюсь верно понял и сделал)
        // без помощников только узнал что такое Индекс Массы Тела))
        // только последний код себя загнал в угол хотел красиво с именем
        // гугл помог))))

    }
}
