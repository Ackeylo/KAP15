package kap15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LankadListaTest {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> namnLista = new ArrayList<>();
        int val = 1;
        boolean fortsatt = true;
                
        while (fortsatt) 
        {    
            if(namnLista.isEmpty()){
                System.out.println("Listan är tom");
            }else {
                for (int i = 0; i < namnLista.size(); i++) {
                    System.out.println( i + ". " + namnLista.get(i));
                }// end forluup
            }//end if else
            
        System.out.print("Dina val");
        System.out.println("1. Fyll i listan med namn: ");
        System.out.println("2. Lägg till ett namn: ");
        System.out.println("3. Lägg till ett namn på en viss plats: ");
        System.out.println("4. Se element nummer:  ");
        System.out.println("5. Ta bort element nummer: ");
        System.out.println("6. Ta bort ett namn: ");
        System.out.println("7. Ta bort alla: ");
        System.out.println("0. Avsluta: ");
        System.out.println("");
        System.out.println("Välj alternativ som du vill göra: ");
        
        val = sc.nextInt();
        
        
        switch (val) {
            
                case 1:
                    
                    
                    namnLista.add("Kalle");
                    namnLista.add("Lisa");
                    namnLista.add("Anna");
                    namnLista.add("Johan");
                    namnLista.add("Stina");
                    namnLista.add("Pelle");
                    
                    break;
                
                case 2:
                System.out.println("Ange namnet: ");
                    String namn = sc.next();
                    if(namn.equals("")){
                        namnLista.add(namn);
                    }
                    break;
                    
                case 3:
                System.out.println("Ange platsen");
                int plats = sc.nextInt();
                    System.out.println("Ange namnet: ");
                    namn = sc.next();
                    namnLista.add(plats, namn);
                    break;
                    
                case 4:
                System.out.println("Ange vilken dag du vill granska: ");
                plats = sc.nextInt();
                System.out.println("Platsen har namnet : " + namnLista.get(plats));
                    break;
                    
                case 5:
                System.out.println("Ange platsen du vill ta bort: ");
                plats = sc.nextInt();
                namnLista.remove(plats);
                    break;
                    
                case 6:
                System.out.println("Ange namnet du vill ta bort: ");
                    namn = sc.next();
                    boolean hittad = false;
                    if(namn.equals("")){
                        for (String namnetIListan : namnLista) {
                            if(namnetIListan.equals(namn)){
                                namnLista.remove(namn);
                                hittad = true;
                            }       
                        }//end for
                    }else{
                        System.out.println("Du måste ange ett namn");
                    }
                    if(hittad == false){
                        System.out.println("Namnet finns inte i listan");
                    }           
                    break;
                    
                case 7:
                    System.out.println("Vill du ta bort lista? (j/n)");
                    char taBort = sc.next().charAt(0);
                    if (taBort == 'j' || taBort == 'J') {
                        namnLista.clear();
                        System.out.println("");
                    } else {
                        System.out.println("ångra dig!");
                        System.out.println("");
                        }
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
