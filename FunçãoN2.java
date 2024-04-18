import java.util.Scanner;

public class FunçãoN2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        
        numero(n);
        scanner.close();
    }

public static void numero(int num) {

    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
}