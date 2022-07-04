import java.util.Scanner;
import javax.swing.*;

public class Exercicio_6_e_7{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           Double salario, horastrab;
           String nome = "dirija-se";
            System.out.println("Informe as horas trabalhadas:");
            
            horastrab = input.nextDouble();
            
            salario = (horastrab * 10.25);
           
            System.out.println("Você irá receber: " + "R$ " + salario);
    
         //Atividade 7
            if (salario < 50) {
            JOptionPane.showMessageDialog(null,"Atenção, " + nome + " à direção do hotel");
        }

}
}