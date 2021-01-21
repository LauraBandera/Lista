
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class PruebaEj24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ej24Arrays ej = new Ej24Arrays();
        
        ej.imprimirListas();
        
        ArrayList<Integer> lista3 = ej.crearLista3();
        ArrayList<Integer> lista4 = ej.crearLista4();
        
        System.out.println("------- Lista 3 -------");
        Ej24Arrays.imprimirLista(lista3);
        System.out.println("------- Lista 4 -------");
        Ej24Arrays.imprimirLista(lista4);
        
        
    }
    
}
