package Escola;

public abstract class Usuario {
    private String nomeUsuario;
    private String emailUsuario;

    public Usuario(String nomeUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void exibirInfo() {
        System.out.println(String.format(
                """
                        O nome de usuario eh: %s,

                        O emailUsuario do usuario eh: %s""",
                nomeUsuario,
                emailUsuario));
    }

}
