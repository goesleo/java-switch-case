import java.util.Scanner;
public class exercicio_dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um operador (+, -, *, /): ");
        String operador = sc.nextLine();
        System.out.println("Digite um numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite outro numero: ");
        double numero2 = sc.nextDouble();

        switch (operador) {
            case "+":
                System.out.printf("%.2f\n",numero1 + numero2);
                break;
            case "-":
                System.out.printf("%.2f\n",numero1 - numero2);
                break;
            case "*":
                System.out.printf("%.2f\n",numero1 * numero2);
                break;
            case "/":
                System.out.printf("%.2f\n",numero1 / numero2);
                break;
            default:
                System.out.println("utilize um operador valido!");



        }
    }
}
