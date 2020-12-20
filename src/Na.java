import java.util.Scanner;

public class Na {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            get();
        }
    }
    public static void get(){
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        if (str.charAt(0) == '2' & str.charAt(1) == '0' & str.charAt(n - 1) == '0' & str.charAt(n - 2) == '2' || str.charAt(0) == '2' & str.charAt(1) == '0' & str.charAt(2) == '2' & str.charAt(3) == '0' || str.charAt(n - 4) == '2' & str.charAt(n - 3) == '0' & str.charAt(n - 2) == '2' & str.charAt(n - 1) == '0' || str.charAt(0) == '2' & str.charAt(1) == '0' & str.charAt(2) == '2' & str.charAt(n - 1) == '0' || str.charAt(0) == '2' & str.charAt(n - 3) == '0' & str.charAt(n - 2) == '2' & str.charAt(n - 1) == '0') {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
