import java.util.Scanner;

public class CaracterPN {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        char resultado = numero(n);
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }

    public static char numero(int num) {
    if (num < 0){
    return 'N';
    } else
    return 'P';
    }
}
