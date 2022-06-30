public class Main {

    public static void main(String[] args) {

        berechneFakultaet(0);
        ;
    }

    static void berechneFakultaet(int zahl) {

        for (int k = 0; k <= 10; k++) {

            int fakultaet = 1;
            for (int i = 1; i <= k; ++i) {

                fakultaet = fakultaet * i;

            }
            System.out.println("Die Fakultät von " + k + " ist: " + fakultaet);

        }

    }
}
