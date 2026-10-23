# Projeto 67 

Um programa de linha de comando em Java sobre o meme 67. Tem frases aleatórias, quiz, detector de 67 e um placar que sobe com seu nível de brainrot.

## Funcionalidades

- **Frase do 67:** sorteia uma frase aleatória sobre o meme.
- **Quiz do 67:** 5 perguntas de múltipla escolha, com comentário em cada uma.
- **Detector de 67:** você digita um número e o programa procura o 67 dentro dele.
- **Placar:** pontos por acertos e detecções, com níveis de Iniciante até Lenda do 67.

## Como executar

Requisito: Java 17 ou superior.

```bash
javac -d out src/*.java
java -cp out Main
```

## Estrutura

```
src/
├── Main.java     Menu principal e detector de 67
├── Frases.java   Gerador de frases aleatórias
├── Quiz.java     Perguntas e lógica do quiz
└── Placar.java   Pontuação e níveis
```

## Ideias para evoluir

- Salvar o placar em arquivo entre execuções.
- Adicionar mais perguntas e frases (sugestões da galera são bem-vindas).
- Criar um modo "67 contra o relógio".

Sobe e desce. 
