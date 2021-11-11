package clase_file;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Practica1 ejer1 = new Practica1();
		Practica2 ejer2 = new Practica2();
		Practica3 ejer3 = new Practica3();
		Practica4 ejer4 = new Practica4();
		Practica5 ejer5 = new Practica5();
//		Practica6 ejer6 = new Practica6();
		boolean salir = false;
		while (!salir) {
			try {

				System.out.print("\n0. SALIR \n" + "1. Practica 1 \n" + "2. Practica 2 \n" + "3. Practica 3 \n"
						+ "4. Practica 4 \n" + "5. Practica 5 \n" + "6. Practica 6 \n" + "7. Practica 7 \n" + "******ELIGE EL NUMERO DE LA PRACTICA******: " );

				int opcion = entrada.nextInt();
				if (opcion == 0) {
					System.out.println("HEMOS SALIDO SATISFACTORIAMENTE");
					salir = true;
				} else if (opcion == 1) {
					ejer1.metodo1();
				} else if (opcion == 2) {
					ejer2.metodo2();
					
				} else if (opcion == 3) {
					Practica3 pc = new Practica3();
					String ruta = "src/DAM2/AD/";
					String nombreArchivo = "p1.txt";
					String nombreNuevo = "practica1.txt";
					ejer3.metodo3(ruta, nombreArchivo, nombreNuevo);
					
				} else if (opcion == 4) {
					String ruta = "src/DAM2";
					File f = new File(ruta);
					ejer4.metodo4(f);
				} else if (opcion == 5) {
					String ruta = "src/DAM2";
					File f = new File(ruta);
					System.out.println("\n****ARCHIVOS DE LA CARPETA Y SUBCARPETAS DE " + f.getName() + "****");
					ejer5.metodo5(ruta);
//				} else if (opcion == 6) {
//					ejer6.metodo6();
				} else {
					System.out.println("\nOpcion no contemplada en el menu. ");
				}
			} catch (InputMismatchException e) {
				System.err.println("\nDebes insertar un número\n");
				entrada.next();
			}

		}
		entrada.close();
	}

}
