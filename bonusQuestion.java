import java.util.Random;

public class bonusQuestion {
    public static void main(String[] args){
        Random random = new Random();
        int notes [][] = new int[5][4];
        int enYuksekSkor=-1;
        int enYüksekQuiz=0;
        int enYüksekÖğrenci=0;

        System.out.println("Notlar:");
        for(int i = 0 ; i<5;i++){
            double toplam=0;
            for(int j = 0 ; j<4;j++){
                notes[i][j] = random.nextInt(0,101);

                toplam =toplam+notes[i][j];
                if(notes[i][j]>enYuksekSkor){
                    enYuksekSkor=notes[i][j];
                    enYüksekÖğrenci=i;
                    enYüksekQuiz=j;

                }
                System.out.print(notes[i][j]+" ");

            }
            double ortalama = toplam/4.0;
            System.out.println("\n"+i+".öğrencinin ortalaması: " + ortalama);
            System.out.println();


        }
        System.out.println("Quiz ortalamaları:");
        for(int j = 0;j<4;j++){
            double quizToplamı = 0;
            for(int i = 0;i<5;i++){
                quizToplamı=quizToplamı+notes[i][j];
            }
            double quizOrtalaması=quizToplamı/5.0;
            System.out.printf("\n%d . quiz ortalamalası:%.2f",j,quizOrtalaması);

        }
        System.out.println("\nEn yüksek skor: "+enYuksekSkor+ " (Konum: "+ enYüksekÖğrenci+" - "+enYüksekQuiz+" quiz)");

    }
}
