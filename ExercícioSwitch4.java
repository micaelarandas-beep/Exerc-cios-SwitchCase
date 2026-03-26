import java.util.Scanner;

public class ExercícioSwitch4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        
        System.out.println("Fale o seu plano de trabalho:");
        System.out.println("[A] ");
        System.out.println("[B] ");
        System.out.println("[C] ");
        System.out.print("Opção: ");
        char plano = scanner.next().toUpperCase().charAt(0);

        double novoSalario = 0;

        
        switch (plano) {
            case 'A':
                novoSalario = salarioAtual * 1.10; 
                break;
            case 'B':
                novoSalario = salarioAtual * 1.15; 
                break;
            case 'C':
                novoSalario = salarioAtual * 1.20; 
                break;
            default:
                System.out.println("Plano de trabalho inválido!");
                break;
        }

       
        if (novoSalario > 0) {
            System.out.printf("O novo salário é: R$ %.2f%n", novoSalario);
        }

        scanner.close();
    }
}