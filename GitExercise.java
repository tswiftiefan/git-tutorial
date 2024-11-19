import java.util.Scanner;
import java.util.Arrays;

public class GitExercise {
    public static void main(String[] args) {
        int elements;
        int numbers[];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        elements = s.nextInt();
        numbers = new int[elements];

        System.out.println("Enter " + elements + " numbers");
        for (int i=0; i < elements; i++){
            numbers[i] = s.nextInt();
        }

        System.out.print("You entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        Arrays.sort(numbers);

        System.out.print("\nSorted numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }


}