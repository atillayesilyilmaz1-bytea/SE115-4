import java.util.Scanner;
public class factorial {
    public static int reFact(int n){
        if(n==0||n==1){
            return 1;

        }
        else{
            return n * reFact(n-1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        System.out.println(reFact(n));
        scanner.close();
    }
}
