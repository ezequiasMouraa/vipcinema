import java.util.Scanner;

public class MenuController {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Lista de filmes disponíveis
        String[] filmes = {"Doutor Estranho no Multiverso da Loucura", "Top Gun: Maverick", "O Homem-Aranha: Sem Volta Para Casa"};

        // Selecionar filme
        System.out.println("Selecione um filme:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + " - " + filmes[i]);
        }
        int opcaoFilme = scanner.nextInt();

        // Selecionar sessão
        System.out.println("Selecione uma sessão:");
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + " - 14h");
            System.out.println((i + 2) + " - 19h");
        }
        int opcaoSessao = scanner.nextInt();

        // Comprar ingressos
        System.out.println("Quantidade de ingressos inteiros:");
        int quantidadeInteiros = scanner.nextInt();
        System.out.println("Quantidade de ingressos meia-entrada:");
        int quantidadeMeias = scanner.nextInt();

        // Criar ingressos
        Ingresso[] ingressos = new Ingresso[quantidadeInteiros + quantidadeMeias];
        for (int i = 0; i < ingressos.length; i++) {
            String tipoIngresso = i < quantidadeInteiros ? "inteiro" : "meia-entrada";
            if (i < quantidadeInteiros / 2) {
                ingressos[i] = new IngressoVIP(filmes[opcaoFilme - 1], tipoIngresso, opcaoSessao);
            } else {
                ingressos[i] = new IngressoComum(filmes[opcaoFilme - 1], tipoIngresso, opcaoSessao);
            }
        }

        // Calcular valor total
        float valorTotal = 0;
        for (Ingresso ingresso : ingressos) {
            valorTotal += ingresso.getValor();
        }

        // Exibir resultado
        System.out.println("O total a pagar é de R$" + valorTotal);
    }
}
