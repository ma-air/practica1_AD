package clase_file;

import java.io.File;

public class practica6 {
	public void metodo5(String ruta) {
		File f = new File(ruta);
		System.out.println(f.getPath());
		JList lista = new JLL();
		f.listFiles();

		// se recorre el directorio y se muestran los archivos existentes
		for (File s : lista) {
			if (s.isFile()) {
				System.out.println(" * " + s.getName());
				
		}
		// se recorre el directorio y se obtienen los subdirectorios
		for (File s : lista) {
			// Si es un directorio se vuelve a llamar al método (reflexiva) para
			// entrar y salir de las carpetas
			if (s.isDirectory()) {
				metodo5(s.getPath());
			}
		}
	}
}