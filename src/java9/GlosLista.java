package java9;

import java.util.HashMap;
import java.util.Scanner;

public class GlosLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> ht = new HashMap<>();
        char svar;
        boolean fortsatt = true;
        int antalRatt = 1;
        while (fortsatt) {
            System.out.println();
            System.out.println("Välj:");
            System.out.println("1. Skapa Gloslistan");
            System.out.println("2. Visa Gloslistan");
            System.out.println("3. Skriv in en ny glosa");
            System.out.println("4. Glosförhör");
            System.out.println("0. Avsluta");
            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        ht.put("Sol", "Sun");
                        ht.put("Hej", "Hello");
                        ht.put("Måne", "Moon");
                        ht.put("Regn", "Rain");
                        ht.put("Snow", "Snö");
                        System.out.println("Klart");
                        break;
                    case '2':
                        System.out.print("Glosa? ");
                        String Glos = sc.nextLine();
                        System.out.println("Glosa: " + ht.get(Glos));
                        break;
                    case '3':
                        System.out.println("Ange det svenska ordet: ");
                        String Glosa = sc.next();
                        System.out.println("Ange det engelska ordet: ");
                        String uzd = sc.next();
                        ht.put(Glosa, uzd);
                        break;
                    case '4':
                        for (String nyckel : ht.keySet()) {
                            System.out.print("Vad heter: " + nyckel + " På engelska? ");
                            String svaret = sc.next();
                            if (svaret.equals(ht.get(nyckel))) {
                                System.out.println("Rätt!");
                                antalRatt++;

                            } else {
                                System.out.println("Fel! Rätt svar är " + ht.get(nyckel));
                            }
                            
                        }
                        System.out.println("Antalet rätta: " + antalRatt  );
                        break;
                    case '0':
                        System.out.println("SLUT");
                        break;
                    default:
                        break;
                } // vof switch
            } // end of try
            catch (Exception e) {
            }
            System.out.println();








        }
    }//end main
}//end class
