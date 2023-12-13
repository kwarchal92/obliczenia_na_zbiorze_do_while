package obliczenia_na_zbiorze_do_while;

import java.util.Random;

public class Obliczenia {

    public static void main(String[] args)
    {
        int ilosc_liczb = 5, i = 1;
        double liczba, suma = 0, min, max;

        System.out.println("Program losuje " + ilosc_liczb + "liczb calkowitych od 0 do 99.");
        System.out.println("Nastepnie znajduje najwieksza i najmniejsza z nich.");
        System.out.println("Na koniec liczy średnia ze wszystkich wylosowanych liczb.");

        Random r  = new Random();
        min = Math.round(100 * (r.nextDouble()));

        System.out.println("System wylosowal liczby: \n" + min + ",");
        max = min;
        suma += max;

        do
        {
            liczba = Math.round(100 *(r.nextDouble()));
            System.out.println(liczba + ",");

            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma += liczba;
            i++;
        }
        while( i <= ilosc_liczb - 1);

        System.out.println();
        System.out.println("najwieksza liczba to: " + max + ".");
        System.out.println("najmniejsza liczba to: " + min + ".");
        System.out.println("srednia = " + suma / ilosc_liczb + ".");

    }
}
