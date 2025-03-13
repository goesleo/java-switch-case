import java.util.Scanner;

class exercicio_tres_diferente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12 correspondente ao mês: ");
        int mes = sc.nextInt();

        int dias =0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
                default:
                    System.out.println("mês invalido");
        }
    System.out.println("O mês " + mes + " tem " + dias + " dias.");
    }
}
