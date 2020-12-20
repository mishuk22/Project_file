import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x  = scanner.nextDouble();
        double y =  scanner.nextDouble();
        int i = 1;
        while (y >= Math.pow(1.7,i-1)*x){
            System.out.println(i);
            i++;
           }
        System.out.println(i);
    }
}


