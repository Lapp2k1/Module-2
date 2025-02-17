import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán:");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm Lý:");
        double physics = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm Hoá:");
        double chemistry = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm Văn:");
        double literature = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm Tiếng Anh:");
        double english = Double.parseDouble(scanner.nextLine());

        double average = (math + physics + chemistry + literature + english) / 5;
        System.out.println("Điểm trung bình: " + average);

        if (average >= 0 && average < 5) {
            System.out.println("Xếp loại: yếu");
        } else if (average >= 5 && average < 6.5) {
            System.out.println("Xếp loại: trung bình");
        } else if (average >= 6.5 && average < 8) {
            System.out.println("Xếp loại: khá");
        } else if (average >= 8 && average < 9) {
            System.out.println("Xếp loại: giỏi");
        } else if (average >= 9) {
            System.out.println("Xếp loại: xuất sắc");
        }
    }
}
