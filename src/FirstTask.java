import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        // ask user for height and width
        System.out.println("Please enter the width of a rectangle:");
        double width = Double.parseDouble(myScanner.nextLine());
        System.out.println("Please enter the height of a rectangle:");
        double height = Double.parseDouble(myScanner.nextLine());

        // calculate area
        double area = width * height;
        System.out.println("Area of a rectangle " + area);

        // calculate perimeter
        double perimeter = 2*(width+height);
        System.out.println("Perimeter of a rectangle is"+perimeter);



    }
}
