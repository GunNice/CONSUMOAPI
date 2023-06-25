import java.util.Scanner;


public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID do Jogador:");
        System.out.println("ex: 564, 654, 800, 1000, 5000:");
        String idJogador = sc.nextLine();
        Fifa api = new Fifa();
        String json = api.buscaJogador(idJogador);
        System.out.println(" Dados do Jogador:");
        System.out.println(json);
        sc.close();


    }
}
