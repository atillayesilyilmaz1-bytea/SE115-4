import java.util.Random;

public class senario4_lab6 {
    public static void main(String[] args){
        int[] myArray = randomArray(30,1,101);
        int enYüksek=0;
        System.out.print("Bulunan tepeler: ");
        for (int i=1; i<myArray.length-1;i++){
            if(myArray[i]>myArray[i+1]&&myArray[i]>myArray[i-1]){
                System.out.print(+myArray[i] + " ");
                if(myArray[i]>enYüksek){
                    enYüksek=myArray[i];
                }
            }
        }
        System.out.println("\nEn yüksek tepe değeri: " + enYüksek);

    }
    public static int[] randomArray(int size, int min, int max){
        Random random = new Random();
        int[] arr = new int[size];
        for(int i =0;i< arr.length;i++){
            arr[i]=random.nextInt(max);
        }
        return arr;
    }
}
