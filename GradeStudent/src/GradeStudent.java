import java.util.*;
import java.text.*;

/* TODO: 
* - write homework & report method
* - write array start from 1
*/
public class GradeStudent {
    static int midTermWeightScore = 0;
    static int finalTermWeightScore = 0;

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

    static void intro() {  // Hàm intro, in thông tin, brand cho biết chương trình làm gì
        clrscr();
        sep();
        brand();
        sep();
        System.out.println("\nThis program reads exam/homework scores and reports your overall course grade.");
    }

    static float midTerm() { // Hàm nhập và tính cột điểm giữa kì
        DecimalFormat df = new DecimalFormat("#.#"); // Khai báo class DecimalFormat dùng để format số thập phân thành 1 chữ số thập phân
        Scanner input = new Scanner(System.in); // Thêm lớp input
        clrscr();
        sep();
        brand();
        sep();
        System.out.println("M  I  D   T  E  R  M");
        sep();
        // Hàm do-while dùng để liên tiếp
        // yêu cầu nhập trọng số nếu vượt
        // limit (<= 100)
        do { 

            System.out.println("\nPlease enter weight score: \n");
            midTermWeightScore = input.nextInt();
            if (midTermWeightScore > 100) {
                System.out.print("Your weight score exceeded the limit. Please re-enter weight score.");
            }

        } while (midTermWeightScore > 100);
        System.out.println("Please enter score earned: "); // In ra dòng chữ yêu cầu người dùng nhập score
        int midTermScoreEarned = input.nextInt(); // Thu input từ người dùng
        System.out.println("Were score shifted [y/n]?"); // Hỏi nếu điểm có được cộng không
        String midTermShiftedChoice = input.next(); // Do dùng y/n (yes - no) nên phải dùng input string

        int midTermShiftedAmount = 0; // khỏi tạo biến số điểm được thêm
        if (midTermShiftedChoice.equalsIgnoreCase("y")) { // nếu có thì thực thi tiếp
            System.out.println("Please enter shifted amount: "); // in ra dòng chữ yêu cầu nhập số điểm được tăng
            midTermShiftedAmount = input.nextInt(); // thu input từ người dùng
        }
        sep();
        float midTermTotalScore = midTermScoreEarned + midTermShiftedAmount; // tính total score, điểm có được + điểm cộng
        if (midTermTotalScore > 100) { // nếu điểm có được > 100 thì = 100
            midTermTotalScore = 100;
        }
        float midTermWeightedScore = (((float) midTermTotalScore) / 100) * midTermWeightScore; // tính điểm tính theo trọng số
        System.out.println("Total points: " + ((int) midTermTotalScore) + "/100"); // in total point
        if (midTermWeightedScore > midTermWeightScore) { // nếu điểm tính theo trọng số > trọng số thì = trọng số
            midTermWeightedScore = midTermWeightScore;
        }
        System.out.println("Weighted score: " + df.format(midTermWeightedScore) + "/" + midTermWeightScore); // in điểm tính theo trọng số

        return midTermWeightedScore;  // trả kq cho điểm tính theo trọng số
    }

    static float finalTerm() { // Hàm nhập và tính điểM cuối kì
        DecimalFormat df = new DecimalFormat("#.#"); // Khai báo class DecimalFormat dùng để format số thập phân thành 1 chữ số thập phân

        Scanner input = new Scanner(System.in); // thêm lớp input để lấy thông tin từ người dùng

        sep();
        System.out.println("F  I  N  A  L   T  E  R  M"); 
        sep();
        do { // loop vòng lặp này nếu weight score của midterm + finalterm > 100 đến khi < limit (100)
            System.out.println("\nPlease enter weight score: \n"); // yêu cầu người dùng nhập weight score

            finalTermWeightScore = input.nextInt(); // thu input weight score của người dùng
            if ((finalTermWeightScore + midTermWeightScore) > 100) { // nếu > 100 yêu cầu nhập lại
                System.out.print("Your weight score exceeded the limit. Please re-enter weight score.");
            }
        } while ((finalTermWeightScore + midTermWeightScore) > 100);

        System.out.println("Please enter score earned: "); // yêu cầu nhập điểm có được
        int finalTermScoreEarned = input.nextInt(); // lấy input từ người dùng
        System.out.println("Were score shifted [y/n]?"); // hỏi điểm có thêm không
        String finalTermShiftedChoice = input.next(); // lấy input kiểu string, y - n

        int finalTermShiftedAmount = 0; // khởi tạo biến số điểm đã tăng = 0
        if (finalTermShiftedChoice.equalsIgnoreCase("y")) { // nếu = y thì thực thi tiếp
            System.out.println("Please enter shifted amount: "); // y/c nhập số điểm đã tăng
            finalTermShiftedAmount = input.nextInt(); // thu input
        }
        sep();
        float finalTermTotalScore = ((float) (finalTermShiftedAmount + finalTermScoreEarned)); // tính total score
        if (finalTermTotalScore > 100) { // nếu total score > 100 thì = 100
            finalTermTotalScore = 100;
        }

        float finalTermWeightedScore = (((float) finalTermTotalScore) / 100) * finalTermWeightScore;// tính điểm tính theo trọng số
        System.out.println("Total points: " + ((int) finalTermTotalScore) + "/100"); // in điểm tổng
        if (finalTermWeightedScore > finalTermWeightScore) { // nếu điểm tính theo trọng số > trọng số thì = trọng số
            finalTermWeightedScore = finalTermWeightScore;
        } 
        System.out.format("Weighted score: %.1f/%d\n", finalTermWeightedScore, finalTermWeightScore); //in điểm tính theo trọng số 
        return finalTermWeightedScore; // trả về điểm tính theo trọng số
    }

