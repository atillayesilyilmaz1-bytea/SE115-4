import java.util.Random;
import java.util.Arrays;
public class senario2_lab6 {
    public static int[] döndürülmüş(int[] arr){
        int last = arr[arr.length-1];
        for (int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];

        }
        arr[0]=last;
        return arr;
    }

    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[5];
        for(int i = 0 ; i<arr.length;i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Orjinal dizi:"+ Arrays.toString(arr));
        arr = döndürülmüş(arr);
        System.out.println("Dönmüş hali:"+Arrays.toString(arr));


    }
}
