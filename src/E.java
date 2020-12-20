import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class E {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream text = new FileInputStream("C://Users//student//IdeaProjects//ClassWork1//src//Names");
        Scanner scanner = new Scanner(text);
        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        int a = 0;
        while (scanner.hasNextLine()){
            String string = scanner.nextLine();
            a++;
        }
        ArrayList arr = new ArrayList();
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            arr.add(scanner.nextLine());
        }
     //   for (int i = 0; i < a; i++) {
     //       if (arr[i].contains(str)){
     //           System.out.println(arr[i]);
     //       }
     //   }
            }
        }


