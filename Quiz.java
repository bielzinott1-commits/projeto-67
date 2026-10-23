import java.util.List;
import java.util.Scanner;

public class Quiz {

    private record Pergunta(String enunciado, List<String> opcoes, char correta, String comentario) {}

    private final List<Pergunta> perguntas = List.of(
            new Pergunta(
                    "O que significa '67' no meme?",
                    List.of("Um código secreto", "Um gesto com as mãos", "Uma palavra sem significado oficial", "Todas as anteriores"),
                    'd',
                    "Ninguém sabe ao certo, e essa é a graça."),
            new Pergunta(
                    "Qual número vem depois do 66?",
                    List.of("65", "67", "68", "666"),
                    'b',
                    "Matemática avançada. Parabéns, você é um gênio."),
            new Pergunta(
                    "Qual gesto acompanha o 67?",
                    List.of("Joinha", "Mãos subindo e descendo", "Dab", "Cruzar os braços"),
                    'b',
                    "Sobe e desce, igual o seu humor de segunda-feira."),
            new Pergunta(
                    "Como se escreve 67 por extenso?",
                    List.of("Seis sete", "Sessenta e sete", "Sexta-feira", "Seis-setenta"),
                    'b',
                    "Sessenta e sete. O português também cansou de tentar entender."),
            new Pergunta(
                    "Qual a melhor hora para falar 67?",
                    List.of("Na prova", "Na reunião de família", "No meio de uma conversa séria", "Agora"),
                    'd',
                    "Agora. Sempre agora.")
    );

    public void jogar(Scanner sc, Placar placar) {
        System.out.println("\n🧠 QUIZ DO 67 — 5 perguntas, zero pressão.");
        int acertos = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta p = perguntas.get(i);
            System.out.println("\nPergunta " + (i + 1) + ": " + p.enunciado());
            char letra = 'a';
            for (String opcao : p.opcoes()) {
                System.out.println("  " + letra + ") " + opcao);
                letra++;
            }

            System.out.print("Sua resposta: ");
            String resposta = sc.nextLine().trim().toLowerCase();
            boolean acertou = resposta.length() == 1 && resposta.charAt(0) == p.correta();

            if (acertou) {
                System.out.println("✅ Acertou! " + p.comentario());
                acertos++;
            } else {
                System.out.println("❌ Errou. A resposta era '" + p.correta() + "'. " + p.comentario());
            }
            placar.registrarResposta(acertou);
        }

        System.out.println("\nFim do quiz! Você acertou " + acertos + " de " + perguntas.size() + ".");
    }
}
