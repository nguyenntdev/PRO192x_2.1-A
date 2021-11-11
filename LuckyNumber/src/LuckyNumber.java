import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Assignment 1 - LuckyNumber - Nguyen Ngoc Thien - FX10909
 * - Là game tìm ra số may mắn, người dùng đoán 1 số bất kỳ và
 * dựa trên thông báo ở màn hình là nhỏ hay lớn hơn để đoán.
 * - Cấu trúc file: gồm 3 hàm chính
 * + Hàm play():   là game chính, in ra thông báo, xử lý game...
 * + Hàm report(): báo cáo số lượt chơi, lượt chơi tốt nhất,
 *                 lượt chơi trung bình...v.v.
 * + Hàm main():   gán giá trị hàm return và gọi hàm
*/


public class LuckyNumber {
    public static final int max = 100; // Định nghĩa hằng số max cho random

    /**
     * - Hàm showSeperator: in dấu gạch nối, phân cách giữa
     *   các nội dung.
     */

    static void showSeperator() {
        System.out.println("=======================================");
    }

    /**
     * - Hàm showBrand: in tên trò chơi
     */

    static void showBrand() {
        System.out.println("S   O    M   A   Y    M   A   N");
    }


    /**
     * - Hàm clearScreen: xoá màn hình
     */

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * - Hàm play: phần chính của chương trình
     * - Đầu tiên khởi tạo biến guessTime kiểu int = 1
     * - Sau đó tạo số ngẫu nhiên dùng Math.random
     * - Rồi in ra dấu phân cách, tên trò chơi, thông báo...v.v.
     * - Rồi lưu input của người dùng vào 1 biến tạm rồi dùng vòng lặp,
     * so sánh với số ngẫu nhiên đã tạo để đưa ra thông báo cho người
     * dùng
     * - Sau đó nhắc người dùng nhập lại và tăng số lần đoán
     * - Nếu = số may mắn thì chúc mừng, nếu không continue vòng lặp
     */

    static int play() {
        int guessTime = 1;

        Scanner input = new Scanner(System.in);
        int randomNumber = (int) Math.floor(Math.random() * (max + 1));
        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();
        System.out.println(randomNumber);
        System.out.print("Xin vui long nhap so ban doan: ");

        int playerNumber = input.nextInt();
        if (playerNumber == randomNumber) {
            System.out.println("Chuc mung ban da doan dung sau " + guessTime + " lan du doan!");
        }
        else {
        do {
            if (playerNumber > randomNumber) {
                System.out.println("\nSo may man nho hon so du doan cua ban!\n");
            }

            else {
                System.out.println("\nSo may man lon hon so du doan cua ban!\n");
            }

            System.out.print("Xin vui long nhap so ban doan: ");

            playerNumber = input.nextInt();
            guessTime++;
            if (playerNumber == randomNumber) {
                System.out.println("Chuc mung ban da doan dung sau " + guessTime + " lan du doan!");
            }
        } while (playerNumber != randomNumber);
        }
        return guessTime;
    }


    /**
     * - Hàm report: in ra báo cáo trò chơi
     * - Đầu tiên khởi tạo object DecimalFormat để format số thập phân
     * - Rồi in ra dấu phân cách, báo cáo,...v.v.
     * - Sau đó in báo cáo trò chơi gồm số lượt chơi dùng biến totalGame,
     * số lượt dự đoán totalGuessTime, số lượt dự đoán trung bình là
     * số lượt dự đoán / số lượt chơi và số lượt dự đoán tốt nhất là
     * bestGame
     */

    static void report(float totalGame, float totalGuessTime, int bestGame) {
        DecimalFormat df = new DecimalFormat("#.#");

        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();
        System.out.println("B A O   C A O   G A M E");
        showSeperator();
        System.out.println("So luot choi: " + (int) totalGame);
        System.out.println("So luot du doan: " + (int) totalGuessTime);
        System.out.println("So luot du doan trung binh: " + df.format(((totalGuessTime / totalGame) * 10 / 10)));
        System.out.println("So luot du doan tot nhat: " + bestGame);
        showSeperator();
    }


    /**
     * - Hàm main: vòng lặp xử lý và gọi các hàm...v.v.
     * - Đầu tiên khởi tạo biến guessTime, bestGame,
     * playChoice, totalGame, totalGuessTime.
     * - Khởi tạo object kiểu scanner thu input người dùng
     * - Sau đó tạo vòng lặp do-while, đầu tiên tăng tổng số
     * lượt chơi, sau đó gán biến guessTime là giá trị trả
     * về từ hàm play và gọi hàm play, sau đó so sánh nếu
     * số lần dự đoán < số lần dự đoán tốt nhất thì số lần dự
     * đoán tốt nhất = số lần dự đoán lượt chơi vừa rồi, sau
     * đó hỏi người dùng muốn chơi lại không
     * - Lặp đến khi người dùng từ chối chơi lại
     * - Báo cáo KQ
     */

    public static void main(String[] args) {
        int guessTime = 1, bestGame = Integer.MAX_VALUE;
        String playChoice;
        float totalGame = 0, totalGuessTime = 0;
        Scanner input = new Scanner(System.in);
        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();

        do {
            totalGame++;
            guessTime = play();
            if (guessTime < bestGame) {
                bestGame = guessTime;
            }
            totalGuessTime += guessTime;

            showSeperator();

            System.out.println("Ban co muon choi lai khong? [y/n]?"); // Hỏi người chơi muốn chơi lại không
            playChoice = input.nextLine();
        } while (playChoice.equalsIgnoreCase("y") || playChoice.equalsIgnoreCase("yes"));

        report(totalGame, totalGuessTime, bestGame);

        input.close(); // Đóng input tránh mem leak
    }
}