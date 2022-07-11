import java.util.Scanner;

public class atividade08{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float quilo, libra;
        System.out.println("Informe a quantidade em libras: ");
        libra = input.nextFloat();
        quilo = (libra * 454)/1000;
        System.out.println("A conversão para quilos é: " + quilo);
        
        System.out.println("Informe a quantidade em quilos: ");
        quilo = input.nextFloat();
        libra = (quilo * 1000)/454; 
        System.out.println("A conversão para libras é de: " + libra);
    
    
    }
    
    
    }


