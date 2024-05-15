import java.util.ArrayList;

public class Aviao {
    String classe;
    int horarioDoVoo;
    int duracaoDoVoo;
    ArrayList<Viajante> passageiros;

    public void refeicaoNoVoo() {
        if (horarioDoVoo >= 4 && horarioDoVoo <= 10) {
            System.out.println("O Cafe da manha sera servido");
        } else if (horarioDoVoo >= 10 && horarioDoVoo <= 16) {
            System.out.println("O almoço sera servido");
        } else {
            System.out.println("Sera servido um lanche");
        }
    }

    public void imprimirDetalhesdaViagem() {
        System.out.println(String.format("Você viajara de classe %s.", classe));
        System.out.println(String.format("O voo saira as: %s horas.", horarioDoVoo));
        System.out.println(String.format("O voo tera %s horas.", duracaoDoVoo));

        for (Viajante viajante : passageiros) {
            System.out.println(String.format("O nome do passageiro é %s.", viajante.nome));
            System.out.println(String.format("Ele(a) tem %s anos", viajante.idade));
            System.out.println(String.format("Primeira viagem? %s", viajante.primeiraViagem));
        }
    }

}
