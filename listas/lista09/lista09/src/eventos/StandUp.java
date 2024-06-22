package eventos;

public final class StandUp extends Evento {
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("O StandUp %s vai ser no %s e no dia %s. \n", getNome(), getLocal(), getData());
    }

    public void exibirInformacoes(String comediante) {
        System.out.println("O comediante eh: " + comediante);
    }

    @Override
    public void comecarEvento() {
        System.out.println("O show de piadas vai comecar!");
    }

    public void comecarEvento(String piada) {
        System.out.println("Como deixar alguem curioso?");
    }

    public String getComediante() {
        return comediante;
    }

    public void setComediante(String comediante) {
        this.comediante = comediante;
    }

}
