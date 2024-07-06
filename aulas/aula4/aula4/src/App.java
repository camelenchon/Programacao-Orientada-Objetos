public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica();
        musica.melodia ="lalalala lelele";
        musica.cifra = "G d en c";
        musica.temLetra = true;
        musica.letra = "joao roubou pao na casa do joao";

        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.idade = 13;
        guitarrista.ehInstrumentista = true;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Pedro";


        Musico cantor = new Musico();
        cantor.ehCantor = true;
        cantor.idade = 27;
        cantor.instrumento = "Voz";
        cantor.nome = "davi"; 

        musica.musicos.add(guitarrista);
        
        musica.tocarMusica();

        musica.imprimirDetalhes();

       
    }
}