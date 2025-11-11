public class senario1_lab6 {
    static int[]growRoster(int[] eskiListe,int yeniListe){
        int []yeniBoyut = new int[42];
        for (int i = 0 ; i<eskiListe.length;i++){
            yeniBoyut[i]=eskiListe[i];

        }
        return yeniBoyut;
    }
    public static void main(String[] args){
        int[] oldRoster= new int[20];
        for (int i=0; i<oldRoster.length;i++){
            oldRoster[i]=1000+i;
 
        }
        int[] newRoster = growRoster(oldRoster, 42);
        System.out.println("Eski liste:");
        for (int id : oldRoster) {
            System.out.print(id + " ");
        }
        System.out.println("\n\nYeni Liste:");
        for (int id : newRoster) {
            System.out.print(id + " ");
        }

    }

}
