package ba.unsa.etf.rpr;
import java.util.Scanner;

public class RPRPrviZadatak {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Molimo da unesete cijeli broj: ");
        int mojaVarijabla = ulaz.nextInt();

        for (int i = 1; i <= mojaVarijabla; i++)
            if (i % mojaSumaCifara(i) == 0)
                System.out.println(i);

        ulaz.close();
	}

    static int mojaSumaCifara(int broj) {
        int suma = 0;
        do {
            suma += broj % 10;
            broj /= 10;
        } while (broj != 0);
        return suma;
    }
}
