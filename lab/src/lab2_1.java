import java.util.Scanner;

public class lab2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Celsius : ");
        double celsius = sc.nextDouble();
        double result = (9.0 / 5.0) * celsius + 32;
        System.out.println( celsius + " Celsius is "+ result + " Fahrenheit");
    }
}

