import java.util.*;
import javax.swing.event.SwingPropertyChangeSupport;
import java.text.*;

/**
 * Assignment 2 - Nguyen Ngoc Thien - FX-10909 - 31/10/21
 * <p>
 * GradeStudent - chương trình giúp tính điểm trung bình, GPA
 * của từng bạn dựa trên dữ liệu đã cho. Chương trình có cấu
 * trúc như sau:
 * Gồm 5 hàm chính:
 * + midTerm():        hàm dùng để nhập và tính điểm GK
 * + finalTerm():      hàm dùng để nhập và tính điểm cuối kì
 * + homework():       hàm dùng để tính điểm Assignments,
 * điểm chuyên cần,...v.v.
 * + report():         hàm dùng để tính và in điểm trung bình,
 * tổng điểm, GPA,...v.v.
 * <p>
 * + main():           gọi các hàm trên và gán KQ return
 * <p>
 * Trong đó có 3 hàm phụ để in thông tin, seperator...
 * <p>
 * Global:
 * + DecimalFormat dùng để định dạng số TP ở dạng x.y
 * + Scanner dùng để thu input từ người dùng
 */



public class GradeStudent {
    static int midTermWeightScore = 0;
    static int finalTermWeightScore = 0;

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    static void showSeperator() {
        System.out.println("====================================");
    }

    static void showBrand() {
        System.out.println("S  T  U  D  E  N  T   G  R  A  D  E");
    }

    static void showIntro() {
        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();
        System.out.println("\nThis program reads exam/homework scores and reports your overall course grade.\n");
    }

    /** Hàm midTerm(): tính các cột điểm giữa kì
     * - Đầu tiên sẽ định dạng STP rồi khai báo Scanner để thu input
     * từ người dùng
     * - Sau đó thực hiện hàm do - while để nhập điểm trọng số, trong
     * đó nếu điểm trọng số > 100 thì báo lỗi và yêu cầu nhập lại (t/c
     * nâng cao)
     * - Tiếp theo nhập số điểm đã có trên thang điểm 100
     * - Hỏi người dùng có tăng điểm không, nếu có thì nhập điểm tăng
     * - Tính total score theo công thức là điểm đã có + điểm được
     * tăng, nếu total score > 100 thì = 100, rồi in total score
     * - Tiếp theo tính điểm tính theo trọng số, nếu > trọng số thì =
     * trọng số
     * - Cuối cùng trả điểm tính theo trọng số
     */

    static float midTerm() {

        DecimalFormat df = new DecimalFormat("#.#");
        Scanner input = new Scanner(System.in);


        showSeperator();
        System.out.println("M  I  D   T  E  R  M");
        showSeperator();

        do {

            System.out.print("\nPlease enter weight score: ");
            midTermWeightScore = input.nextInt();

            if (midTermWeightScore > 100) {
                System.out.print("Your weight score exceeded the limit. Please re-enter weight score.");
            }

        } while (midTermWeightScore > 100);

        System.out.print("\nPlease enter score earned: ");
        float midTermScoreEarned = input.nextFloat();

        System.out.print("\nWere score shifted [y/n]? ");
        String midTermShiftedChoice = input.next();

        int midTermShiftedAmount = 0;

        if (midTermShiftedChoice.equalsIgnoreCase("y")) {

            System.out.print("\nPlease enter shifted amount: ");
            midTermShiftedAmount = input.nextInt();

        }

        showSeperator();

        float midTermTotalScore = midTermScoreEarned + midTermShiftedAmount;

        if (midTermTotalScore > 100) {

            midTermTotalScore = 100;

        }

        float midTermWeightedScore = (midTermTotalScore / 100) * midTermWeightScore;
        System.out.println("\nTotal points: " + ((int) midTermTotalScore) + "/100");

        if (midTermWeightedScore > midTermWeightScore) {
            midTermWeightedScore = midTermWeightScore;
        }

        System.out.println("Weighted score: " + df.format(midTermWeightedScore) + "/" + midTermWeightScore + "\n");

        return midTermWeightedScore;

    }


    /** Hàm finalTerm(): tính các cột điểm cuối kì
     * - Đầu tiên sẽ định dạng STP rồi khai báo Scanner để thu input
     * từ người dùng
     * - Sau đó thực hiện hàm do - while để nhập điểm trọng số, trong
     * đó nếu điểm trọng số cuối kì + giữa kỳ > 100 thì báo lỗi và
     * yêu cầu nhập lại (t/c nâng cao)
     * - Tiếp theo nhập số điểm đã có trên thang điểm 100
     * - Hỏi người dùng có tăng điểm không, nếu có thì nhập điểm tăng
     * - Tính total score theo công thức là điểm đã có + điểm được
     * tăng, nếu total score > 100 thì = 100, rồi in total score
     * - Tiếp theo tính điểm tính theo trọng số, nếu > trọng số thì =
     * trọng số
     * - Cuối cùng trả điểm tính theo trọng số
     */

