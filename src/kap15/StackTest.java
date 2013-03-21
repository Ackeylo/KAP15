package kap15;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> minStack = new Stack<>();
        char svar = 0;
        boolean fortsatt = true;
        while (fortsatt) {
            System.out.print("STACK: ");
            if (minStack.isEmpty()) {
                System.out.print("Ingen stack just nu");
            } else {
                for (String namn : minStack) {
                    System.out.print(namn + " ");
                }
            }
            System.out.println();
            System.out.println("Välj:");
            System.out.println("1. Lägg en tallrik på tallrikstraven");
            System.out.println("2. Vems tallrik ligger nu högst upp?");
            System.out.println("3. Ta bort översta tallriken");
            System.out.println("0. Avsluta");
            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        System.out.print("Vems tallrik? ");
                        String namn = sc.nextLine();
                        minStack.push(namn);
                        break;
                    case '2':
                        System.out.print("Högst upp är " + minStack.peek() + " tallrik");
                        System.out.print(" (Tryck ENTER)");
                        sc.nextLine();
                        break;
                    case '3':
                        System.out.print("Tar bort " + minStack.pop() + " tallrik");
                        System.out.print(" (Tryck ENTER)");
                        sc.nextLine();
                        break;
                    case '0':
                        fortsatt = false;
                        System.out.println("SLUT");
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }
            System.out.println();
        }
    }
}