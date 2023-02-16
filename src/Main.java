import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int [6];
        System.out.println("Elementele Sirului 1 sunt: ");

        for (int pos = 0; pos < array.length; pos++) {
            array[pos] = pos + 10;
            System.out.print(array[pos] + " ");
        }

        System.out.println();
        System.out.println("_______________________________________");

        float sum = 0.0f;
        float avr;
        float sumBid = 0.0f;
        float avrBid;
        int pare = 0;
        int impare = 0;
        int pareBid = 0;
        int impareBid = 0;

        int[] arrayUni = {10, 25, 35, 40, 55, 65, 73};
        System.out.println();
        System.out.println("Elementele Sirului 2 sunt: ");
        for (int pos1 = 0; pos1 < arrayUni.length; pos1++) {
            System.out.print(arrayUni[pos1] + " ");
            sum += arrayUni[pos1];   // sum = sum + arrayUni[pos1];

            if (arrayUni[pos1] % 2 == 0) {
                pare++;
            }   else {
                impare++;
            }
        }
        avr = sum / arrayUni.length;

        System.out.println();
        System.out.println("Suma Elementelor din Sirul 2 = " + sum);
        System.out.println("Media Elementelor din Sirul 2 = " + avr);
        System.out.println("Pare:   " + pare + " numere.");
        System.out.println("Impare:   " + impare + " numere.");
        System.out.println("_______________________________________");


        int[][] arrayBid = {{25, 30, 52, 15}, {68, 82, 10, 20}, {25, 63, 75, 40}, {20, 35, 56, 28}};
        System.out.println();
        System.out.println("Elementele Sirului Bidimensional sunt: ");
        for (int i = 0; i < arrayBid.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayBid.length; j++) {
                System.out.print(arrayBid[i][j] + " ");
                sumBid += arrayBid[i][j];

                if (arrayBid[i][j] % 2 == 0) {
                    pareBid++;
                }   else {
                    impareBid++;
                }
                }
            }
        avrBid = sumBid / (pareBid + impareBid);

        System.out.println();
        System.out.println("Suma Elementelor din Matrice = " + sumBid);
        System.out.println("Media Elementelor din Matrice = " + avrBid);
        System.out.println("Pare:   " + pareBid + " numere.");
        System.out.println("Impare:   " + impareBid + " numere.");
        System.out.println("_______________________________________");

        int[] arrayInversat = new int [6];
        System.arraycopy(array, 0, arrayInversat, 0, 6);
        System.out.println();
        System.out.println("Sirul Nr. 1 inversat este: ");
//        for (int poz : arrayInversat) {
//            System.out.print(poz + " ");
        for (int i = arrayInversat.length - 1; i >= 0; i--) {
            System.out.print(arrayInversat[i] + " ");
        }
        System.out.println();
        System.out.println("_______________________________________");
        System.out.println("Multumesc mult!  ;-)");
        }
}