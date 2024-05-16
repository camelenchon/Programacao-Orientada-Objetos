import java.util.ArrayList;

public class Aviao {
    String classe;
    int horarioDoVoo;
    int duracaoDoVoo;
    ArrayList<Viajante> passageiros;

    public void comerNoVoo() {
        if (horarioDoVoo >= 4 && horarioDoVoo <= 10) {
            System.out.println("O cafe da manha sera servido a bordo");
        } else if (horarioDoVoo >= 10 && horarioDoVoo <= 16) {
            System.out.println("O almoco sera servido a bordo");
        } else {
            System.out.println("Sera servido um lanche a bordo");
        }
    }

    public void dormirNoVoo() {
        if (duracaoDoVoo > 6) {
            System.out.println("Voce vai conseguir dormir no voo");
        } else {
            System.out.println("Vai ficar dificil, mas pode tentar dormir");
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
