package Escola;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(String nomeUsuario, String emailUsuario, String disciplina) {
        super(nomeUsuario,emailUsuario);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo() {
        System.out.println(String.format(
                """
                        O nome do usuario eh: %s
                        O email do usuario eh: %s
                        O departamento do professor eh: %s

                        """,

                super.getNomeUsuario(),
                super.getEmailUsuario(),
                this.disciplina));

    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina) {
        if (exibirNome ) {
            System.out.println(String.format("O Nome do usuario eh: %s", super.getNomeUsuario())); 
           
        }
        if (exibirEmail) {
            System.out.println(String.format("O email informado eh: %s", super.getEmailUsuario())); 
          
        }
        if (exibirDisciplina) {
            System.out.println(String.format("A disciplina eh: %s\n", getDisciplina())); 
            
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
