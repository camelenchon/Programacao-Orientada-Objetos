package biblioteca;

public class Livro {
    private String nome;
    private int classificacaoIndicativa;
    private boolean estahEmprestado = false;

    public Livro(String nome, int classificacaoIndicativa) {
        this.nome = nome;
        this.classificacaoIndicativa = classificarLivro(classificacaoIndicativa);

    }

    private int classificarLivro(int classificacaoIndicativa){
        if (classificacaoIndicativa < 0){
            return 0;
        }

        if (classificacaoIndicativa >  18){
        return 18;
        }
        return classificacaoIndicativa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa){
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public int getClassificacaoIndicativa (){
        return this.classificacaoIndicativa;
    }
    public void setEstahEmprestado(boolean estahEmprestado){
        this.estahEmprestado = estahEmprestado;
    }
    public boolean getEstahEmprestado(){
        return this.estahEmprestado;
    }



}
