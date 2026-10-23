import java.util.List;
import java.util.Random;

public class Frases {

    private static final List<String> FRASES = List.of(
            "67 é o novo 'ok'.",
            "Ninguém sabe exatamente o que é 67, mas todo mundo sabe fazer o gesto.",
            "Você tentou falar 67 e saiu 'seis-sete'. Normal, a gente treina.",
            "Seu professor de matemática está chorando agora. 6 e 7 não são 67.",
            "Sexta-feira? Não, hoje é 67-feira.",
            "A IA aprendeu o 67 antes da sua prova de amanhã. Pensa nisso.",
            "67 não é número, é um estado de espírito.",
            "Ele entrou na sala, olhou para ninguém e soltou um 67. Respeito.",
            "Você tem 67 minutos de tela hoje. Só 67? Está indo bem.",
            "Mãe, eu quero 67 no almoço. Não, não é comida. Ou é?",
            "Quando a conta do mês chega e você só consegue pensar em 67.",
            "Sessenta e sete é o número oficial. O resto é brainrot com carinho."
    );

    private final Random random = new Random();

    public String sortear() {
        return FRASES.get(random.nextInt(FRASES.size()));
    }
}
