import java.util.Scanner;

public class ExercícioSwitch3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Em que período você estuda?");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.print("Digite a opção: ");

        
        char periodo = scanner.next().toUpperCase().charAt(0);

        
        switch (periodo) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Digitação Inválida!");
                break;
        }

        scanner.close();
    }
}