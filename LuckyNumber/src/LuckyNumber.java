/* TODO
- Đặt hàm rõ nghĩa
- Ghi chú trước hám
 */

import java.util.Scanner;
import java.text.*;

public class LuckyNumber {
    public static final int max = 100; // Định nghĩa hằng số max cho random

    static void showSeperator() {
        System.out.println("=======================================");
    }

    static void showBrand() {
        System.out.println("S   O    M   A   Y    M   A   N");
    }

    static void clearScreen() { // Biến dùng để xoá màn hình dùng ký tự ASCII
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * 
     */

    static int play() {
        int guessTime = 1; // Khởi tạo biến guessTime kiểu int có giá trị = 1

        Scanner input = new Scanner(System.in); // Tạo 1 object scanner mới
        int randomNumber = (int) Math.floor(Math.random() * (max - 1 + 1) + 1); // Tạo số ngẫu nhiên dùng class
                                                                                // Math.random()
        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();
        System.out.print("Xin vui long nhap so ban doan: "); // In ra thông báo

        int playerNumber = input.nextInt(); // Khởi tạo biến playerNumber (dùng để trữ số đoán) lưu trữ số dự đoán người
                                            // chơi nhập

        do {
            if (playerNumber > randomNumber) { // Nếu số người chơi dự đoán > số ngẫu nhiên => thông báo số ngẫu nhiên <
                                               // hơn
                System.out.println("\nSo may man nho hon so du doan cua ban!\n");
            }

            else if (playerNumber < randomNumber) { // Nếu số người chơi dự đoán < số ngẫu nhiên => thông báo số ngẫu
                                                    // nhiên > hơn
                System.out.println("\nSo may man lon hon so du doan cua ban!\n");
            }

            System.out.print("Xin vui long nhap so ban doan: "); // Lặp lại để nhập lại và update playerNumber xem trúng
                                                                 // hay không (check tại hàm while)

            playerNumber = input.nextInt(); // Biến playerNumber update lại
            guessTime++; // Biến guessTime lưu trữ số lần đoán
            if (playerNumber == randomNumber) { // Nếu số người chơi nhập = số ngẫu nhiên thì in ra thông báo chúc mừng
                System.out.println("Chuc mung ban da doan dung sau " + guessTime + " lan du doan!");
            }
        } while (playerNumber != randomNumber);

        return guessTime;
    }

    static void report(float totalGame, float totalGuessTime, int bestGame) { // Hàm report dùng để in báo cáo game,
                                                                              // truyền dữ liệu số lượt chơi, số lượt
                                                                              // đoán và lượt chơi tốt nhất vào
        DecimalFormat df = new DecimalFormat("#.#");

        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();
        System.out.println("B A O   C A O   G A M E");
        showSeperator();
        System.out.println("So luot choi: " + (int) totalGame); // In ra số lượt chơi
        System.out.println("So luot du doan: " + (int) totalGuessTime); // In ra số lượt dự đoán
        System.out
                .println("So luot du doan trung binh: " + df.format((float) ((totalGuessTime / totalGame) * 10 / 10))); // In
                                                                                                                        // ra
                                                                                                                        // số
                                                                                                                        // lượt
                                                                                                                        // dự
        // đoán trung bình,
        // dùng công thức
        // từ biến có sẵn
        System.out.println("So luot du doan tot nhat: " + (int) bestGame); // In ra số lượt dự đoán/ chơi tốt nhất
                                                                           // (bestGame)
        showSeperator();
    }

    public static void main(String[] args) {
        int guessTime = 1, bestGame = Integer.MAX_VALUE; // Khỏi tạo guesstime có giá trị = 0, bestGame có giá trị lớn
                                                         // nhất của số kiểu int
        float totalGame = 0, totalGuessTime = 0; // Khởi tạo biến totalGuessTime và totalGame kiểu float, đều = 0
        Scanner input = new Scanner(System.in); // Khởi tạo 1 object cho scanner tên input
        clearScreen();
        showSeperator();
        showBrand();
        showSeperator();

        do {
            totalGame++; // Đầu tiên tăng tổng số lượt chơi
            guessTime = play(); // Tiếp theo vừa lấy số dự đoán từ KQ trả về vừa thực thi hàm play()
            if (guessTime < bestGame) { // So sánh lượt dự đoán vừa rồi với lượt dự đoán này, cái nào bé hơn được dữ lại
                bestGame = guessTime;
            }
            totalGuessTime += guessTime; // Thêm số lượt dự đoán vào tổng lượt dự đoán

            showSeperator();

            System.out.println("Ban co muon choi lai khong? [y/n]?"); // Hỏi người chơi muốn chơi lại không
            playChoice = input.nextLine();
        } while (playChoice.equalsIgnoreCase("y") == true || playChoice.equalsIgnoreCase("yes") == true); // => vòng lặp
                                                                                                          // chỉ thực
                                                                                                          // thi khi
                                                                                                          // người chơi
                                                                                                          // chơi lại

        report(totalGame, totalGuessTime, bestGame); // Nếu không chơi lại sẽ báo cáo KQ

        input.close(); // Đóng input tránh mem leak
    }
}