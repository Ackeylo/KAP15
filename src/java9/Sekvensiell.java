package java9;

import java.util.Scanner;

public class Sekvensiell {
public static void main( String[] arg ) {
Scanner sc = new Scanner(System.in);
int[] arr = { 13 , 15, 7 , 3 ,11 , 21 , 25 , 23 , 9 , 5 , 17} ;
int pos = -1;
System.out.print("Vilket heltal söker du? ");
int t = sc.nextInt();
for(int i = 0 ; i < arr.length ; i++) {
if( t== arr[i]){
pos = i;
i = arr.length; // loopen slutar
}
}
if (pos == -1) System.out.println("Talet hittades inte!");
else System.out.println("Talet finns i element nummer " + pos);
}
}
