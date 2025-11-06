import java.util.Scanner;

public class senario1 {
    public static int sumDigit(int n ){
        if(n<10){
            return n;
        }
        else{
            return (n%10)+sumDigit(n/10);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = scanner.nextInt();
        System.out.println(sumDigit(n));
        scanner.close();
    }

}
