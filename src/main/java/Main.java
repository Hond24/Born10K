import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LocalDate birthDate = null;

    // 生年月日のフォーマット
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // 正しい入力が得られるまで繰り返す
    while (birthDate == null) {
      try {
        System.out.print("生年月日を入力してください (例: 2000-03-01): ");
        String input = scanner.nextLine();

        // 入力をLocalDateに変換
        birthDate = LocalDate.parse(input, formatter);
      } catch (DateTimeParseException e) {
        System.out.println("正しい形式で入力してください。例: 2000-03-01");
      }
    }

    // 生後10000日目を計算
    LocalDate dateAfter10000Days = birthDate.plusDays(10000);

    // 日付をフォーマットして出力
    String formattedDate = dateAfter10000Days.format(
        DateTimeFormatter.ofPattern("yyyy年M月d日")
    );
    System.out.println("あなたの生後10000日は、" + formattedDate + "です！");
  }
}
