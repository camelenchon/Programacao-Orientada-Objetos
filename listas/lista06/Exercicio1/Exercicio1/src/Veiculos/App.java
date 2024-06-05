package Veiculos;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Branco", "Abc1234");
        carro1.acelerar();
        carro1.frear();

        Carro carro2 = new Carro("Vermelho", "EFG9876");
        carro2.acelerar();
        carro2.frear();

        Trem trem1 = new Trem(20, 12);
        trem1.acelerar();
        trem1.frear();

        Trem trem2 = new Trem(10, 10);
        trem2.acelerar();
        trem2.frear();

    }
}
