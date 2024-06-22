package eventos;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public void exibirInformacoes() {
        System.out.printf("O %s vai ser no lugarl: %s, no dia %s.$", getNome(), getLocal(), getData());
    }

    public abstract void comecarEvento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}