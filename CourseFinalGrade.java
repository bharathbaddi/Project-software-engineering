import java.util.Scanner;
public class CourseFinalGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Project Team Members:Bharath Baddi, Keerthana Reddy Katta");

        // Input scores for each component
        double HomeworkScore = getAverageScore("Homework", 8);
        double QuizScore = getAverageScore("Quiz", 5);
        double MidTermExam = getScore("Mid-Term Exam");
        double FinalExam = getScore("Final Exam");
        double ProjectScore = getScore("Project");
        String LetterGrade;

        // Calculate final grade
        double CoursefinalGrade = calculateFinalGrade(HomeworkScore, QuizScore, MidTermExam, FinalExam, ProjectScore);
        // Output the final grade
        System.out.println("Course Final Grade: " + CoursefinalGrade);
        if(CoursefinalGrade >= 95){
        LetterGrade = "A+";
        }
        // if CoursefinalGrade >= 90 , set the letterGrade to A
        else if(CoursefinalGrade >= 90){
        LetterGrade = "A";
        }
        // if CoursefinalGrade >= 85 , set the letterGrade to B+
        else if(CoursefinalGrade >= 85){
        LetterGrade = "B+" ;
        }
        // if CoursefinalGrade >= 80 , set the letterGrade to B
        else if(CoursefinalGrade >= 80){
        LetterGrade = "B" ;
        }
        // if CoursefinalGrade >= 75 , set the letterGrade to C+
        else if(CoursefinalGrade >= 75){
        LetterGrade = "C+";
        }
        // if CoursefinalGrade >= 70 , set the letterGrade to C
        else if(CoursefinalGrade >= 70){
        LetterGrade = "C" ;
        }
        // if CoursefinalGrade >= 65 , set the letterGrade to D+
        else if(CoursefinalGrade >= 65){
        LetterGrade = "D+";
        }
        // if CoursefinalGrade >= 60 , set the letterGrade to D
        else if(CoursefinalGrade >= 60){
        LetterGrade = "D" ;
        }
        // else set the letterGrade to F
        else {
        LetterGrade = "F";
        }
        System.out.println("The corresponding letter grade is: " + LetterGrade);
        }



    private static double getAverageScore(String componentName, int numberOfComponents) {
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        for (int i = 1; i <= numberOfComponents; i++) {
            System.out.print("Enter score you got for 100 marks in " + componentName + " " + i + ": ");
            totalScore += scanner.nextDouble();
        }

        // Calculate average score
        return totalScore / numberOfComponents;
    }

    private static double getScore(String componentName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score you got for 100 marks in " + componentName + ": ");
        return scanner.nextDouble();
    }

    private static double calculateFinalGrade(double homework, double quiz, double MidTermExam, double FinalExam, double project) {
        // Weighted calculation based on the given percentages
        double finalGrade = (homework * 0.15) + (quiz * 0.05) + (MidTermExam * 0.25) + (FinalExam * 0.30) + (project * 0.25);
        return finalGrade;
    }
}

