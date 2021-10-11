import java.util.*;
import java.text.*;

/* TODO: 
* - write homework & report method
* - write array start from 1
*/
public class GradeStudent {
    static void clrscr() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    static void sep() {
        System.out.println("====================================");
    }

    static void brand() {
        System.out.println("S  T  U  D  E  N  T   G  R  A  D  E");
    }

    static void intro() {
        clrscr();
        sep();
        brand();
        sep();
        System.out.println("\nThis program reads exam/homework scores and reports your overall course grade.");
    }

    static float midTerm() {
        DecimalFormat df = new DecimalFormat("#.#");

        Scanner input = new Scanner(System.in);
        clrscr();
        sep();
        brand();
        sep();
        System.out.println("M  I  D   T  E  R  M");
        sep();
        System.out.println("Please enter weight score: ");
        float midTermWeightScore = input.nextFloat();
        System.out.println("Please enter score earned: ");
        float midTermScoreEarned = input.nextFloat();
        System.out.println("Were score shifted [y/n]?");
        String midTermShiftedChoice = input.next();

        int midTermShiftedAmount = 0;
        if (midTermShiftedChoice.equalsIgnoreCase("y")) {
            System.out.println("Please enter shifted amount: ");
            midTermShiftedAmount = input.nextInt();
        }
        sep();
        float midTermWeightedScore = ((midTermScoreEarned + midTermShiftedAmount) / 100) * midTermWeightScore;
        System.out.println("Total score: " + (midTermScoreEarned + midTermShiftedAmount));
        System.out.println("Weighted score: " + df.format(midTermWeightedScore));

        return midTermWeightedScore;
    }

    static float finalTerm() {
        DecimalFormat df = new DecimalFormat("#.#");

        Scanner input = new Scanner(System.in);

        sep();
        System.out.println("F  I  N  A  L   T  E  R  M");
        sep();
        System.out.println("Please enter weight score: ");
        float finalTermWeightScore = input.nextFloat();
        System.out.println("Please enter score earned: ");
        float finalTermScoreEarned = input.nextFloat();
        System.out.println("Were score shifted [y/n]?");
        String finalTermShiftedChoice = input.next();

        float finalTermShiftedAmount = 0;
        if (finalTermShiftedChoice.equalsIgnoreCase("y")) {
            System.out.println("Please enter shifted amount: ");
            finalTermShiftedAmount = input.nextInt();
        }
        sep();
        float finalTermTotalScore = (finalTermShiftedAmount + finalTermScoreEarned);
        if (finalTermTotalScore > 100) {
            finalTermTotalScore = 100;
        }
        float finalTermWeightedScore = (finalTermTotalScore / 100) * finalTermWeightScore;
        System.out.println("Total score: " + finalTermTotalScore);
        System.out.println("Weighted score: " + finalTermWeightedScore);

        return finalTermWeightedScore;
    }

    static float homework() {
        DecimalFormat df = new DecimalFormat("#.#");

        Scanner input = new Scanner(System.in);

        sep();
        System.out.println("H  O  M  E  W  O  R  K");
        sep();
        System.out.println("Please enter weight score: ");
        float homeworkWeightScore = input.nextFloat();
        System.out.println("Please enter number of homework: ");
        int n = input.nextInt();
        float[] scores = new float[n];
        float[] max = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the Assignment " + (i + 1) + " score:");
            scores[i] = input.nextFloat();

            System.out.println("Please enter the Assignment " + (i + 1) + " max score:");
            max[i] = input.nextFloat();
        }

        float homeworkTotalScore = 0, homeworkMaxScore = 0;

        for (int i = 0; i < n; i++) {
            homeworkTotalScore += scores[i];
        }

        for (int i = 0; i < n; i++) {
            homeworkMaxScore += max[i];
        }

        System.out.print("Amount of sections attended: ");
        int sectionsAttendedScore = (input.nextInt()) * 5;
        if (sectionsAttendedScore > 30) {
            sectionsAttendedScore = 30;
        }

        homeworkTotalScore = homeworkTotalScore + sectionsAttendedScore;

        float homeworkWeightedScore = (homeworkTotalScore / homeworkMaxScore) * homeworkWeightScore;

        System.out.print("Weighted score: " + homeworkWeightedScore);

        return homeworkWeightedScore;
    }

    static void report(float midTermWeightedScore, float finalTermWeightedScore, float homeworkWeightedScore) {
        float grade = midTermWeightedScore + finalTermWeightedScore + homeworkWeightedScore;
        System.out.println("Your grade is " + Math.round(grade));
        // TODO: overall percentage
        // TODO: min grade & GPA
    }

    public static void main(String[] args) {
        intro();
        float midTermWeightedScore = midTerm();
        float finalTermWeightedScore = finalTerm();
        float homeworkWeightedScore = homework();
        report(midTermWeightedScore, finalTermWeightedScore, homeworkWeightedScore);
    }
}
