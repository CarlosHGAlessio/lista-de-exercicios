package EX1D2305;
import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sub, n1, n2, soma, diva, multi;
        System.out.println( "Informe o primeiro numero!");
        n1 = input.nextInt();
        System.out.println( "Informe o segundo numero!");
        n2 = input.nextInt();
        soma = n1 + n2;
        System.out.println( "A soma dos dois numeros é: " + soma);
        sub = n1 - n2;
        System.out.println( "A subtracao dos dois numeros é: " + sub);
        multi = (n1) * (n2);
        System.out.println( "A multiplicacao dos dois numeros é: " + multi);
        diva  = n1 / n2;
        System.out.println( "A divisao dos dois numeros é: " + diva);

        }
    }
