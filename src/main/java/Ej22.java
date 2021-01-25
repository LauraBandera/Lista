import java.util.ArrayList;
import java.util.Scanner;

public class Ej22 {
	
	/* Realiza un programa que lea por teclado una frase. El programa debe trocear la frase separando 
	 * las distintas palabras (usa el método split de los String) y guardar cada palabra como un String 
	 * independiente dentro de un array de String. Imprime el contenido del string obtenido. Busca alguna 
	 * ocurrencia de alguna palabra en el String, ignorando mayúsculas y minúsculas.
	 */

	private Scanner s = new Scanner(System.in);
	
	public void lecturaTeclado() {
		System.out.println("Introduzca una frase, para terminar presione enter");
		String frase = s.nextLine();
	}
	
	public ArrayList separacion(String aSeparar) {
		ArrayList<String> palabras = new ArrayList<>();
		String[] parts = aSeparar.split(" ");
		
		for(String palabra : parts) {
			palabras.add(palabra);
		}
		
		return palabras;
	}
	
	public void imprimir(ArrayList palabras) {
		palabras.forEach(item -> System.out.print(" " + item));
	}
	
	public int buscarOcurrencia(ArrayList palabras, String ocurrencia) {
		return palabras.indexOf(ocurrencia);
	}
	
}
