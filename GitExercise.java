import java.util.Scanner;
import java.util.Arrays;

public class GitExercise {
    public static void main(String[] args) {
        int elements;
        String words[];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        elements = s.nextInt();
        words = new String[elements]; // number of elements initializes the size of the array

        System.out.println("Enter " + elements + " words");
        for (int i=0; i < elements; i++){
            words[i] = s.next();
        }

        System.out.print("\nYou entered: ");
        for (String word : words) {
            System.out.print(word + " ");
        }

        Arrays.sort(words);

        System.out.print("\nWords in alphabetical order: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}