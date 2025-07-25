import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> studentScores = new HashMap<>();

        System.out.println("Enter number of students:");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Student name: ");
            String name = scanner.nextLine();
            System.out.print("Score (0-100): ");
            int score = scanner.nextInt();
            scanner.nextLine();
            studentScores.put(name, score);
        }

        System.out.println("\nGrades:");
        for (String name : studentScores.keySet()) {
            int score = studentScores.get(name);
            String grade = getGrade(score);
            System.out.println(name + ": " + score + " -> " + grade);
        }
    }

    static String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}
