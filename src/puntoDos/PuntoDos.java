package puntoDos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Haga un main donde por parámetro envíe la ruta de un archivo.Ese archivo debe contener números.El 
 * programa debe escribir por consola la suma de esos números
 * a- Al programa anterior agreguele un parámetro para que la operación pueda ser suma o multiplicación.
 */
public class PuntoDos {

	public static void main(String[] args) throws IOException  {
		
		// Declarar la variable de suma e inicializarla en cero
		int suma = 0;

		// Obtener el nombre del archivo del argumento de línea de comandos
		String archivo = "C:\\Users\\Pc\\Desktop\\CursoJava -LUN-MIER-10\\GuiaDeEjercicio4\\numeros\\numeros.txt";

		// Leer todas las líneas del archivo e imprimirlas por pantalla
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea + " ");
		}

		// Convertir cada línea a un número entero y sumarlo a la variable de suma
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			suma += Integer.parseInt(linea);
		}

		// Imprimir la suma de los números
		System.out.println("La suma de los números en el archivo es: " + suma);
	}

}
