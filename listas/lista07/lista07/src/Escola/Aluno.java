package Escola;

public class Aluno extends Usuario {
    private String matricula;

    public Aluno(String nomeUsuario, String emailUsuario, String matricula) {
        super(nomeUsuario,emailUsuario);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println(String.format(
                """
                        O Nome do usuario eh: %s
                        O email do usuario eh: %s
                        O numero de matricula eh: %s
                        
                        """,

                super.getNomeUsuario(),
                super.getEmailUsuario(),
                this.matricula));

    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {
        if (exibirNome) {
            System.out.println(String.format("O nome do usuario eh: %s", super.getNomeUsuario())); 
        }
        
        if (exibirEmail) {
            System.out.println(String.format("O email informado eh: %s", super.getEmailUsuario()));   
        }
        if (exibirMatricula) {
            System.out.println(String.format("A matricula eh %s \n", getMatricula()));        
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
