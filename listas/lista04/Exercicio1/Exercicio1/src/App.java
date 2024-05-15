import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Viagem viagem = new Viagem();
        viagem.destino = "Salvador";
        viagem.duracaoDeDias = 7;
        viagem.temBagagem = true;

        viagem.malas();

        Aviao aviao = new Aviao();
        aviao.classe = "economica";
        aviao.horarioDoVoo = 12;
        aviao.duracaoDoVoo = 2;
        aviao.passageiros = new ArrayList<Viajante>();

        aviao.refeicaoNoVoo();

        Viajante viajante1 = new Viajante();
        viajante1.nome = "Jose";
        viajante1.idade = 20;
        viajante1.primeiraViagem = true;
        aviao.passageiros.add(viajante1);

        Viajante viajante2 = new Viajante();
        viajante2.nome = "Maria";
        viajante2.idade = 30;
        viajante2.primeiraViagem = false;
        aviao.passageiros.add(viajante2);

        Viajante viajante3 = new Viajante();
        viajante3.nome = "Joao";
        viajante3.idade = 17;
        viajante3.primeiraViagem = true;
        aviao.passageiros.add(viajante3);

        Viajante viajante4 = new Viajante();
        viajante4.nome = "Carla";
        viajante4.idade = 50;
        viajante4.primeiraViagem = true;
        aviao.passageiros.add(viajante4);

        viajante1.medoAviao();
        viajante2.medoAviao();
        viajante3.medoAviao();
        viajante4.medoAviao();

        viajante1.maiorDeIdade();
        viajante2.maiorDeIdade();
        viajante3.maiorDeIdade();
        viajante4.maiorDeIdade();

        System.out.println();
        aviao.imprimirDetalhesdaViagem();

    }
}
