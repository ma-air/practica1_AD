package clase_file;

import java.io.File;

public class Practica1 {

	public void metodo1(){
		String ruta = "src/"; // cadena para la ruta
		String nombre = "file0001.txt"; // creamos una cadena para el nombre del fichero
		File f = new File(ruta + nombre); // creamos el fichero
		System.out.println("Nombre: " + f.getName()); // mostramos cosas
		System.out.println("Ruta: " + f.getAbsolutePath());
		System.out.println("Directorio padre: " + f.getParent());
		if (f.exists()) {
			System.out.println("¡El fichero existe!");
			System.out.println("Permisos(rwx)=>" + f.canRead() + f.canWrite() + f.canExecute());
			System.out.println("Longitud del fichero: " + f.length() + " bytes");
		} else {
			System.out.println("El fichero no existe");
		}

	}

}
