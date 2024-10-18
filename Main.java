import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];

        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double smallest = Math.min(Math.min(numbers[0], numbers[1]), numbers[2]);
        double largest = Math.max(Math.max(numbers[0], numbers[1]), numbers[2]);
        
        double sum = smallest + largest;

        System.out.println("The sum of the smallest and largest number is: " + sum);
    }
}

