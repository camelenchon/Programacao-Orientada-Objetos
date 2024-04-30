import java.util.Scanner;

public class Exercicio1 {
    private static int NUMERO_PERGUNTAS = 3;
    private static String[] RESPOSTAS = new String[NUMERO_PERGUNTAS];
    private static String[] GABARITO = new String[NUMERO_PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        fazerPrimeiraPergunta(nomeParticipante);
        fazerSegundaPergunta(nomeParticipante);
        fazerTerceiraPergunta(nomeParticipante);
        apresentarResultado(nomeParticipante);
        agradecerParticipante(nomeParticipante);

    }

    public static String receberNomeParticipante() {
        System.out.println(
                """
                        Você conhece os ingredientes dos doces mais famosos?
                        Digite seu nome para começar:
                        """);
        return formatarNome(SCAN.nextLine());

    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "NPC";
        }

        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetradoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetradoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;

    }

    public static void comecarQuiz(String nomeParticipante) {
        System.out.println(String.format(
                """
                        Vamos comecar %s!!!
                        Mas antes, preciso explicar uma coisa
                        Se a letra da alternativa enviada for diferente das disponiveis, tambem será considerado errado.

                        Aperte ENTER para começar.
                        """,
                nomeParticipante

        ));

        SCAN.nextLine();
    }

    public static void fazerPrimeiraPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """

                                1 - Qual dos ingredientes abaixo é principal para fazer brigadeiro?
                                A - Leite Condensado
                                B - Leite
                                C - Açucar


                            """);
            resposta = SCAN.nextLine();
        } while (!ehUmaRespostaValida(resposta));

        GABARITO[0] = "A";
        RESPOSTAS[0] = resposta;

    }

    public static void fazerSegundaPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """

                                2 - Qual o jeito mais facil de fazer Doce de Leite?
                                A - Misturando leite condensado incansavelmente na panela
                                B - Na panela de pressão
                                C - No microondas


                            """);
            resposta = SCAN.nextLine();
        } while (!ehUmaRespostaValida(resposta));

        GABARITO[1] = "B";
        RESPOSTAS[1] = resposta;

    }

    public static void fazerTerceiraPergunta(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """

                                3 - Qual desses itens não vai no pudim?
                                A - Leite Condensado
                                B - Ovo
                                C - Maizena


                            """);
            resposta = SCAN.nextLine();
        } while (!ehUmaRespostaValida(resposta));

        GABARITO[2] = "C";
        RESPOSTAS[2] = resposta;

    }

    public static boolean ehUmaRespostaValida(String resposta) {
        if (resposta.isBlank()) {
            System.out.println(
                    """
                            Sua resposta não pode ser vazia.
                            Vamos enviar a pergunta novamente.

                             """);
            return false;
        }
        return true;

    }

    public static void apresentarResultado(String nomeParticipante) {
        System.out.println(String.format(
                """
                        %s, Vamos ver se você entende de doces mesmo.
                        Veja quais perguntas você acertou:
                        """,
                nomeParticipante));

        for (int i = 0; i < NUMERO_PERGUNTAS; i++) {
            System.out.println(String.format(
                    "%s - %s",
                    (i + 1),
                    RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "Acertou" : "Errou"

            ));

        }
    }

    public static String agradecerParticipante(String nomeParticipante) {
        System.out.println(
                """
                        Obrigado por participar!
                        Até o próximo!
                        """);
        return SCAN.nextLine();

    }
}
