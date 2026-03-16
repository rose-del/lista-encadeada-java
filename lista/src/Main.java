public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.addElemento(18);
        lista.addElemento(45);

        lista.add(0, 10);
        lista.add(1, 20);
        lista.add(2, 50);
        lista.add(3, 100);
        lista.add(4, 35);
        lista.add(5, 80);

        System.out.println("Tamanho da lista: " + lista.size());

        Nodo nodo = lista.get(1);

        if (nodo != null) {
            System.out.println("Elemento na posição 1: " + nodo.valor);
        }

        lista.remove(1);

        System.out.println("Tamanho após remover: " + lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posição " + i + ": " + lista.get(i).valor);
        }
    }
}