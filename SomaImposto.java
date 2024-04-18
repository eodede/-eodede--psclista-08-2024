import java.util.Scanner;

public class SomaImposto {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: R$");
        double custo = scanner.nextDouble();
        
        System.out.print("Digite a taxa (em porcentagem): ");
        double taxa = scanner.nextDouble();

        double custoComImposto = somaImposto(taxa, custo);
        System.out.println("O custo do item com imposto é: " + custoComImposto);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        return custo + imposto;
    }
}