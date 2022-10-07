public class Zmienne {
    public static void main(String[] args) {

        int liczba1;

        liczba1 = 13;
        double liczba2 = 0.8;

        System.out.println("Moja liczba wynosi " + liczba1
                + " druga liczba " +liczba2);

        liczba1 = (int)liczba2;
        System.out.println(liczba1);


        int workHoursPerYear;

        int days = 3;
        int hours = 8;
        int weeks = 52;

        // komentarze są zazwyczaj pomijane

        workHoursPerYear = days * hours * weeks;

        String napis = "Jest \"ładna\" pogoda\n";

        System.out.println("Mój \tnapis "     + napis);
        System.out.print("Mój\n napis "     + napis + "\n");
        System.out.print("Mój napis "     + napis);

        boolean slonce = true; //false

        char znak = '#';

    }
}
