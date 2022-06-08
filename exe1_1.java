package EX1D2305;

import java.util.Scanner;

public class exe1_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double j, c, i, m, j1, t;
    System.out.println( "Informe o depósito R$ :");
    c = input.nextDouble();
    System.out.println( "Informe a quantidade de meses:");
    t = input.nextDouble();
    System.out.println( "Informe a taxa em meses:");
    i = input.nextDouble();
    i= i/100;
    j =(c * t * i);
    m = (c + j);
    j1 = (j / t);
    System.out.println( "O redimento ao mês é de: " + j1);
    System.out.println( "O rendimento ao final dos " + t + " meses foi de: " + j);
    System.out.println( "O rendimento no final do tempo foi de: " + m);
    }
}
