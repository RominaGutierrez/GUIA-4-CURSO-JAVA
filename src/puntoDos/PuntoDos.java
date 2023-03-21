package puntoDos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Haga un main donde por par�metro env�e la ruta de un archivo.Ese archivo debe contener n�meros.El 
 * programa debe escribir por consola la suma de esos n�meros
 * a- Al programa anterior agreguele un par�metro para que la operaci�n pueda ser suma o multiplicaci�n.
 */
public class PuntoDos {

	public static void main(String[] args) throws IOException  {
		
		// Declarar la variable de suma e inicializarla en cero
		int suma = 0;

		// Obtener el nombre del archivo del argumento de l�nea de comandos
		String archivo = "C:\\Users\\Pc\\Desktop\\CursoJava -LUN-MIER-10\\GuiaDeEjercicio4\\numeros\\numeros.txt";

		// Leer todas las l�neas del archivo e imprimirlas por pantalla
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea + " ");
		}

		// Convertir cada l�nea a un n�mero entero y sumarlo a la variable de suma
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			suma += Integer.parseInt(linea);
		}

		// Imprimir la suma de los n�meros
		System.out.println("La suma de los n�meros en el archivo es: " + suma);
	}

}
