/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap15;

import java.util.Scanner;
import java.util.Hashtable ;


public class HashTest {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Hashtable<String, String> ht = new Hashtable<String, String>();
            ht.put("Danmark", "Köpenamn");
            ht.put("Sverige", "Stockholm");
            ht.put("Norge", "Oslo");
            ht.put("Ryssland", "Moskva");
            ht.put("Tyskland", "Berlin");
            ht.put("Finland", "Helsingfors");
            ht.put("Frankrike", "Paris");
            System.out.print("Land? ");
            String land = sc.nextLine();
            while (!land.equals("#")) {
                System.out.println("Huvudstad: " + ht.get(land));
                System.out.print("Land? ");
                land = sc.nextLine();
            }
            System.out.println("SLUT");
        }
    }
