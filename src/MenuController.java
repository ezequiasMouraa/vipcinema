import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {

    private static final Scanner scanner = new Scanner(System.in);

    public void run() {

        // Lista de filmes disponíveis
        Filme[] filmes = new Filme[5];

        // Adicionar filmes
        filmes[0] = new Filme("Doutor Estranho no Multiverso da Loucura", "Sam Raimi", "Stephen Strange atravessa o multiverso para encontrar uma nova ameaça", "Fantasia", 126, true);
        filmes[1] = new Filme("Top Gun: Maverick", "Joseph Kosinski", "Pete 'Maverick' Mitchell retorna ao treinamento de pilotos de caças da Marinha", "Ação", 137, false);
        filmes[2] = new Filme("O Homem-Aranha: Sem Volta Para Casa", "Jon Watts", "Peter Parker tenta recuperar sua vida após ter sua identidade revelada", "Ação", 148, false);
        filmes[3] = new Filme("Thor: Amor e Trovão", "Taika Waititi", "Thor em busca de paz interior", "Ação", 125, false);
        filmes[4] = new Filme("Minions 2: A Origem de Gru", "Kyle Balda, Brad Ableson e Jonathan del Val", "A origem do vilão Gru", "Animação", 88, false);

        // Selecionar filme
        System.out.println("Selecione um filme:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i+1) + " - " + filmes[i].getNome());
        }
        int opcaoFilme = scanner.nextInt();
        Filme filme = filmes[opcaoFilme - 1];

        // Selecionar sessão
        System.out.println("Selecione uma sessão:");
        System.out.println("1 - 14h");
        System.out.println("2 - 19h");
        int opcaoSessao = scanner.nextInt();
        String horarioSessao = opcaoSessao == 1 ? "14h" : "19h";

        // Selecionar tipo de ingresso
        System.out.println("Selecione o tipo de ingresso:");
        System.out.println("1 - Inteira Comum");
        System.out.println("2 - Meia Comum");
        System.out.println("3 - Inteira VIP");
        System.out.println("4 - Meia VIP");
        int opcaoIngresso = scanner.nextInt();
        int valorIngresso;
        Ingresso ingresso;
        valorIngresso = switch (opcaoIngresso) {
            case 1 -> {
                ingresso = new IngressoComum(filme, "Inteira Comum", horarioSessao);
                yield (int) ingresso.getValorInteira();
            }
            case 2 -> {
                ingresso = new IngressoComum(filme, "Meia Comum", horarioSessao);
                yield (int) ingresso.getValorMeia();
            }
            case 3 -> {
                ingresso = new IngressoVIP(filme, "Inteira VIP", horarioSessao);
                yield (int) ingresso.getValorInteira();
            }
            case 4 -> {
                ingresso = new IngressoVIP(filme, "Meia VIP", horarioSessao);
                yield (int) ingresso.getValorMeia();
            }
            default -> throw new IllegalArgumentException("Tipo de ingresso inválido");
        };

        // Verificação de 3D
        boolean exibe3D;
        if ((ingresso.getTipoIngresso().equals("Meia VIP") || ingresso.getTipoIngresso().equals("Inteira VIP")) && filme.isFilme3D()) {
            System.out.println("Esse filme possui a opção 3D, deseja assistir?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int opcaoFormato = scanner.nextInt();
            exibe3D = opcaoFormato == 1;
        } else {
            exibe3D = false;
        }

        // Comprar ingressos
        System.out.println("Quantos ingressos deseja?");
        int quantidadeIngressos = scanner.nextInt();

        // Exibir valor total
        System.out.println("Ingresso selecionado:");
        System.out.println("Filme: " + ingresso.getFilme().getNome());
        System.out.println("Sessão: " + ingresso.getHorarioSessao());
        System.out.println("Tipo de ingresso: " + ingresso.getTipoIngresso());
        System.out.println("Filme 3D: " + exibe3D);
        System.out.println("Quantidade de ingressos: " + quantidadeIngressos);
        System.out.println("Valor total: R$" + (valorIngresso * quantidadeIngressos));

        // Acesso à lanchonete
        if (ingresso.getTipoIngresso().equals("Meia VIP") || ingresso.getTipoIngresso().equals("Inteira VIP")) {
            System.out.println("Lanchonete do cinema liberada");
        } else {
            System.out.println("Compre um ingresso VIP");
        }
    }
}
