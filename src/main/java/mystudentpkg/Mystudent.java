package mystudentpkg;

import java.util.Scanner;

public class Mystudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Standard: ");
        String standard = sc.nextLine();

        // Taking marks input
        System.out.print("Enter Physics Marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Biology Marks: ");
        int biology = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Math Marks: ");
        int math = sc.nextInt();

        // Total and calculations
        int totalSubjects = 4;
        int totalMarks = physics + biology + chemistry + math;
        double average = (double) totalMarks / totalSubjects;
        double percentage = (totalMarks / (totalSubjects * 100.0)) * 100;  // assuming each subject is out of 100

        // Displaying result
        System.out.println("\n--- Student Report ---");
        System.out.println("Name     : " + name);
        System.out.println("Standard : " + standard);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Congraluation You Have Pass BEIT");
        System.out.println("Thank you for using my MyStudent");
        sc.close();
    }
}
