import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double mark;
        int i = 1;

        while (i <= 4) {

            System.out.print("Enter marks for subject " + i + ": ");
            mark = input.nextDouble();

            // Validate marks
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Enter a mark between 0 and 100.");
                continue;
            }

            sum = sum + mark;
            i++;
        }

        double average = sum / 4;

        System.out.println("Average = " + average);

        if (average >= 75) {
            System.out.println("Grade = Distinction");
        }
        else if (average >= 50) {
            System.out.println("Grade = Credit");
        }
        else {
            System.out.println("Grade = Fail");
        }
    }
}