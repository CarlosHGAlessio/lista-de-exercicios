package EX1D2305;
import java.util.Scanner;
public class exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float media, dist, tot;
        System.out.println( "Informe a distancia");
        dist = input.nextInt();
        System.out.println( "Informe o total de combustivel gasto");
        tot = input.nextInt();

        media = dist / tot;
        System.out.println( "O consumo medio do automovel foi de: " + media);
}
}