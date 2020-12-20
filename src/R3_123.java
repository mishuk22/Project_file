
import java.util.Scanner;
public class R3_123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int a = 0;
                int b = 1;
                int [] arr = new int[n+1];
                int j = 0;
                for(int i = -1; i!=n; i++){
                    arr[j] = b;
                    b = a+b;
                    a=a+b-(b=a);
                    j++;
                }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i<n){
                System.out.print(" ");
            }
        }
            }
        }



