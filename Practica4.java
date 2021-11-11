package clase_file;

import java.io.File;

public class Practica4 {
	public void metodo4(File f) {
		File[] lista = f.listFiles();
		System.out.println("\n****ARCHIVOS DE LA CARPETA " + f.getName() + "****");
		for (File s : lista) {
			if (s.isFile())
				System.out.println(" * " + s.getName());
		}
	}
}
