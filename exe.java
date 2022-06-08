 package EX1D2305;
import java.util.Scanner;
public class exe {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Integer n1, n2, soma;
    System.out.println( "Informe o primeiro numero!");
    n1 = input.nextInt();
    System.out.println( "Informe o segundo numero!");
    n2 = input.nextInt();
    soma = n1 + n2;
    System.out.println( "A soma dos dois numeros é: " + soma);
    }
}