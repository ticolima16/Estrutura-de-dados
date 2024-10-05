package Lista_ligada;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.getTamanho());
        lista.adicionar("AC");
        lista.adicionar("SP");
        lista.adicionar("CE");
        System.out.println("Tamanho: "+lista.getTamanho());
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());
        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        //remover estado CE
        lista.remover("CE");
        System.out.println("Removeu o estado CE");
        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
