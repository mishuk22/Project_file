import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        byte c = scanner.nextByte();
        byte d = scanner.nextByte();
        if (a-1==c & b+1==d | a-2==c & b+2==d | a-3==c & b+3==d | a-4==c & b+4==d | a-5==c & b+5==d | a-6==c & b+6==d | a-7==c & b+7==d){
            System.out.println("YES");
        }else{
            if(a+1==c & b+1==d | a+2==c & b+2==d | a+3==c & b+3==d | a+4==c & b+4==d | a+5==c & b+5==d | a+6==c & b+6==d | a+7==c & b+7==d){
                System.out.println("YES");
            }else{
                if(a-1==c & b-1==d | a-2==c & b-2==d | a-3==c & b-3==d | a-4==c & b-4==d | a-5==c & b-5==d | a-6==c & b-6==d | a-7==c & b-7==d){
                    System.out.println("YES");
                }else{
                    if(a+1==c & b-1==d | a+2==c & b-2==d | a+3==c & b-3==d | a+4==c & b-4==d | a+5==c & b-5==d | a+6==c & b-6==d | a+7==c & b-7==d){
                        System.out.println("YES");
                    }else{
                        if(a==c | b==d){
                            System.out.println("YES");
                        }else{
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}



