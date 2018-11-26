package teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

import teclado.Teclado.Comparacion;
import teclado.Teclado.Rango;

//Esta clase ha sido creada con la intención de probar que la clase teclado funciona siendo llamada desde otra clase.

public class Prueba {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		Rango tipo1 = Rango.AMBOS_INCLUIDOS, tipo2 = Rango.AMBOS_EXCLUIDOS,
				tipo3 = Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO, tipo4 = Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO;
		Comparacion numero1 = Comparacion.MAYOR_O_IGUAL, numero2 = Comparacion.MENOR_O_IGUAL,
				numero3 = Comparacion.MAYOR, numero4 = Comparacion.MENOR;
		boolean salir1 = false, salir2 = false, salir3 = false;
		byte byte1 = 0, byte2 = 20, byte3 = 30;
		short short1 = 0, short2 = 20, short3 = 30;
		int numeroMenu, numeroMenu2, numeroMenu3, int1 = 0, int2 = 20, int3 = 30;
		double double1 = 0, double2 = 20, double3 = 30;
		long long1 = 0, long2 = 20, long3 = 30;
		float float1 = 0, float2 = 20, float3 = 30;
		char charKey = ' ';
		String stringKey = " ", Elección = "Elige color", Opción1 = "1.1 Rojo", Opción2 = "1.2 Verde",
				pregunta = "¿Estas casado?", mensajeC = "Introduce un carácter", mensajeS = "Introduce una cadena",
				mensajeN = "Introduce un número";

