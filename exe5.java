package EX1D2305;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1;
        System.out.println("Informe um numero");
        n1 = input.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse numero é ímpar");
        }
    }
}