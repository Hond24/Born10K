import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

       LocalDate birthDate =LocalDate.of(2000,3,1);

       LocalDate dateAfter10000Days = birthDate.plusDays(10000);

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

      String formattedDate = dateAfter10000Days.format(formatter);

      System.out.println("私の生後10000日は、" + formattedDate + "です！");
    }
}


//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//public class Main {
//  public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("2000-03-01");
//    String input = scanner.nextLine();
//
//    LocalDate birthDate = LocalDate.parse(input);
//
//    LocalDate dateAfter10000Days = birthDate.plusDays(10000);
//
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//    String formattedDate = dateAfter10000Days.format(formatter);
//
//    System.out.println("生後10000日の日付は：" + formattedDate);
//  }
//}


