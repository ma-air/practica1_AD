package clase_file;

import java.io.File;

public class Practica3 {
	public void metodo3(String ruta, String nombre, String nuevoNombre) {
		File archivoExistente = new File(ruta + nombre);
		File archivoNuevo = new File(ruta + nuevoNombre);
		archivoExistente.renameTo(archivoNuevo);
	}
}
