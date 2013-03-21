
package java9;
public class Slump {
    
    public static void main(String[] args) {
        
        int n = 100;
        int[] a = new int[n];
        
        System.out.print("Arrayens element slumpas och skrivs ut: ");
        
        for (int i = 0; i < a.length; i++) {
            if (i%10==0){
                System.out.println("");
                
            }
            a[i] = (int)(1000 * Math.random()) ;
            System.out.print(a[i] + "\t");
         
            
            
        }//end for
    }//end main
}//end class