    static float finalTerm() {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner input = new Scanner(System.in);

        showSeperator();
        System.out.println("F  I  N  A  L   T  E  R  M");
        showSeperator();

        do {

            System.out.print("\nPlease enter weight score: ");
            finalTermWeightScore = input.nextInt();

            if ((finalTermWeightScore + midTermWeightScore) > 100) {

                System.out.print("\nYour weight score exceeded the limit. Please re-enter weight score.");

            }

        } while ((finalTermWeightScore + midTermWeightScore) > 100);

        System.out.print("\nPlease enter score earned: ");
        int finalTermScoreEarned = input.nextInt();

        System.out.print("\nWere score shifted [y/n]? ");
        String finalTermShiftedChoice = input.next();

        int finalTermShiftedAmount = 0;

        if (finalTermShiftedChoice.equalsIgnoreCase("y")) {

            System.out.print("\nPlease enter shifted amount: ");
            finalTermShiftedAmount = input.nextInt();

        }

        showSeperator();

        float finalTermTotalScore = ((float) (finalTermShiftedAmount + finalTermScoreEarned));

        if (finalTermTotalScore > 100) {

            finalTermTotalScore = 100;

        }

        float finalTermWeightedScore = (finalTermTotalScore / 100) * finalTermWeightScore;
        System.out.println("\nTotal points: " + ((int) finalTermTotalScore) + "/100");

        if (finalTermWeightedScore > finalTermWeightScore) {

            finalTermWeightedScore = finalTermWeightScore;

        }

        System.out.format("\nWeighted score: %.1f/%d\n\n", finalTermWeightedScore, finalTermWeightScore);

        return finalTermWeightedScore;
    }


    /** Hàm homework(): tính các cột điểm cuối kì
     * - Đầu tiên sẽ định dạng STP rồi khai báo Scanner để thu input
     * từ người dùng
     * - Sau đó thực hiện hàm do - while để nhập điểm trọng số, trong
     * đó nếu điểm trọng số cuối kì + giữa kỳ + homework > 100 thì báo
     * lỗi và yêu cầu nhập lại (t/c nâng cao)
     * - Nhập số bài KT (assignments) rồi nhập điểm và điểm cao nhất
     * - Tiếp theo nhập số buổi đi học, tính điểm chuyên cần
     * - Tính total score theo công thức là điểm đã có
     * - Tiếp theo tính điểm tính theo trọng số, nếu > trọng số thì =
     * trọng số
     * - Sau đó in điểm tổng và điểm theo trọng số
     * - Cuối cùng trả điểm tính theo trọng số
     */


    static float homework() {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner input = new Scanner(System.in);

        showSeperator();
        System.out.println("H  O  M  E  W  O  R  K");
        showSeperator();

        int homeworkWeightScore;

        do {

            System.out.print("\nPlease enter weight score: ");
            homeworkWeightScore = input.nextInt();

            if ((finalTermWeightScore + homeworkWeightScore + midTermWeightScore) > 100) {

                System.out.print("\nYour weight score exceeded the limit. Please re-enter weight score.\n");

            }

        } while ((finalTermWeightScore + homeworkWeightScore + midTermWeightScore) > 100);

        System.out.print("\nPlease enter number of assignment: ");
        int n = input.nextInt();

        float[] scores = new float[n];
        float[] max = new float[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nPlease enter the Assignment " + (i + 1) + " score and max: ");
            scores[i] = input.nextFloat();
            max[i] = input.nextFloat();

        }

        int homeworkTotalScore = 0, homeworkMaxScore = 0;

        for (int i = 0; i < n; i++) {

            homeworkTotalScore += scores[i];

        }

        for (int i = 0; i < n; i++) {

            homeworkMaxScore += max[i];

        }

        System.out.print("\nAmount of sections attended: ");
        int sectionsAttendedScore = (input.nextInt()) * 5;

        if (sectionsAttendedScore > 30) {

            sectionsAttendedScore = 30;

        }

        System.out.print("\nSection point: " + sectionsAttendedScore + "/30\n");

        if (homeworkTotalScore > homeworkMaxScore) {

            homeworkTotalScore = homeworkMaxScore;

        }

        homeworkTotalScore = homeworkTotalScore + sectionsAttendedScore;
        homeworkMaxScore += 30;

        if (homeworkTotalScore > 150) {

            homeworkTotalScore = 150;

        }

        if (homeworkMaxScore > 150) {

            homeworkMaxScore = 150;

        }

        System.out.println("\nTotal points: " + homeworkTotalScore + "/" + homeworkMaxScore);

        float homeworkWeightedScore = (((float) homeworkTotalScore / homeworkMaxScore) * homeworkWeightScore);

        System.out.println("\nWeighted score: " + df.format((homeworkWeightedScore > homeworkWeightScore) ? homeworkWeightScore : homeworkWeightedScore)
                + "/" + homeworkWeightScore + "\n\n");

        return homeworkWeightedScore;
    }

    /** Hàm report(): dùng để in điểm trung bình, GPA...v.v
     * - Đầu tiên lấy giá trị biến weighted score của các cột
     * điểm.
     * - Sau đó cộng lại và in grade score
     * - Tiếp theo trả về GPA theo grade score
     */

    static void report(float midTermWeightedScore, float finalTermWeightedScore, float homeworkWeightedScore) {
        DecimalFormat df = new DecimalFormat("#.#");

        float grade = midTermWeightedScore + finalTermWeightedScore + homeworkWeightedScore;
        System.out.println("\nYour grade is " + df.format(grade));

        float gpa;

        if (grade >= 85) {

            gpa = 3;
            System.out.println("\nYour grade will be at least " + gpa);

        } else if (grade >= 75) {

            gpa = 2;
            System.out.println("\nYour grade will be at least " + gpa);

        }

        else if (grade >= 60) {

            gpa = 1;
            System.out.println("\nYour grade will be at least " + gpa);

        }

        else {

            gpa = 0;
            System.out.println("\nYour grade will be at least " + gpa);

        }

    }

    /** Hàm main(): Gọi các hàm và gán giá trị được return vào
     *              các biến, sau đó nhập vào hàm report
     * */

    public static void main(String[] args) {

        showIntro();

        float midTermWeightedScore = midTerm();
        float finalTermWeightedScore = finalTerm();
        float homeworkWeightedScore = homework();
        report(midTermWeightedScore, finalTermWeightedScore, homeworkWeightedScore);

    }
}

/*
 * ==========================================
 * E N D    O F    F I L E !
 * ==========================================
 */