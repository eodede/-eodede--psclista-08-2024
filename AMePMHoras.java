import java.util.Scanner;

public class AMePMHoras {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    char continuar;
        
    do {
    System.out.print("Digite a hora (0-23): ");
    int hora = scanner.nextInt();
    System.out.print("Digite os minutos (0-59): ");
    int minutos = scanner.nextInt();
            
    converterPara12Horas(hora, minutos);
            
    System.out.print("Deseja continuar? (S/N): ");
    continuar = scanner.next().charAt(0);
    } while (continuar == 'S' || continuar == 's');
        
    System.out.println("Programa encerrado.");

    scanner.close();
    }

    public static void converterPara12Horas(int hora, int minutos) {
    String periodo;
        
    if (hora >= 0 && hora < 12) {
    periodo = "A.M.";
    } else {
    periodo = "P.M.";
    if (hora > 12) {
    hora -= 12;
    }
    }
        
    System.out.println("Hora em formato de 12 horas: " + hora + ":" + minutos + " " + periodo);
    }
}
