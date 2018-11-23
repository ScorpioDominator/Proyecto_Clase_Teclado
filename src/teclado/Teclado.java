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

		Rango tipo1 = Rango.AMBOS_INCLUIDOS, tipo2 = Rango.AMBOS_EXCLUIDOS, tipo3=Rango.MÍNIMO_EXCLUIDO_MÁXIMO_INCLUIDO,
				tipo4=Rango.MÁXIMO_EXCLUIDO_MÍNIMO_INCLUIDO;
		Comparacion numero1 = Comparacion.MAYOR_O_IGUAL, numero2=Comparacion.MENOR_O_IGUAL, numero3=Comparacion.MAYOR, 
				numero4=Comparacion.MENOR;
		byte byte1 = 0, byte2 = 20, byte3 = 30;
		short short1 = 0, short2 = 20, short3 = 30;
		int numeroMenu, int1 = 0, int2 = 20, int3 = 30;
		double double1 = 0, double2 = 20, double3 = 30;
		long long1 = 0, long2 = 20, long3 = 30;
		float float1 = 0, float2 = 20, float3 = 30;
		char charKey = ' ';
		String stringKey = " ", Elección = "Elige color", Opción1 = "1.1 Rojo", Opción2 = "1.2 Verde",
				pregunta = "¿Estas casado?";

		System.out.print("Introduce \"1\" para cerrar el teclado \n" 
				+ "Introduce \"2\" para introducir un carácter \n"
				+ "Introduce \"3\" para introducir una cadena \n" 
				+ "Introduce \"4\" para leer un boolean \n"
				+ "Introduce \"5\" para leer un boolean \n" 
				+ "Introduce \"6\" para leer un byte \n"
				+ "Introduce \"7\" para leer un short \n" 
				+ "Introduce \"8\" para leer un int \n"
				+ "Introduce \"9\" para leer un double \n" 
				+ "Introduce \"10\" para leer un long \n"
				+ "Introduce \"11\" para leer un float \n" 
				+ "Introduce \"12\" para leer y comparar byte mayor o igual \n"
				+ "Introduce \"13\" para leer y comparar byte menor o igual \n"
				+ "Introduce \"14\" para leer y comparar byte mayor \n"
				+ "Introduce \"15\" para leer y comparar byte menor \n"
				+ "Introduce \"16\" para leer y comparar short mayor o igual \n" 
				+ "Introduce \"17\" para leer y comparar short menor o igual \n"
				+ "Introduce \"18\" para leer y comparar short mayor \n" 
				+ "Introduce \"19\" para leer y comparar short menor o igual \n"
				+ "Introduce \"20\" para leer y comparar int mayor o igual \n"
				+ "Introduce \"21\" para leer y comparar int menor o igual \n"
				+ "Introduce \"22\" para leer y comparar int mayor \n"
				+ "Introduce \"23\" para leer y comparar int menor \n"
				+ "Introduce \"24\" para leer y comparar double mayor o igual \n" 
				+ "Introduce \"25\" para leer y comparar double menor o igual \n"
				+ "Introduce \"26\" para leer y comparar double mayor \n"
				+ "Introduce \"25\" para leer y comparar double menor \n"
				+ "Introduce \"28\" para leer y comparar long mayor o igual \n"
				+ "Introduce \"29\" para leer y comparar long menor o igual \n"
				+ "Introduce \"30\" para leer y comparar long mayor \n"
				+ "Introduce \"31\" para leer y comparar long menor \n"
				+ "Introduce \"32\" para leer y comparar float mayor o igual \n"
				+ "Introduce \"33\" para leer y comparar float menor o igual \n"
				+ "Introduce \"34\" para leer y comparar float mayor \n"
				+ "Introduce \"35\" para leer y comparar float menor \n"
				+ "Introduce \"36\" para escribir dentro de un rango ambos incluidos byte \n"
				+ "Introduce \"37\" para escribir dentro de un rango ambos excluidos byte \n"
				+ "Introduce \"38\" para escribir dentro de un rango mínimo excluido máximo incluido byte \n"
				+ "Introduce \"39\" para escribir dentro de un rango mínimo incluido máximo excluido byte \n"
				+ "Introduce \"40\" para escribir dentro de un rango ambos incluidos short \n"
				+ "Introduce \"41\" para escribir dentro de un rango ambos excluidos short \n"
				+ "Introduce \"42\" para escribir dentro de un rango mínimo excluido máximo incluido short \n"
				+ "Introduce \"43\" para escribir dentro de un rango mínimo incluido máximo excluido short \n"
				+ "Introduce \"44\" para escribir dentro de un rango ambos incluidos int \n"
				+ "Introduce \"45\" para escribir dentro de un rango ambos excluidos int \n"
				+ "Introduce \"46\" para escribir dentro de un rango mínimo excluido máximo incluido int \n"
				+ "Introduce \"47\" para escribir dentro de un rango mínimo incluido máximo excluido int \n"
				+ "Introduce \"48\" para escribir dentro de un rango ambos incluidos long \n"
				+ "Introduce \"49\" para escribir dentro de un rango ambos excluidos long \n"
				+ "Introduce \"50\" para escribir dentro de un rango mínimo excluido máximo incluido long \n"
				+ "Introduce \"51\" para escribir dentro de un rango mínimo incluido máximo excluido long \n"
				+ "Introduce \"52\" para escribir dentro de un rango ambos incluidos double \n"
				+ "Introduce \"53\" para escribir dentro de un rango ambos excluidos double \n"
				+ "Introduce \"54\" para escribir dentro de un rango mínimo excluido máximo incluido double \n"
				+ "Introduce \"55\" para escribir dentro de un rango mínimo incluido máximo excluido double \n"
				+ "Introduce \"56\" para escribir dentro de un rango ambos incluidos float \n"
				+ "Introduce \"57\" para escribir dentro de un rango ambos excluidos float \n"
				+ "Introduce \"58\" para escribir dentro de un rango mínimo excluido máximo incluido float \n"
				+ "Introduce \"59\" para escribir dentro de un rango mínimo incluido máximo excluido float \n"


);

		numeroMenu = keyboard.nextInt();
		keyboard.nextLine();

		switch (numeroMenu) {

		case 1:
			KeyboardClose(keyboard);
			break;
		case 2:
			System.out.println(LecturaChar(charKey, keyboard));
			break;
		case 3:
			System.out.println(LecturaString(stringKey, keyboard));
			break;
		case 4:
			System.out.println(LecturaBoolean(Elección, Opción1, Opción2, keyboard));
			;
			break;
		case 5:
			System.out.println(LecturaBoolean(pregunta, keyboard));
			break;
		case 6:
			System.out.println(LecturaNumero(byte1, keyboard));
			break;
		case 7:
			System.out.println(LecturaNumero(short1, keyboard));
			break;
		case 8:
			System.out.println(LecturaNumero(int1, keyboard));
			break;
		case 9:
			System.out.println(LecturaNumero(double1, keyboard));
			break;
		case 10:
			System.out.println(LecturaNumero(long1, keyboard));
			break;
		case 11:
			System.out.println(LecturaNumero(float1, keyboard));
			break;
		case 12:
			System.out.println(LecturaComparacion(byte1, byte2, numero1));
			break;
		case 13:
			System.out.println(LecturaComparacion(byte1, byte2, numero2));
			break;
		case 14:
			System.out.println(LecturaComparacion(byte1, byte2, numero3));
			break;
		case 15:
			System.out.println(LecturaComparacion(byte1, byte2, numero4));
			break;
		case 16:
			System.out.println(LecturaComparacion(short1, short2, numero1));
			break;
		case 17:
			System.out.println(LecturaComparacion(short1, short2, numero2));
			break;
		case 18:
			System.out.println(LecturaComparacion(short1, short2, numero3));
			break;
		case 19:
			System.out.println(LecturaComparacion(short1, short2, numero4));
			break;
		case 20:
			System.out.println(LecturaComparacion(int1, int2, numero1));
			break;
		case 21:
			System.out.println(LecturaComparacion(int1, int2, numero2));
			break;
		case 22:
			System.out.println(LecturaComparacion(int1, int2, numero3));
			break;
		case 23:
			System.out.println(LecturaComparacion(int1, int2, numero4));
			break;
		case 24:
			System.out.println(LecturaComparacion(double1, double2, numero1));
			break;
		case 25:
			System.out.println(LecturaComparacion(double1, double2, numero2));
			break;
		case 26:
			System.out.println(LecturaComparacion(double1, double2, numero3));
			break;
		case 27:
			System.out.println(LecturaComparacion(double1, double2, numero4));
			break;
		case 28:
			System.out.println(LecturaComparacion(long1, long2, numero1));
			break;
		case 29:
			System.out.println(LecturaComparacion(long1, long2, numero2));
			break;
		case 30:
			System.out.println(LecturaComparacion(long1, long2, numero3));
			break;
		case 31:
			System.out.println(LecturaComparacion(long1, long2, numero4));
			break;
		case 32:
			System.out.println(LecturaComparacion(float1, float2, numero1));
			break;
		case 33:
			System.out.println(LecturaComparacion(float1, float2, numero2));
			break;
		case 34:
			System.out.println(LecturaComparacion(float1, float2, numero3));
			break;
		case 35:
			System.out.println(LecturaComparacion(float1, float2, numero4));
			break;
		case 36:
			System.out.print(LecturaRango(byte2, byte3, byte1, tipo1));
			break;
		case 37:
			System.out.print(LecturaRango(byte2, byte3, byte1, tipo2));
			break;
		case 38:
			System.out.print(LecturaRango(byte2, byte3, byte1, tipo3));
			break;
		case 39:
			System.out.print(LecturaRango(byte2, byte3, byte1, tipo4));
			break;
		case 40:
			System.out.print(LecturaRango(short2, short3, short1, tipo1));
			break;
		case 41:
			System.out.print(LecturaRango(short2, short3, short1, tipo2));
			break;
		case 42:
			System.out.print(LecturaRango(short2, short3, short1, tipo3));
			break;
		case 43:
			System.out.print(LecturaRango(short2, short3, short1, tipo4));
			break;
		case 44:
			System.out.print(LecturaRango(int2, int3, int1, tipo1));
			break;
		case 45:
			System.out.print(LecturaRango(int2, int3, int1, tipo2));
			break;
		case 46:
			System.out.print(LecturaRango(int2, int3, int1, tipo3));
			break;
		case 47:
			System.out.print(LecturaRango(int2, int3, int1, tipo4));
			break;
		case 48:
			System.out.print(LecturaRango(long2, long3, long1, tipo1));
			break;
		case 49:
			System.out.print(LecturaRango(long2, long3, long1, tipo2));
			break;
		case 50:
			System.out.print(LecturaRango(long2, long3, long1, tipo3));
			break;
		case 51:
			System.out.print(LecturaRango(long2, long3, long1, tipo3));
			break;
		case 52:
			System.out.print(LecturaRango(double2, double3, double1, tipo1));
			break;
		case 53:
			System.out.print(LecturaRango(double2, double3, double1, tipo2));
			break;
		case 54:
			System.out.print(LecturaRango(double2, double3, double1, tipo3));
			break;
		case 55:
			System.out.print(LecturaRango(double2, double3, double1, tipo1));
			break;
		case 56:
			System.out.print(LecturaRango(float2, float3, float1, tipo1));
			break;
		case 57:
			System.out.print(LecturaRango(float2, float3, float1, tipo2));
			break;
		case 58:
			System.out.print(LecturaRango(float2, float3, float1, tipo3));
			break;
		case 59:
			System.out.print(LecturaRango(float2, float3, float1, tipo1));
			break;
		}

	}

	public static void KeyboardClose(Scanner keyboard) {

		keyboard.close();
		System.out.println("Teclado cerrado");
	}

	public static char LecturaChar(char charKey, Scanner keyboard) {
		boolean correcto = false;
		String cadena = " ";

		do {
			try {
				System.out.println("Introduce un carácter");
				cadena = keyboard.nextLine();

				if (cadena.length() > 1) {
					throw new ArithmeticException("Error en la introducción del número");
				}

				else {
					charKey = cadena.charAt(0);
					correcto = true;
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while (!correcto);

		return charKey;
	}

	public static String LecturaString(String stringKey, Scanner keyboard) {
		System.out.println("Introduce una cadena");
		stringKey = keyboard.nextLine();
		return stringKey;
	}

	public static boolean LecturaBoolean(String elección, String Opción1, String Opción2, Scanner keyboard) {
		boolean resultado = false;
		int number = 0;

		do {
			try {
				System.out.println(elección);
				System.out.println(Opción1);
				System.out.println(Opción2);
				number = keyboard.nextInt();
				keyboard.nextLine();

				if (number == 1) {
					resultado = true;
				} else if (number == 2) {
					resultado = false;
				} else {
					throw new ArithmeticException("Error en la introducción del número");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while (number != 1 && number != 2);

		return resultado;
	}

	public static boolean LecturaBoolean(String pregunta, Scanner keyboard) {
		boolean resultado = false;
		String caracter = " ";

		do {
			try {
				System.out.println(pregunta);
				caracter = keyboard.nextLine();
				if (caracter.equals("S") || caracter.equals("s")) {
					resultado = true;
				} else if (caracter.equals("N") || caracter.equals("n")) {
					resultado = false;
				} else {
					throw new ArithmeticException("Error en la introducción del carácter");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while (!caracter.equals("s") && !caracter.equals("S") && !caracter.equals("N") && !caracter.equals("n"));

		return resultado;
	}

	public static byte LecturaNumero(byte number, Scanner keyboard) {
		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un número");
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

	public static short LecturaNumero(short number, Scanner keyboard) {

		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un número");
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

	public static int LecturaNumero(int number, Scanner keyboard) {

		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un número");
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

	public static double LecturaNumero(double number, Scanner keyboard) {

		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un número");
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

	public static long LecturaNumero(long number, Scanner keyboard) {

		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un número");
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

	public static float LecturaNumero(float number, Scanner keyboard) {

		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un número");
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

	public static byte LecturaComparacion(byte number1, byte number2, Comparacion numero) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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

	public static short LecturaComparacion(short number1, short number2, Comparacion numero) {
		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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

	public static int LecturaComparacion(int number1, int number2, Comparacion numero) {
		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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

	public static double LecturaComparacion(double number1, double number2, Comparacion numero) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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

	public static long LecturaComparacion(long number1, long number2, Comparacion numero) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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

	public static float LecturaComparacion(float number1, float number2, Comparacion numero) {

		Boolean correcto = false;

		if (numero == Comparacion.MAYOR_O_IGUAL) {

			do {
				try {
					System.out.println("Tienes que introducir un número mayor o igual a: " + number2);
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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
					number1 = LecturaNumero(number1, keyboard);

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

	public static byte LecturaRango(byte menor, byte mayor, byte number, Rango tipo) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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

	public static short LecturaRango(short menor, short mayor, short number, Rango tipo) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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

	public static int LecturaRango(int menor, int mayor, int number, Rango tipo) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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

	public static double LecturaRango(double menor, double mayor, double number, Rango tipo) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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

	public static long LecturaRango(long menor, long mayor, long number, Rango tipo) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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

	public static float LecturaRango(float menor, float mayor, float number, Rango tipo) {

		boolean correcto = false;

		if (menor >= mayor) {
			throw new IllegalArgumentException("Error en la introducción de las condiciones");
		} else {
			if (tipo == Rango.AMBOS_INCLUIDOS) {
				do {
					try {
						System.out.printf("Escribe un número entre %d y %d estos incluidos %n", menor, mayor);
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
						number = LecturaNumero(number, keyboard);

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
