
package java9;

public class Statistik {
public static void main( String[] arg ) {
int n = 100;
int[] a = new int[n];
System.out.print("Dessa tal slumpas till arrayen:");
for(int i = 0 ; i < n ; i++) {
if(i%10==0) System.out.println();
a[i] = (int)( 1000 * Math.random() );
System.out.print(a[i]+"\t");
}
int summa, max, min;
double medel;
summa = 0; max = -1; min = 1000;
for(int i = 0; i < n; i++) {
summa = summa +a[i];
if (a[i]>max) max = a[i];
if (a[i]< min) min = a[i];
}
medel = (double)summa/n;
System.out.println(" ");
System.out.println("Summa = " + summa + " Medel = " + medel);
System.out.println("Max = " + max + " Min = " + min);
}
}
