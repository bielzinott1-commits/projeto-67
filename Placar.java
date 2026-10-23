public class Placar {

    private static final int PONTOS_POR_ACERTO = 10;

    private int pontos;
    private int acertos;
    private int respostas;

    public void somarPontos(int quantidade) {
        pontos += quantidade;
    }

    public void registrarResposta(boolean acertou) {
        respostas++;
        if (acertou) {
            acertos++;
            pontos += PONTOS_POR_ACERTO;
        }
    }

    public void mostrar() {
        System.out.println("\n📊 SEU PLACAR DO 67");
        System.out.println("Pontos: " + pontos);
        System.out.println("Respostas no quiz: " + respostas + " (acertos: " + acertos + ")");
        System.out.println("Nível: " + nivel());
    }

    private String nivel() {
        if (pontos >= 100) return "Lenda do 67 🐐";
        if (pontos >= 50) return "Mestre do 67 😎";
        if (pontos >= 20) return "Aprendiz do 67 🤓";
        return "Iniciante (o 67 ainda não está no seu sangue) 🥚";
    }
}
