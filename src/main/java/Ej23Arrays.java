
import java.util.ArrayList;
import java.util.Random;

public class Ej23Arrays {

    //Mejor inicializar en el constructor
    private ArrayList<Integer> lista;
    Random aleatorio = new Random();

    public Ej23Arrays(int elementos) {
        this.lista = new ArrayList<>();
        for (int i = 0; i < elementos; i++) {
            lista.add(aleatorio.nextInt(99) + 10);
        }
    }

    public void imprimirLista(ArrayList<Integer> lista) {
        lista.forEach(System.out::println);
        /*
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
         */
    }

    public void imprimirSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (Integer elemento : lista) {
            if (elemento % 2 == 0) {
                suma += elemento;
            }
        }
        System.out.println("La suma de los elementos pares es" + suma);
    }

    public void imprimirCantidadImpares(ArrayList<Integer> lista) {
        int contador = 0;
        for (Integer elemento : lista) {
            if (elemento % 2 != 0) {
                contador += 1;
            }
        }
        System.out.println("La suma de los elementos pares es" + contador);
    }

    public Integer elementoMayor(ArrayList<Integer> lista) {
        Integer max = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (i == 0) {
                max = lista.get(i);
            } else if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    public Integer elementoMenor(ArrayList<Integer> lista) {
        Integer min = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (i == 0) {
                min = lista.get(i);
            } else if (lista.get(i) < min) {
                min = lista.get(i);
            }
        }
        return min;
    }

    public int tamanioLista(ArrayList<Integer> lista) {
        return lista.size();
    }

    public void borrarElemPos(ArrayList<Integer> lista, int posicion) {
        if ((posicion <= 0) && (posicion < lista.size())) {
            lista.remove(posicion);
        }
    }

    public void borrarElemValor(ArrayList<Integer> lista, int valor) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == valor) {
                lista.remove(i);
                //Habría que actualizar el valor de la i
                //para la misma posición con el nuevo valor
                i--;
            }
        }
    }

    public void modificarElem(ArrayList<Integer> lista, int posicion, int valor) {
        if ((posicion <= 0) && (posicion < lista.size())) {
            lista.set(posicion, valor);
        }
    }

}
