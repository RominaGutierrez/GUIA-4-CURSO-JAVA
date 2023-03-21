package puntoUno;

import java.util.Scanner;

/*a- Haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente o 
 * descendente y los muestre ordenado por tal criterio
 * B- haga, lo mismo pero solicitando los parámetros de a uno por consola
 * C- lo mismo, pero usando los parámetros si hay alguno(como en a) y haciendo (b) si no detecta ninguno.
 * Vea si con una función puede evitar repetir código
 */
public class PuntoUnoABC {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		char letra = ' ';
		int [] numerosOrdenados = new int[3];
		System.out.print("Ingrese el primer número: ");
		num1 = ingreso.nextInt();
		System.out.print("Ingrese el segundo número: ");
		num2 = ingreso.nextInt();
		System.out.print("Ingrese el tercer número: ");
		num3 = ingreso.nextInt();
		System.out.println("Elija una de las siguientes opciones(a/d): ");
		System.out.println("a. Ordenar los números en forma ascendente");
		System.out.println("b. Ordenar los números en forma descendente");
		letra = ingreso.next().charAt(0);
		ingreso.close();
		switch(letra) {
		case 'a','A':
			numerosOrdenados = ordenarAscendente(num1,num2,num3);
			System.out.print("Números ordenados en forma ascendente: ");
			for(int i=0; i<numerosOrdenados.length; i++) {
				System.out.print(numerosOrdenados[i]+" ");
			}
			break;
		case 'd','D':
			numerosOrdenados = ordenarDescendente(num1,num2,num3);
			System.out.print("Números ordenados en forma descendente: ");
			for(int i=0; i<numerosOrdenados.length; i++) {
				System.out.print(numerosOrdenados[i]+" ");
			}
			break;
		default:
			System.out.println("Opción ingresada incorrecta");	
		}
			
	}			
	
	private static int[] ordenarDescendente(int num1, int num2, int num3) {
		int[] numerosOrdenados = {num1,num2,num3};
		int auxiliar=0;
		for (int i = 0; i < numerosOrdenados.length - 1; i++) {
			for (int j = i + 1; j < numerosOrdenados.length; j++) {
				if (numerosOrdenados[j] > numerosOrdenados[i]) {
					auxiliar = numerosOrdenados[i];
					numerosOrdenados[i] = numerosOrdenados[j];
					numerosOrdenados[j] = auxiliar;
				}
			}
		}	
		return numerosOrdenados;		
	}

	private static int[] ordenarAscendente(int num1, int num2, int num3) {
		int auxiliar = 0;
		int[] numerosOrdenados = {num1,num2,num3};
		
		for (int i = 0; i < numerosOrdenados.length - 1; i++) {
			for (int j = i + 1; j < numerosOrdenados.length; j++) {
				if (numerosOrdenados[j] < numerosOrdenados[i]) {
					auxiliar = numerosOrdenados[i];
					numerosOrdenados[i] = numerosOrdenados[j];
					numerosOrdenados[j] = auxiliar;
				}
			}
		}
		return numerosOrdenados;
	}


	
}

