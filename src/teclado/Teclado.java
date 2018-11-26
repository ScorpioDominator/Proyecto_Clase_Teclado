package teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

	public enum Comparacion {
		MAYOR_O_IGUAL, MENOR_O_IGUAL, MAYOR, MENOR
	}

	public enum Rango {
		AMBOS_INCLUIDOS, AMBOS_EXCLUIDOS, MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO, MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO
	}

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
					System.out.println(LecturaChar(charKey, mensajeC));
					break;

				case 2:
					System.out.println(LecturaString(stringKey, mensajeS));
					break;

				case 3:
					System.out.println(LecturaBoolean(Elección, Opción1, Opción2));
					break;

				case 4:
					System.out.println(LecturaBoolean(pregunta));
					break;

				case 5:

					do {

						System.out.print("Inserta el número de la opción que desees \n" + "1. byte \n" + "2. short \n"
								+ "3. int \n" + "4. long \n" + "5. float \n" + "6. double \n");

						numeroMenu2 = keyboard.nextInt();
						keyboard.nextLine();

						switch (numeroMenu2) {
						case 1:
							System.out.println(LecturaNumero(byte1, mensajeN));
							salir2 = true;
							break;
						case 2:
							System.out.println(LecturaNumero(short1, mensajeN));
							salir2 = true;
							break;
						case 3:
							System.out.println(LecturaNumero(int1, mensajeN));
							salir2 = true;
							break;
						case 4:
							System.out.println(LecturaNumero(long1, mensajeN));
							salir2 = true;
							break;
						case 5:
							System.out.println(LecturaNumero(float1, mensajeN));
							salir2 = true;
							break;
						case 6:
							System.out.println(LecturaNumero(double1, mensajeN));
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

									System.out.println(LecturaComparacion(byte1, byte2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaComparacion(byte1, byte2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaComparacion(byte1, byte2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaComparacion(byte1, byte2, numero4, mensajeN));
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

									System.out.println(LecturaComparacion(short1, short2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaComparacion(short1, short2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaComparacion(short1, short2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaComparacion(short1, short2, numero4, mensajeN));
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

									System.out.println(LecturaComparacion(int1, int2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaComparacion(int1, int2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaComparacion(int1, int2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaComparacion(int1, int2, numero4, mensajeN));
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

									System.out.println(LecturaComparacion(long1, long2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaComparacion(long1, long2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaComparacion(long1, long2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaComparacion(long1, long2, numero4, mensajeN));
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

									System.out.println(LecturaComparacion(float1, float2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaComparacion(float1, float2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaComparacion(float1, float2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaComparacion(float1, float2, numero4, mensajeN));
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

									System.out.println(LecturaComparacion(double1, double2, numero1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaComparacion(double1, double2, numero2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaComparacion(double1, double2, numero3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaComparacion(double1, double2, numero4, mensajeN));
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

									System.out.println(LecturaRango(byte2, byte3, byte1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaRango(byte2, byte3, byte1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaRango(byte2, byte3, byte1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaRango(byte2, byte3, byte1, tipo4, mensajeN));
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

									System.out.println(LecturaRango(short2, short3, short1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaRango(short2, short3, short1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaRango(short2, short3, short1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaRango(short2, short3, short1, tipo4, mensajeN));
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

									System.out.println(LecturaRango(int2, int3, int1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaRango(int2, int3, int1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaRango(int2, int3, int1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaRango(int2, int3, int1, tipo4, mensajeN));
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

									System.out.println(LecturaRango(long2, long3, long1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaRango(long2, long3, long1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaRango(long2, long3, long1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaRango(long2, long3, long1, tipo4, mensajeN));
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

									System.out.println(LecturaRango(float2, float3, float1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaRango(float2, float3, float1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaRango(float2, float3, float1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaRango(float2, float3, float1, tipo4, mensajeN));
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

									System.out.println(LecturaRango(double2, double3, double1, tipo1, mensajeN));
									salir3 = true;
									break;

								case 2:

									System.out.println(LecturaRango(double2, double3, double1, tipo2, mensajeN));
									salir3 = true;
									break;

								case 3:

									System.out.println(LecturaRango(double2, double3, double1, tipo3, mensajeN));
									salir3 = true;
									break;

								case 4:

									System.out.println(LecturaRango(double2, double3, double1, tipo4, mensajeN));
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

					KeyboardClose();
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

	public static void KeyboardClose() {

		//		1: Cerramos el teclado.

		keyboard.close();
		System.out.println("Teclado cerrado");
	}

	public static char LecturaChar(char charKey, String MensajeC) {
		boolean correcto = false;
		String cadena = " ";

		do {
			try {
				//				1: Le pedimos al usuario un carácter.

				System.out.println(MensajeC);
				cadena = keyboard.nextLine();

				//				2: Comprobamos de que se trata de un solo carácter.

				if (cadena.length() > 1) {
					throw new ArithmeticException("Error en la introducción del carácter");
				}

				else {
					charKey = cadena.charAt(0);
					correcto = true;
				}
			}
			//			2.2: En caso de no serlo notificamos el error al usuario y le pedimos de nuevo el carácter hasta que lo introduzca correctamente.
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			//			2.1: En caso de ser correcto devolvemos el carácter. 

		} while (!correcto);

		return charKey;
	}

	public static String LecturaString(String stringKey, String mensajeS) {

		boolean correcto = false;

		do {
			try {
				//			1: Le pedimos al usuario una cadena y la devolvemos.
				System.out.println(mensajeS);
				stringKey = keyboard.nextLine();
				//		2: Comprobamos de que se ha introducido una cadena.
				if (stringKey.length() < 1) {
					throw new ArithmeticException("Error en la introducción de la cadena");
				} else {
					correcto = true;
				}
			}

			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				//			2.2: En caso de no serlo notificamos el error al usuario y le pedimos de nuevo la cadena hasta que lo introduzca correctamente.
			}
		}
		//		2.1: En caso de ser correcto devolvemos la cadena.
		while (!correcto);
		return stringKey;

	}

	public static boolean LecturaBoolean(String elección, String Opción1, String Opción2) {
		boolean resultado = false, correcto = false;
		int number = 0;

		do {
			try {
				//	1: Le mandamos al usuario un mensaje y le damos dos mensajes como opciones de respuesta.

				System.out.println(elección);
				System.out.println(Opción1);
				System.out.println(Opción2);
				number = keyboard.nextInt();
				keyboard.nextLine();

				//	2: En caso de que responda correctamente (1, 2) que nos devuelva la respuesta, (1:true, 2:false).

				if (number == 1) {
					resultado = true;
					correcto = true;
				} else if (number == 2) {
					resultado = false;
					correcto = true;

					//	3: En caso de que no sea correcto, notificamos el error y le volvemos a pedir el dato al usuario hasta que lo introduzca correctamente.

				} else {
					throw new ArithmeticException("Error en la introducción del número");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del número");
				keyboard.nextLine();
			}

		} while (number != 1 && number != 2 && correcto == false);

		return resultado;
	}

	public static boolean LecturaBoolean(String pregunta) {
		boolean resultado = false;
		String caracter = " ";

		do {
			try {
				//				1: Le preguntamos al usuario.

				System.out.println(pregunta);
				caracter = keyboard.nextLine();
				//				2: Controlamos que el usuario nos mete el dato correcto.
				//				3: Si es correcto, que nos devuelva el valor (S/s: true, N/n: false).
				if (caracter.equals("S") || caracter.equals("s")) {
					resultado = true;
				} else if (caracter.equals("N") || caracter.equals("n")) {
					resultado = false;
				} else {
					//					4: Si es incorrecto, mandamos un mensaje de error y le volvemos a pedir el dato hasta que lo introduzca correctamente.
					throw new ArithmeticException("Error en la introducción del carácter");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		} while (!caracter.equals("s") && !caracter.equals("S") && !caracter.equals("N") && !caracter.equals("n"));

		return resultado;
	}
	//Este tipo de planteamiento es válido para cualquier tipo de introducción numérica:
	//	1: Le pedimos al usuario un número
	//	2: Nos aseguramos que el número sea un número y sea válido.
	//	3: En caso de que sea correcto, devolvemos el número. 
	//	4: Si no es correcto mandamos un mensaje de error y le volvemos a mandar el mensaje hasta que introduzca el número correcto.

	public static byte LecturaNumero(byte number, String mensajeN) {
		boolean correcto = false;

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextByte();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		return number;
	}

	public static short LecturaNumero(short number, String mensajeN) {

		boolean correcto = false;

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextShort();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		return number;
	}

	public static int LecturaNumero(int number, String mensajeN) {

		boolean correcto = false;

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextInt();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		return number;
	}

	public static double LecturaNumero(double number, String mensajeN) {

		boolean correcto = false;

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextDouble();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		return number;
	}

	public static long LecturaNumero(long number, String mensajeN) {

		boolean correcto = false;

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextLong();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		return number;
	}

	public static float LecturaNumero(float number, String mensajeN) {

		boolean correcto = false;

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextFloat();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		return number;
	}

	//Este tipo de planteamiento es válido para cualquier tipo de lectura comparativa:
	//	1: Le pedimos al usuario un número
	//	2: Nos aseguramos que el número sea un número y sea válido.
	//	3: En caso de que sea correcto devolvemos el número.
	//	4: En caso de ser incorrecto, mandamos un mensaje de error y le volvemos a pedir el numero hasta que introduzca el número correcto.
	//	5: Comprobamos que el número cumpla las condiciones de comparación que han sido especificadas. 
	//	6: En caso de ser correctas devolvemos el valor.
	//	7: En caso de no ser incorrectas, mandamos un error y le volvemos a pedir el número hasta que lo introduzca correctamente.

	public static byte LecturaComparacion(byte number1, byte number2, Comparacion numero, String mensajeN) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 < number2) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 > number2) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MAYOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 < number2 + 1) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 > number2 - 1) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		return number1;
	}

	public static short LecturaComparacion(short number1, short number2, Comparacion numero, String mensajeN) {
		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 < number2) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 > number2) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MAYOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 < number2 + 1) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number1 > number2 - 1) {
						throw new ArithmeticException("Error en la introducción del número");
					}

					else {
						correcto = true;
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		return number1;
	}

	public static int LecturaComparacion(int number1, int number2, Comparacion numero, String mensajeN) {
		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 <= number1) {
						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 >= number1) {
						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MAYOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 < number1) {

						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 > number1) {

						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		return number1;

	}

	public static double LecturaComparacion(double number1, double number2, Comparacion numero, String mensajeN) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 <= number1) {
						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 >= number1) {
						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MAYOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 < number1) {

						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 > number1) {

						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		return number1;
	}

	public static long LecturaComparacion(long number1, long number2, Comparacion numero, String mensajeN) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 <= number1) {
						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 >= number1) {
						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MAYOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 < number1) {

						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 > number1) {

						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		return number1;
	}

	public static float LecturaComparacion(float number1, float number2, Comparacion numero, String mensajeN) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 <= number1) {
						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor o igual a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 >= number1) {
						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MAYOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 < number1) {

						correcto = true;

					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		if (numero == Comparacion.MENOR) {

			do {
				try {
					System.out.println("Tienes que introducir un número menor a: " + number2);
					number1 = LecturaNumero(number1, mensajeN);

					if (number2 > number1) {

						correcto = true;
					}

					else {

						throw new ArithmeticException("Error en la introducción del número");
					}

				}

				catch (ArithmeticException e) {
					System.out.println(e.getMessage());

				}

			} while (!correcto);

		}

		return number1;
	}

	//	Este tipo de planteamiento es válido para cualquier tipo de lectrura de rango:
	//	1: Le pedimos al usuario un número
	//	2: Nos aseguramos que el número sea un número y sea válido.
	//	3: En caso de que sea correcto devolvemos el número.
	//	4: En caso de ser incorrecto, mandamos un mensaje de error y le volvemos a pedir el número hasta que introduzca el número correcto.
	//	5: Comprobamos que el número cumpla las condiciones del rango que han sido especificadas.
	//	6: En caso de ser correctas devolvemos el valor.
	//	7: En caso de no correctas, mandamos un error y le volvemos a pedir el número hasta que lo introduzca correctamente.

	public static byte LecturaRango(byte menor, byte mayor, byte number, Rango tipo, String mensajeN) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);
			} else if (tipo == Rango.AMBOS_EXCLUIDOS) {

				do {
					try {
						System.out.printf("Escribe un número entre %d y %d sin incluirlos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el menor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el mayor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			}

		}
		return number;
	}

	public static short LecturaRango(short menor, short mayor, short number, Rango tipo, String mensajeN) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);
			} else if (tipo == Rango.AMBOS_EXCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d sin incluirlos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el menor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el mayor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			}

		}
		return number;
	}

	public static int LecturaRango(int menor, int mayor, int number, Rango tipo, String mensajeN) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);
			} else if (tipo == Rango.AMBOS_EXCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d sin incluirlos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el menor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el mayor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			}
		}
		return number;

	}

	public static double LecturaRango(double menor, double mayor, double number, Rango tipo, String mensajeN) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);
			} else if (tipo == Rango.AMBOS_EXCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f sin incluirlos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f excluyendo el menor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f excluyendo el mayor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			}

		}
		return number;

	}

	public static long LecturaRango(long menor, long mayor, long number, Rango tipo, String mensajeN) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);
			} else if (tipo == Rango.AMBOS_EXCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d sin incluirlos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el menor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d excluyendo el mayor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			}

		}
		return number;

	}

	public static float LecturaRango(float menor, float mayor, float number, Rango tipo, String mensajeN) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);
			} else if (tipo == Rango.AMBOS_EXCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f sin incluirlos %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f excluyendo el menor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number > menor && number <= mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			} else if (tipo == Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO) {
				do {
					try {
						System.out.printf("Escribe un número entre %f y %f excluyendo el mayor %n", menor, mayor);
						number = LecturaNumero(number, mensajeN);

						if (number >= menor && number < mayor) {
							correcto = true;
						}

						else {
							throw new ArithmeticException("Error en la introducción del número");
						}
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());

					}
				} while (!correcto);

			}

		}
		return number;

	}

}
