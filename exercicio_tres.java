import java.util.Scanner;
public class exercicio_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 12 equivalente a um mês do ano: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("O mês de janeiro tem 31 dias");
                break;
            case 2:
                System.out.println("O mês de fevereiro tem 28 dias");
                break;
            case 3:
                System.out.println("o mês de marco tem 31 dias");
                break;
            case 4:
                System.out.println("O mês de abril tem 30 dias");
                break;
            case 5:
                System.out.println("O mês de maio tem 31 dias");
                break;
            case 6:
                System.out.println("O mês de junho tem 30 dias");
                break;
            case 7:
                System.out.println("O mês de julho tem 31 dias");
                break;
            case 8:
                System.out.println("O mês de agosto tem 31 dias");
                break;
            case 9:
                System.out.println("O mês de setembro tem 30 dias");
                break;
            case 10:
                System.out.println("O mês de outubro tem 31 dias");
                break;
            case 11:
                System.out.println("O mês de novembro tem 30 dias");
                break;
            case 12:
                System.out.println("O mês de dezembro tem 31 dias");
                break;
                default:
                    System.out.println("numero invalido");










        }

    }
}
