public class Main {

    public static void main(String[] args) {

        berechneFakultaet(0);
        whileFakultät(3);

    }

    static void berechneFakultaet(int zahl) {

        for (int k = 0; k <= 10; k++) {

            int fakultaet = 1;
            for (int i = 1; i <= k; ++i) {

                fakultaet = fakultaet * i;

            }
            System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
            zahl++;
        }



    }static int whileFakultät(int fak){
        int count=fak;
        int fakultaet = 1;
        while(count==fak)
        {

            for (int i = 1; i <= fak; ++i) {

                fakultaet = fakultaet * i;


            }
            System.out.println("Die Fakultät von " + fak + " ist: " + fakultaet);
            count++;

        }
        return fakultaet;
    }
}
