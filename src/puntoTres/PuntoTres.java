package puntoTres;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PuntoTres {

	public static void main(String[] args) throws IOException {
		
		String cadena = "Romina,Fabián,Federico,Alejandro,Elias,Mateo,Noah,Zoe,Natalia,Matilde";
		
		//'cadena' se escribirá en el archivo ubicado en la ruta. 
		Files.writeString(Paths.get("C:\\Users\\Pc\\Desktop\\CursoJava -LUN-MIER-10\\GuiaDeEjercicio4\\Nueva carpeta\\archivo.txt"), cadena);
		
				

	}

}
