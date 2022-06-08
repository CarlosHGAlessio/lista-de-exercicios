package EX1D2305;

import java.util.Scanner;

public class exe2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pc, vv, a, p;
        System.out.print("Informe o preço do produto R$: ");
        pc = input.nextDouble();
        System.out.print("Informe o percentual: ");
        p = input.nextDouble();
        p = p / 100;
        a = pc * p;
        vv = a + pc;

        System.out.println("O valor do acréscimo: " + a);
        System.out.println("O preço de venda é de: " + vv);
    }
}
