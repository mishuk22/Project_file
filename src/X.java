import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(";");
        int b = ss[2].length();
        String as = "*".repeat(b);
        System.out.println(ss[0]+":"+"\nЭлектронная почта - "+ss[1]+"\nПароль - "+as);
    }
}
