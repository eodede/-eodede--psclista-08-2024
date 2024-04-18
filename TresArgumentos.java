public class TresArgumentos {
    public static void main(String[] args) throws Exception {
    System.out.println("Nome, idade e altura:");
    caracteristicas("André", 17 , 1.75);
    }

    public static void caracteristicas(String nome, int idade, Double altura){
    System.out.println(nome + " " + idade + " " + altura);
    }
}
