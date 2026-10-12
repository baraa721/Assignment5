import java.io.*;
import java.util.*;

public class ScoreReport {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner input = getInput(console);
        processFile(input);
        input.close();
    }

    public static Scanner getInput(Scanner console) throws FileNotFoundException {
        System.out.print("Input file name? ");
        String filename = console.nextLine();
        File file = new File(filename);
        while (!file.canRead() || !file.isFile()) {
            System.out.println("File not found. Try again.");
            System.out.print("Input file name? ");
            filename = console.nextLine();
            file = new File(filename);
        }
        return new Scanner(file);
    }

    public static void processFile(Scanner input) {
        int count = 0;
        while (input.hasNextLine()) {
            String text = input.nextLine();
            if (text.trim().length() > 0) {
                reportStudent(text);
                count++;
            }
        }
        System.out.println();
        System.out.println("Students reported: " + count);
    }

    public static void reportStudent(String text) {
        Scanner data = new Scanner(text);
        String name = data.next();
        int sum = 0;
        int count = 0;
        while (data.hasNextInt()) {
            sum += data.nextInt();
            count++;
        }
        double average = (double) sum / count;
        System.out.printf("%-12s %.2f%n", name, average);
        data.close();
    }
}
