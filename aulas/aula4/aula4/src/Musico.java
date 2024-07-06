public class Musico {
    String nome;
    int idade;
    String instrumento;
    boolean ehCantor;
    boolean ehInstrumentista;



    
    public void cantar(){
        if(ehCantor){

            System.out.println("Lalalaialaala lalalala");
        }else{
            System.out.println("Tellmi uai ");
        }
    }

    public void tocar(){
        if(ehInstrumentista){

            System.out.println("Som maneiro");
        }else{
            System.out.println(" tec tec tec");
        }
    }


}
