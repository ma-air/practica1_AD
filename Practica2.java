package clase_file;

import java.io.File;
import java.io.IOException;

public class Practica2 {
	public void crearArchivos(String ruta, String nombre) {
		File f = new File(ruta , nombre);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void metodo2() {

		String ruta = "src/"; // cadena para la ruta
		String nombre = "DAM2"; // creamos una cadena para el nombre del fichero
		File DAM2 = new File(ruta + nombre); // creamos el fichero o directorio
		if (DAM2.exists()) {
			System.out.println("Ya existia este direcotorio");
			
		} else {
			String misNotas = "misNotas.txt";
			String p1 = "p1.txt";
			String ud1 = "ud1.txt";
			String ud2 = "ud2.txt";
			
			DAM2.mkdir();
			ruta = DAM2.getAbsolutePath();
			crearArchivos(ruta, misNotas);
			System.out.println("El directorio se ha creado con exito");
		
			File AD = new File(ruta, "AD");
			File PSP = new File(ruta, "PSP");
			
			AD.mkdir();
			ruta = AD.getAbsolutePath();
			crearArchivos(ruta, p1);
			crearArchivos(ruta, ud1);
			crearArchivos(ruta, ud2);
			
			PSP.mkdir();
			ruta = PSP.getAbsolutePath();
			crearArchivos(ruta, ud1);
			crearArchivos(ruta, ud2);
		}

	}
}
