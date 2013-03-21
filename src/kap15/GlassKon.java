package kap15;

import java.util.LinkedList;
import java.util.Scanner;

public class GlassKon {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<String> GlassKo = new LinkedList<>();
        int val = 1;
        boolean fortsatt = true;
        
        
                    GlassKo.add("Kalle");
                    GlassKo.add("Lisa");
                    GlassKo.add("Anna");
                    GlassKo.add("Johan");
                    GlassKo.add("Stina");
                    GlassKo.add("Pelle");
                    
        
                
        while (fortsatt) 
        {    
            int plats = 1;
            if(GlassKo.isEmpty()){
                System.out.println("Listan är tom");
            }else {
                for (int i = 0; i < GlassKo.size(); i++) {
                    System.out.println(++plats + ". " + GlassKo.get(i));
                }// end forluup
            }//end if else
            
        System.out.print("Dina val");
        System.out.println("1. Lägg till en ny person ");
        System.out.println("2. Vem står först i kön: ");
        System.out.println("3. Ta bort en person: ");
        System.out.println("0. Avsluta: ");
        System.out.println("");
        System.out.println("Välj alternativ som du vill göra: ");
        
        val = sc.nextInt();
        
        
        switch (val) {
            
                case 1:
                    
                    
                    System.out.println("Ange en person: ");
                    String person = sc.next();
                    GlassKo.add(person);
                    
                    break;
                
                case 2:
                    System.out.print("Först i kön: " + GlassKo.getFirst());
                    System.out.println("");
                    
                    break;
                    
                case 3:
                    
                    GlassKo.removeFirst();
                
                    break;
                    
                case 0:
                    fortsatt = false;
                System.out.println("GOODBYEEEEEEEEEEE!!!!!!!!");
                break;
                default:
                System.out.println("Fel inmatning");
              }//end switch
   
      }//end while
    }//end main
 }//end class
//tjena