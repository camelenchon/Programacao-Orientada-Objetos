import Escola.Aluno;
import Escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Mariazinha123","maria@email.com","12345");
        aluno.exibirInfo();
        aluno.exibirInfo(true,true,true);

        Professor professor = new Professor("JoaoDaSilva", "joaodasilva@email.com","Filosofia");
        professor.exibirInfo();
        professor.exibirInfo(true,false,true);

        
    }
}
