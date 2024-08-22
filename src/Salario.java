import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();


        System.out.println("Digite o salário mínimo atual: ");
        double salarioMinimo = sc.nextDouble();


        double quantSalario = salario / salarioMinimo;


        System.out.printf("Voce ganha %.2f: " , quantSalario , " Salarios Mínimos!");


        sc.close();


    }
}
