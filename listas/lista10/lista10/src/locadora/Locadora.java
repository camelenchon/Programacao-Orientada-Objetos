package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends Audiovisual> {
    public List<T> acervo = new ArrayList<>();

    public void adicionarItem(T item) {
        acervo.add(item);
    }

    public void listarItens() {
        for (T item : acervo) {
            item.exibirInfo();

        }
    }

    public T buscarItem(String titulo) {
        for (T item : acervo) {
            if (titulo.equalsIgnoreCase(item.getTitulo())) {
                return item;
            }
        }
        return null;
    }
}
