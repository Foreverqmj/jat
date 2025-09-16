import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        try {
            // 输入第一个日期
            System.out.print("请输入第一个日期 (格式: yyyymmdd): ");
            String dateStr1 = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(dateStr1, formatter);

            // 输入第二个日期
            System.out.print("请输入第二个日期 (格式: yyyymmdd): ");
            String dateStr2 = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(dateStr2, formatter);

            // 计算天数差
            long daysBetween = Math.abs(ChronoUnit.DAYS.between(date1, date2));
            System.out.println(daysBetween);

        } catch (Exception e) {
            System.out.println("日期格式错误！请使用8位数字格式: yyyymmdd");
            System.out.println("示例: 20240115, 20241231");
        }

        scanner.close();
    }
}