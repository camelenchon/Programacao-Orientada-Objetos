package Carta;

public class CartaExplosao extends Carta{
    public CartaExplosao(){
        super("Explosao");
    }

    
@Override
public void exibirInformacoes(){
    System.out.println(String.format(
        """
    Nome: %s,


    Ação: Explode o jogador!
    """,
    super.nome

    ));
}

public void exibirInformacoes(boolean chamarMae){
    if(chamarMae){
        super.exibirInformacoes();
        return;
    }
    this.exibirInformacoes();
}

@Override
public void realizarAcao(){
    System.out.println("O jogador explodiu");
}
}