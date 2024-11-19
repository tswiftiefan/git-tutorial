import java.util.Scanner;

public class GitExercise {
    public static void main(String[] args) {
        int elements;
        int numbers[];
        String words[];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        elements = s.nextInt();
        numbers = new int[elements];
        words = new String[elements];

        System.out.println("Enter " + elements + " numbers");
        for (int i=0; i < elements; i++){
            numbers[i] = s.nextInt();
        }

        System.out.print("You entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nEnter " + elements + " words");
        for (int i=0; i < elements; i++){
            words[i] = s.next();
        }

        System.out.print("You entered: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}