    static float homework() { // hàm homework nhập và tính điểm homework, chuyên cần...
        DecimalFormat df = new DecimalFormat("#.#"); // khởi tạo lớp format số TP 

        Scanner input = new Scanner(System.in); // thêm 1 lớp input cho việc nhập DL

        sep();
        System.out.println("H  O  M  E  W  O  R  K");
        sep();
        int homeworkWeightScore = 0; // khởi tạo biến trọng số = 0

        do { // nếu điểm trọng số của final, mid và homework cộng lại > 100 thì y/c nhập lại do đã trúng limit

            System.out.println("Please enter weight score: ");

            homeworkWeightScore = input.nextInt();

            if ((finalTermWeightScore + homeworkWeightScore + midTermWeightScore) > 100) {
                System.out.print("Your weight score exceeded the limit. Please re-enter weight score.");
            }
        } while ((finalTermWeightScore + homeworkWeightScore + midTermWeightScore) > 100);
        System.out.println("Please enter number of assignment: "); // nhập số bài tập
        int n = input.nextInt();
        float[] scores = new float[n]; // khởi tạo mảng score, lưu asm score
        float[] max = new float[n]; // khởi tạo mảng max, lưu điểm cao nhất
        for (int i = 0; i < n; i++) { // tạo ra vòng lặp nhập điểm và max
            System.out.println("Please enter the Assignment " + (i + 1) + " score:");
            scores[i] = input.nextFloat(); 
            max[i] = input.nextFloat();
        }

        int homeworkTotalScore = 0, homeworkMaxScore = 0; // khởi tạo biến asm total score và max score = 0 

        for (int i = 0; i < n; i++) { // thêm số điểm total cho asm vào 1 biến, cộng lại
            homeworkTotalScore += scores[i];
        }

        for (int i = 0; i < n; i++) { // thêm số điểm max cho asm vào 1 biến, cộng lại
            homeworkMaxScore += max[i];
        }

        System.out.print("Amount of sections attended: "); // hỏi & y/c người dùng nhập số buổi dự
        int sectionsAttendedScore = (input.nextInt()) * 5;
        if (sectionsAttendedScore > 30) {
            sectionsAttendedScore = 30;
        }

        System.out.print("Section point: " + sectionsAttendedScore + "/30\n"); // hiển thị section point

        if (homeworkTotalScore > homeworkMaxScore) { // nếu total score của asm > max thì = max
            homeworkTotalScore = homeworkMaxScore;
        }

        homeworkTotalScore = homeworkTotalScore + sectionsAttendedScore; // tính total score
        homeworkMaxScore += 30; // thêm maxscore 30 điểm của sections attended max

        if (homeworkTotalScore > 150) { // nếu asm total score > max (150) thì = 150
            homeworkTotalScore = 150;
        }

        if (homeworkMaxScore > 150) { // nếu max score > max 150 thì = 150 
            homeworkMaxScore = 150;
        }

        System.out.println("Total points: " + homeworkTotalScore + "/" + homeworkMaxScore); // in total points

        float homeworkWeightedScore = (((float) homeworkTotalScore / homeworkMaxScore) * homeworkWeightScore); // tinh điểm tính theo trọng số

        System.out.print("\nWeighted score: "
                + df.format((homeworkWeightedScore > homeworkWeightScore) ? homeworkWeightScore : homeworkWeightedScore)
                + "/" + homeworkWeightScore + "\n"); // in điểm tính theo trọng số, nếu > trọng số thì = trọng số

        return homeworkWeightedScore; // trả về điểm theo trọng số
    }

    static void report(float midTermWeightedScore, float finalTermWeightedScore, float homeworkWeightedScore) { // hàm báo cáo
        DecimalFormat df = new DecimalFormat("#.#");// khởi tạo lớp format
        float grade = midTermWeightedScore + finalTermWeightedScore + homeworkWeightedScore;// tính điểm grade
        System.out.println("Your grade is " + df.format(grade)); // in điểm grade
        // Nếu grade >= 85 thì gpa = 3, >=75 thì gpa = 2, >= 60 thì gpa = 1, <60 thì gpa = 0
        float gpa = 0;
        if (grade >= 85) {
            gpa = 3;
            System.out.print("Your grade will be at least " + gpa);
        }

        else if (grade >= 75 && grade < 85) {
            gpa = 2;
            System.out.print("Your grade will be at least " + gpa);
        }

        if (grade >= 60 && grade < 75) {
            gpa = 1;
            System.out.print("Your grade will be at least " + gpa);
        }

        if (grade < 60) {
            gpa = 0;
            System.out.print("Your grade will be at least " + gpa);
        }

    }

    public static void main(String[] args) {
        intro();
        float midTermWeightedScore = midTerm(); //gọi & gán giá trị trả về vào biến
        float finalTermWeightedScore = finalTerm(); //gọi & gán giá trị trả về vào biến
        float homeworkWeightedScore = homework(); //gọi & gán giá trị trả về vào biến
        report(midTermWeightedScore, finalTermWeightedScore, homeworkWeightedScore); //gọi hàm report, nạp dl cần thiết
    }
}
