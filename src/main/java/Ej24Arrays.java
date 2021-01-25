
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laura
 */
public class Ej24Arrays {

    private ArrayList<Integer> lista1 = new ArrayList<>();
    private ArrayList<Integer> lista2 = new ArrayList<>();
    private Random aleatorio = new Random();

    public Ej24Arrays() {
        int aleatorio1 = aleatorio.nextInt(15 - 5 + 1) + 5;
        int aleatorio2 = aleatorio.nextInt(20 - 10 + 1) + 10;
        for (int i = 0; i < aleatorio1; i++) {
            this.lista1.add(aleatorio.nextInt(100 - 50 + 1) + 50);
        }
        for (int i = 0; i < aleatorio2; i++) {
            this.lista2.add(aleatorio.nextInt(100 - 50 + 1) + 50);
        }
    }

    public void imprimirListas() {
        System.out.println("-------- Lista 1 -------");
        this.lista1.forEach(item->System.out.print(" " + item));
        System.out.println("");
        System.out.println("-------- Lista 2 --------");
        this.lista2.forEach(item->System.out.print(" " + item));
        System.out.println("");
    }

    //Método que se encarga de crear una lista con los 
    //elementos de lista1 que NO están en lista2
    public ArrayList<Integer> crearLista3() {
        ArrayList<Integer> lista3 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (!buscarElemento(lista1.get(i), lista2)) {
                lista3.add(lista1.get(i));
            }
        }
        return lista3;
    }

    private boolean buscarElemento(Integer i, ArrayList<Integer> lista) {
        int contador = 0;
        do {
            if (i.equals(lista.get(contador))) {
                return true;
            }
            contador++;
        } while (contador > lista.size());

        return false;

    }

    //Imprimimos lista (Sirve tanto para imprimir lista3 como lista4
    public static void imprimirLista(ArrayList<Integer> lista) {
        lista.forEach(item->System.out.print(" " + item));
        System.out.println("");
    }

    //Método para crear una lista con los elementos pares de 
    //lista1 y los elementos impares de lista2
    public ArrayList<Integer> crearLista4() {
        ArrayList<Integer> lista4 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i) % 2 == 0) {
                lista4.add(lista1.get(i));
            }
        }
        for (int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i) % 2 != 0) {
                lista4.add(lista2.get(i));
            }
        }
        return lista4;
    }

}
