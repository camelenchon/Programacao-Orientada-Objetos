import java.util.ArrayList;

public class Musica {
    String melodia;
    String cifra;
    boolean temLetra;
    String letra;
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void tocarMusica(){
        for (int i=0; i< musicos.size(); i++){
            musicos.get(i).tocar();

            if(musicos.get(i).ehCantor){
                musicos.get(i).cantar();
            }

        }
       }
    public void imprimirDetalhes(){
        System.out.println(melodia);
        System.out.println(cifra);
        System.out.println(temLetra);
        System.out.println(letra);

        for (Musico musico : musicos) {
            musico.imprimirDetalhes();
            
        }

    }
}
