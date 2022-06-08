package EX1D2305;

import java.util.Scanner;

public class exe3_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alu, ali, ct, tp, tot, salide, eu, gu;
        System.out.print("Informe o preço do aluguel R$: ");
        alu = input.nextDouble();
        System.out.print("Informe a quantia para alimentação: ");
        ali = input.nextDouble();
        System.out.print("Informe a quantia das contas + Gás se for casa: ");
        ct = input.nextDouble();
        System.out.print("Informe a quantia para transporte: ");
        tp = input.nextDouble();

        tot = alu + ali + ct + tp;
        salide = tot * 2;
        System.out.println("O salario ideal seria de: R$" + salide);
        eu = salide * 0.3;
        gu = salide * 0.2;
        System.out.println("E ssa quantia para gastos: R$" + tot);
        System.out.println("Essa quantia ira para diversão: R$" + eu);
        System.out.println(" Essa quantia ira para guardar: R$" + gu);
        ;

    }
}
