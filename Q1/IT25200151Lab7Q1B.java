import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.print("Enter marks for student " + student + ": ");

            double mark1 = input.nextDouble();
            double mark2 = input.nextDouble();
            double mark3 = input.nextDouble();
            double mark4 = input.nextDouble();

            double average = (mark1 + mark2 + mark3 + mark4) / 4;

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

            System.out.println();
        }
    }
}