		do {

			try {

				//	Hacemos un menú que explore cada una de las posibilidades disponibles, incluyendo los tipos numéricos
				//	las comparaciones y las lecturas de rangos.

				System.out.print("Pulsa uno de los siguientes números para elegir la opción que quieres: \n"
						+ "1. Para un carácter \n" + "2. Para una cadena \n" + "3. Para el primer boolean \n"
						+ "4. Para el segundo boolean \n" + "5. Para un número \n" + "6. Para una comparación \n"
						+ "7. Para un rango \n" + "8. Para cerrar teclado y salir \n");

				numeroMenu = keyboard.nextInt();
				keyboard.nextLine();

				switch (numeroMenu) {

				case 1:
					System.out.println(Teclado.LecturaChar(charKey, mensajeC));
					break;

				case 2:
					System.out.println(Teclado.LecturaString(stringKey, mensajeS));
					break;

				case 3:
					System.out.println(Teclado.LecturaBoolean(Elección, Opción1, Opción2));
					break;

				case 4:
					System.out.println(Teclado.LecturaBoolean(pregunta));
					break;

				case 5:

					do {

						System.out.print("Inserta el número de la opción que desees \n" + "1. byte \n" + "2. short \n"
								+ "3. int \n" + "4. long \n" + "5. float \n" + "6. double \n");

						numeroMenu2 = keyboard.nextInt();
						keyboard.nextLine();

						switch (numeroMenu2) {
						case 1:
							System.out.println(Teclado.LecturaNumero(byte1, mensajeN));
							salir2 = true;
							break;
						case 2:
							System.out.println(Teclado.LecturaNumero(short1, mensajeN));
							salir2 = true;
							break;
						case 3:
							System.out.println(Teclado.LecturaNumero(int1, mensajeN));
							salir2 = true;
							break;
						case 4:
							System.out.println(Teclado.LecturaNumero(long1, mensajeN));
							salir2 = true;
							break;
						case 5:
							System.out.println(Teclado.LecturaNumero(float1, mensajeN));
							salir2 = true;
							break;
						case 6:
							System.out.println(Teclado.LecturaNumero(double1, mensajeN));
							salir2 = true;
							break;
						}
					} while (!salir2);
					salir2 = false;
					break;

				case 6:

					do {

						System.out.print("Inserta el número de la opción que desees \n" + "1. byte \n" + "2. short \n"
								+ "3. int \n" + "4. long \n" + "5. float \n" + "6. double \n");

						numeroMenu2 = keyboard.nextInt();
						keyboard.nextLine();

						switch (numeroMenu2) {

						case 1:

							do {

								System.out.print("Inserta el número de la opción que desees \n" + "1. Mayor o igual \n"
										+ "2. Menor o igual \n" + "3. mayor \n" + "4. menor \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaComparacion(byte1, byte2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaComparacion(byte1, byte2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaComparacion(byte1, byte2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaComparacion(byte1, byte2, numero4, mensajeN));
									salir3 = true;
									break;
								}

							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 2:

							do {

								System.out.print("Inserta el número de la opción que desees \n" + "1. Mayor o igual \n"
										+ "2. Menor o igual \n" + "3. mayor \n" + "4. menor \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaComparacion(short1, short2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaComparacion(short1, short2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaComparacion(short1, short2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaComparacion(short1, short2, numero4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 3:

							do {

								System.out.print("Inserta el número de la opción que desees \n" + "1. Mayor o igual \n"
										+ "2. Menor o igual \n" + "3. mayor \n" + "4. menor \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaComparacion(int1, int2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaComparacion(int1, int2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaComparacion(int1, int2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaComparacion(int1, int2, numero4, mensajeN));
									salir3 = true;
									break;
								}
							}

							while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 4:

							do {

								System.out.print("Inserta el número de la opción que desees \n" + "1. Mayor o igual \n"
										+ "2. Menor o igual \n" + "3. mayor \n" + "4. menor \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaComparacion(long1, long2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaComparacion(long1, long2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaComparacion(long1, long2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaComparacion(long1, long2, numero4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 5:

							do {

								System.out.print("Inserta el número de la opción que desees \n" + "1. Mayor o igual \n"
										+ "2. Menor o igual \n" + "3. mayor \n" + "4. menor \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaComparacion(float1, float2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaComparacion(float1, float2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaComparacion(float1, float2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaComparacion(float1, float2, numero4, mensajeN));
									salir3 = true;
									break;
								}

							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 6:

							do {

								System.out.print("Inserta el número de la opción que desees \n" + "1. Mayor o igual \n"
										+ "2. Menor o igual \n" + "3. mayor \n" + "4. menor \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaComparacion(double1, double2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaComparacion(double1, double2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaComparacion(double1, double2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaComparacion(double1, double2, numero4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;
						}
					} while (!salir2);
					salir2 = false;
					break;

				case 7:

					do {

						System.out.print("Inserta el número de la opción que desees \n" + "1. byte \n" + "2. short \n"
								+ "3. int \n" + "4. long \n" + "5. float \n" + "6. double \n");

						numeroMenu2 = keyboard.nextInt();
						keyboard.nextLine();

						switch (numeroMenu2) {

						case 1:

							do {

								System.out
										.print("Inserta el número de la opción que desees \n" + "1. Ambos incluidos \n"
												+ "2. Ambos Excluidos \n" + "3. Mínimo incluido, máximo excluido \n"
												+ "4. Máximo incluido, mínimo excluido \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaRango(byte2, byte3, byte1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaRango(byte2, byte3, byte1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaRango(byte2, byte3, byte1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaRango(byte2, byte3, byte1, tipo4, mensajeN));
									salir3 = true;
									break;

								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 2:

							do {

								System.out
										.print("Inserta el número de la opción que desees \n" + "1. Ambos incluidos \n"
												+ "2. Ambos Excluidos \n" + "3. Mínimo incluido, máximo excluido \n"
												+ "4. Máximo incluido, mínimo excluido \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaRango(short2, short3, short1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaRango(short2, short3, short1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaRango(short2, short3, short1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaRango(short2, short3, short1, tipo4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;

						case 3:

							do {

								System.out
										.print("Inserta el número de la opción que desees \n" + "1. Ambos incluidos \n"
												+ "2. Ambos Excluidos \n" + "3. Mínimo incluido, máximo excluido \n"
												+ "4. Máximo incluido, mínimo excluido \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaRango(int2, int3, int1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaRango(int2, int3, int1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaRango(int2, int3, int1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaRango(int2, int3, int1, tipo4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;

							break;

						case 4:

							do {

								System.out
										.print("Inserta el número de la opción que desees \n" + "1. Ambos incluidos \n"
												+ "2. Ambos Excluidos \n" + "3. Mínimo incluido, máximo excluido \n"
												+ "4. Máximo incluido, mínimo excluido \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaRango(long2, long3, long1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaRango(long2, long3, long1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaRango(long2, long3, long1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaRango(long2, long3, long1, tipo4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;

							break;

						case 5:

							do {

								System.out
										.print("Inserta el número de la opción que desees \n" + "1. Ambos incluidos \n"
												+ "2. Ambos Excluidos \n" + "3. Mínimo incluido, máximo excluido \n"
												+ "4. Máximo incluido, mínimo excluido \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaRango(float2, float3, float1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaRango(float2, float3, float1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaRango(float2, float3, float1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaRango(float2, float3, float1, tipo4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;

							break;

						case 6:

							do {

								System.out
										.print("Inserta el número de la opción que desees \n" + "1. Ambos incluidos \n"
												+ "2. Ambos Excluidos \n" + "3. Mínimo incluido, máximo excluido \n"
												+ "4. Máximo incluido, mínimo excluido \n");

								numeroMenu3 = keyboard.nextInt();
								keyboard.nextLine();

								switch (numeroMenu3) {

								case 1:

									System.out.println(Teclado.LecturaRango(double2, double3, double1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(Teclado.LecturaRango(double2, double3, double1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(Teclado.LecturaRango(double2, double3, double1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(Teclado.LecturaRango(double2, double3, double1, tipo4, mensajeN));
									salir3 = true;
									break;
								}
							} while (!salir3);
							salir2 = true;
							salir3 = false;
							break;
						}
					} while (!salir2);
					salir2 = false;
					break;

				case 8:

					Teclado.KeyboardClose();
					salir1 = true;
					break;

				}
			} catch (InputMismatchException e) {
				System.out.println("Error a la hora de introducir el número");
			}
			keyboard.nextLine();

		} while (!salir1);
		salir1 = false;

	

	}

}
