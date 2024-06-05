package Animais;

public class App {

    public static void main(String[] args) throws Exception {
        Gato gato1 = new Gato("Branco", "pequeno");
        gato1.alimentar();
        gato1.emitirSom();

        Vaca vaca1 = new Vaca("Josefina", "grande");
        vaca1.alimentar();
        vaca1.emitirSom();
    }
}
