import java.io.*;
import java.util.*;

public class ScoreWriter {
    public static final String OUTPUT_FILE = "scores.txt";
    public static final String QUIT = "quit";

    public static void main(String[] args) throws FileNotFoundException {
        printIntro();
        Scanner console = new Scanner(System.in);
        PrintStream output = new PrintStream(new File(OUTPUT_FILE));
        int count = 0;
        String name = getName(console);
        while (!name.equalsIgnoreCase(QUIT)) {
            writeStudent(console, output, name);
            count++;
            name = getName(console);
        }
        output.close();
        System.out.println();
        System.out.println(count + " student record(s) written to " + OUTPUT_FILE);
    }

    public static void printIntro() {
        System.out.println("This program records each student's midterm and final exam scores in " + OUTPUT_FILE + ".");
        System.out.println("Enter each student's name (one word), then the two scores (0-100).");
        System.out.println("Enter '" + QUIT + "' as a name when you are finished.");
        System.out.println();
    }

    public static String getName(Scanner console) {
        System.out.print("Student name (or '" + QUIT + "'): ");
        return console.next();
    }

    public static void writeStudent(Scanner console, PrintStream output, String name) {
        int midterm = getScore(console, "  Midterm exam score for " + name + ": ");
        int finalExam = getScore(console, "  Final exam score for " + name + ": ");
        output.println(name + " " + midterm + " " + finalExam);
    }

    public static int getScore(Scanner console, String prompt) {
        System.out.print(prompt);
        while (!console.hasNextInt()) {
            console.next();
            System.out.println("Scores must be between 0 and 100.");
            System.out.print(prompt);
        }
        int score = console.nextInt();
        while (!isValidScore(score)) {
            System.out.println("Scores must be between 0 and 100.");
            System.out.print(prompt);
            while (!console.hasNextInt()) {
                console.next();
                System.out.println("Scores must be between 0 and 100.");
                System.out.print(prompt);
            }
            score = console.nextInt();
        }
        return score;
    }

    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
}
