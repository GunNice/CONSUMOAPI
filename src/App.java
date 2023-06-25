import java.util.Scanner;


public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("===== API de consulta dos jogadores do Campeonato brasileiro Série A ====");
        System.out.println("========= Digite o ID do Jogador ex: 564, 654, 800, 1000, 5000: =========");
        System.out.println("=========================================================================\n\n");
        System.out.println("-------------------------  INFORME A ID DESEJADA -----------------------:\n");
        String idJogador = sc.nextLine();
        Fifa api = new Fifa();
        String json = api.buscaJogador(idJogador);
        System.out.println(" Dados do Jogador:\n");
        System.out.println(json + "\n");
        sc.close();


    }
}
