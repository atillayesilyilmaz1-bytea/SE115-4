import java.util.Random;

public class senario3_lab6 {
    public static void main(String[] args){
        Random random = new Random();
        String [] hava = new String[100];

        for (int i =0;i<40;i++){
            hava[i]="Güneşli";
        }
        for(int i = 40; i<70 ; i++){
            hava[i]="Bulutlu";
        }
        for (int i = 70; i<90; i++){
            hava[i]="Yağmurlu";
        }
        for (int i = 90; i<100;i++){
            hava[i]="Fırtınalı";
        }
        int güneşli = 0;
        int bulutlu = 0;
        int yağmurlu = 0;
        int fırtınalı = 0;
        for (int i = 0 ; i<1000000;i++) {
            int index = random.nextInt(hava.length);
            String bugununHavası = hava[index];
            if(bugununHavası.equals("Güneşli")) güneşli++;
            else if(bugununHavası.equals("Bulutlu")) bulutlu++;
            else if(bugununHavası.equals("Yağmurlu")) yağmurlu++;
            else if(bugununHavası.equals("Fırtınalı")) fırtınalı++;


        }
        System.out.println("Güneşli: " + güneşli + " gün → %" + (güneşli/1000000.0*100));
        System.out.println("Bulutlu: " + bulutlu + " gün → %" + (bulutlu/1000000.0*100));
        System.out.println("Yağmurlu: " + yağmurlu + " gün → %" + (yağmurlu/1000000.0*100));
        System.out.println("Fırtınalı: " + fırtınalı + " gün → %" + (fırtınalı/1000000.0*100));






    }
}
