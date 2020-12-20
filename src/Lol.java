import java.util.Scanner;
public class Lol {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r++;
                arr[i][j] = String.valueOf(r);
            }
        }
        printArray(arr);
        for (int t = 0; t < 9; t++) {
            System.out.println("\n\nPlayer 1: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[a][b] = "X";
            printArray(arr);
            if (check(arr, "\n\nplayer 1 won")) break;
            System.out.println("\n\nPlayer 2: ");
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            arr[c][d] = "0";
            printArray(arr);
            if (check(arr, "\n\nplayer 2 won")) break;
        }
    }
    private static boolean check(String[][] arr, String s) {
        if ((arr[0][0].equals(arr[0][1]) & arr[0][0].equals(arr[0][2])) | (arr[1][0].equals(arr[1][1]) & arr[1][0].equals(arr[1][2])) | (arr[2][0].equals(arr[2][1]) & arr[2][0].equals(arr[2][2])) | (arr[0][0].equals(arr[1][0]) & arr[0][0].equals(arr[2][0])) | (arr[0][1].equals(arr[1][1]) & arr[0][1].equals(arr[2][1])) | (arr[0][2].equals(arr[1][2]) & arr[0][2].equals(arr[2][2])) | (arr[0][0].equals(arr[1][1]) & arr[0][0].equals(arr[2][2])) | (arr[0][2].equals(arr[1][1]) & arr[0][2].equals(arr[2][0]))) {
            System.out.println(s);
            return true;
        }
        return false;
    }
    private static void printArray(String[][] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "     ");
            }
        }
    }
}












