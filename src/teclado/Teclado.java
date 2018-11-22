package teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

	public enum Comparacion {
		MayorOIgual, MenorOIgual, Mayor, Menor
	}

	public enum Rango {
		Ambos_Incluidos, Ambos_Excluidos, Mínimo_Excluido_Máximo_Inluido, Máximo_Excluido_Mínimo_Incluido
	}

	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		Rango tipo = Rango.Mínimo_Excluido_Máximo_Inluido;
		Comparacion numero = Comparacion.Mayor;
		byte byte1 = 0, byte2 = 3, byte3 = 90;
		short short1 = 0, short2 = 7, short3 = 10;
		int numeroMenu, int1 = 0, int2 = 50, int3 = 700;
		double double1 = 0, double2 = 50, double3 = 70.5;
		long long1 = 0, long2 = 3000, long3 = 70000;
		float float1 = 0, float2 = 60, float3 = 79;
		char charKey = ' ';
		String stringKey = " ", Elección = "Elige color", Opción1 = "1.1 Rojo", Opción2 = "1.2 Verde",
				pregunta = "¿Estas casado?";

		System.out.print("Introduce \"1\" para cerrar el teclado \n" + "Introduce \"2\" para introducir un carácter \n"
				+ "Introduce \"3\" para introducir una cadena \n" + "Introduce \"4\" para leer un boolean \n"
				+ "Introduce \"5\" para leer un boolean \n" + "Introduce \"6\" para leer un byte \n"
				+ "Introduce \"7\" para leer un short \n" + "Introduce \"8\" para leer un int \n"
				+ "Introduce \"9\" para leer un double \n" + "Introduce \"10\" para leer un long \n"
				+ "Introduce \"11\" para leer un float \n" + "Introduce \"12\" para leer y comparar byte \n"
				+ "Introduce \"13\" para leer y comparar short \n" + "Introduce \"14\" para leer y comparar int \n"
				+ "Introduce \"15\" para leer y comparar double \n" + "Introduce \"16\" para leer y comparar long \n"
				+ "Introduce \"17\" para leer y comparar float \n"
				+ "Introduce \"18\" para escribir dentro de un rango byte \n"
				+ "Introduce \"19\" para escribir dentro de un rango short \n"
				+ "Introduce \"20\" para escribir dentro de un rango int \n"
				+ "Introduce \"21\" para escribir dentro de un rango double \n"
				+ "Introduce \"22\" para escribir dentro de un rango long \n"
				+ "Introduce \"23\" para escribir dentro de un rango float \n");

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
			System.out.println(LecturaComparacion(byte1, byte2, numero));
			break;
		case 13:
			System.out.println(LecturaComparacion(short1, short2, numero));
			break;
		case 14:
			System.out.println(LecturaComparacion(int1, int2, numero));
			break;
		case 15:
			System.out.println(LecturaComparacion(double1, double2, numero));
			break;
		case 16:
			System.out.println(LecturaComparacion(long1, long2, numero));
			break;
		case 17:
			System.out.println(LecturaComparacion(float1, float2, numero));
			break;
		case 18:
			System.out.print(LecturaRango(byte2, byte3, byte1, tipo));
			break;
		case 19:
			System.out.print(LecturaRango(short2, short3, short1, tipo));
			break;
		case 20:
			System.out.print(LecturaRango(int2, int3, int1, tipo));
			break;
		case 21:
			System.out.print(LecturaRango(double2, double3, double1, tipo));
			break;
		case 22:
			System.out.print(LecturaRango(long2, long3, long1, tipo));
			break;
		case 23:
			System.out.print(LecturaRango(float2, float3, float1, tipo));
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

		if (numero == Comparacion.MayorOIgual) {

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

		if (numero == Comparacion.MenorOIgual) {

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

		if (numero == Comparacion.Mayor) {

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

		if (numero == Comparacion.Menor) {

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

		if (numero == Comparacion.MayorOIgual) {

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

		if (numero == Comparacion.MenorOIgual) {

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

		if (numero == Comparacion.Mayor) {

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

		if (numero == Comparacion.Menor) {

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

		if (numero == Comparacion.MayorOIgual) {

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

		if (numero == Comparacion.MenorOIgual) {

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

		if (numero == Comparacion.Mayor) {

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

		if (numero == Comparacion.Menor) {

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

		if (numero == Comparacion.MayorOIgual) {

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

		if (numero == Comparacion.MenorOIgual) {

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

		if (numero == Comparacion.Mayor) {

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

		if (numero == Comparacion.Menor) {

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

		if (numero == Comparacion.MayorOIgual) {

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

		if (numero == Comparacion.MenorOIgual) {

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

		if (numero == Comparacion.Mayor) {

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

		if (numero == Comparacion.Menor) {

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

		if (numero == Comparacion.MayorOIgual) {

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

		if (numero == Comparacion.MenorOIgual) {

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

		if (numero == Comparacion.Mayor) {

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

		if (numero == Comparacion.Menor) {

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
			if (tipo == Rango.Ambos_Incluidos) {
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
			} else if (tipo == Rango.Ambos_Excluidos) {
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

			} else if (tipo == Rango.Mínimo_Excluido_Máximo_Inluido) {
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

			} else if (tipo == Rango.Máximo_Excluido_Mínimo_Incluido) {
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
			if (tipo == Rango.Ambos_Incluidos) {
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
			} else if (tipo == Rango.Ambos_Excluidos) {
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

			} else if (tipo == Rango.Mínimo_Excluido_Máximo_Inluido) {
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

			} else if (tipo == Rango.Máximo_Excluido_Mínimo_Incluido) {
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
			if (tipo == Rango.Ambos_Incluidos) {
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
			} else if (tipo == Rango.Ambos_Excluidos) {
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

			} else if (tipo == Rango.Mínimo_Excluido_Máximo_Inluido) {
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

			} else if (tipo == Rango.Máximo_Excluido_Mínimo_Incluido) {
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
			if (tipo == Rango.Ambos_Incluidos) {
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
			} else if (tipo == Rango.Ambos_Excluidos) {
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

			} else if (tipo == Rango.Mínimo_Excluido_Máximo_Inluido) {
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

			} else if (tipo == Rango.Máximo_Excluido_Mínimo_Incluido) {
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
			if (tipo == Rango.Ambos_Incluidos) {
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
			} else if (tipo == Rango.Ambos_Excluidos) {
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

			} else if (tipo == Rango.Mínimo_Excluido_Máximo_Inluido) {
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

			} else if (tipo == Rango.Máximo_Excluido_Mínimo_Incluido) {
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
			if (tipo == Rango.Ambos_Incluidos) {
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
			} else if (tipo == Rango.Ambos_Excluidos) {
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

			} else if (tipo == Rango.Mínimo_Excluido_Máximo_Inluido) {
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

			} else if (tipo == Rango.Máximo_Excluido_Mínimo_Incluido) {
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
