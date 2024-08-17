
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final byte NUMBER_OF_ENTRIES = 5;
        int sumOfNumbers = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= NUMBER_OF_ENTRIES; i++){
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            sumOfNumbers += number;
        }
        System.out.println("Average of the numbers is: " + (double) sumOfNumbers / NUMBER_OF_ENTRIES);

    }
}
