package Patterns.Stars;

public class Pattern_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("+" + " ");
            }
            for (int k = i; k <= 5; k++) {
                    System.out.print("*" + " ");
                }
            System.out.println();
            }
        }
}
