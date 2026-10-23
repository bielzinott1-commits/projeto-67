import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Placar placar = new Placar();
        Frases frases = new Frases();
        Quiz quiz = new Quiz();

        System.out.println("🎉 Bem-vindo ao PROJETO 67! 🎉");
        System.out.println("Aviso: nenhuma pergunta aqui tem resposta lógica. Relaxa.");

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n=== MENU DO 67 ===");
            System.out.println("1 - Frase do 67");
            System.out.println("2 - Quiz do 67");
            System.out.println("3 - Detector de 67");
            System.out.println("4 - Meu placar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            String opcao = sc.nextLine().trim();
            switch (opcao) {
                case "1" -> System.out.println("💬 " + frases.sortear());
                case "2" -> quiz.jogar(sc, placar);
                case "3" -> detectar(sc, placar);
                case "4" -> placar.mostrar();
                case "0" -> rodando = false;
                default -> System.out.println("Opção inválida. Nem o 67 entenderia isso.");
            }
        }

        System.out.println("Até mais! Sobe e desce, e vai com Deus. 🙌");
        sc.close();
    }

    private static void detectar(Scanner sc, Placar placar) {
        System.out.print("Digite um número (ou qualquer coisa, eu não julgo): ");
        String entrada = sc.nextLine().trim();

        if (!entrada.matches("\\d+")) {
            System.out.println("Isso não parece número, mas respeito sua criatividade. 0 pontos.");
            return;
        }

        if (entrada.contains("67")) {
            System.out.println("🚨 67 DETECTADO! 🚨");
            System.out.println("Você acabou de ganhar +5 pontos e um diploma imaginário.");
            placar.somarPontos(5);
        } else {
            System.out.println("Nada de 67 aqui. Tenta de novo, com fé.");
        }
    }
}
