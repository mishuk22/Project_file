import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.replaceAll("a","d");
        System.out.println(s);

    }
}
