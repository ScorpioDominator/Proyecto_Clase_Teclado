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
		int numeroMenu, numeroMenu2, numeroMenu3, int1 = 0, int2 = 20, int3 = 30;
		double double1 = 0, double2 = 20, double3 = 30;
		long long1 = 0, long2 = 20, long3 = 30;
		float float1 = 0, float2 = 20, float3 = 30;
		char charKey = ' ';
		String stringKey = " ", Elección = "Elige color", Opción1 = "1.1 Rojo", Opción2 = "1.2 Verde",
				pregunta = "¿Estas casado?";

		System.out.print("Pulsa uno de los siguientes números para elegir la opción que quieres: \n"
				+ "1. Para un carácter \n"
				+ "2. Para una cadena \n"
				+ "3. Para el primer boolean \n"
				+ "4. Para el segundo boolean \n"
				+ "5. Para un número \n"
				+ "6. Para una comparación \n"
				+ "7. Para un rango \n"
				+ "8. Para cerrar teclado \n"
				+ "9. Para salir \n");
		
		numeroMenu=keyboard.nextInt();
		keyboard.nextLine();
		
		switch (numeroMenu) {
		
		case 1: 
		System.out.println(LecturaChar(charKey));
		break;
		
		case 2: 
		System.out.println(LecturaString(stringKey));
		break;
		
		case 3:
		System.out.println(LecturaBoolean(Elección, Opción1, Opción2));
		break;
		
		case 4:
		System.out.println(LecturaBoolean(pregunta));
		
		case 5:
			
			System.out.print("Inserta el número de la opción que desees \n"
					+ "1. byte \n"
					+ "2. short \n"
					+ "3. int \n"
					+ "4. long \n"
					+ "5. float \n"
					+ "6. double \n");
			
			numeroMenu2=keyboard.nextInt();
			keyboard.nextLine();
			
		
		
		switch (numeroMenu2) {
		case 1:
			System.out.println(LecturaNumero(byte1));
			break;
		case 2:
			System.out.println(LecturaNumero(short1));
			break;
		case 3:
			System.out.println(LecturaNumero(int1));
			break;
		case 4:
			System.out.println(LecturaNumero(long1));
			break;
		case 5:
			System.out.println(LecturaNumero(float1));
			break;
		case 6:
			System.out.println(LecturaNumero(double1));
			break;
		}
		break;
		
		case 6:
		
			
			System.out.print("Inserta el número de la opción que desees \n"
					+ "1. byte \n"
					+ "2. short \n"
					+ "3. int \n"
					+ "4. long \n"
					+ "5. float \n"
					+ "6. double \n");
			
			numeroMenu2=keyboard.nextInt();
			keyboard.nextLine();
			
			
			switch (numeroMenu2) {
			
			case 1:
				
				System.out.print("Inserta el número de la opción que desees \n"
						+ "1. Meyor o igual \n"
						+ "2. Menor o igual \n"
						+ "3. mayor \n"
						+ "4. menor \n");
				numeroMenu3=keyboard.nextInt();
				keyboard.nextLine();
				
				switch (numeroMenu3) {
				
				case 1:
					
					System.out.println(LecturaComparacion(byte1, byte2, numero1));
					break;
				
				case 2:
				
				System.out.println(LecturaComparacion(byte1, byte2, numero2));
					break;

				
				case 3:
					
					System.out.println(LecturaComparacion(byte1, byte2, numero3));
						break;

					
				case 4:
					
					System.out.println(LecturaComparacion(byte1, byte2, numero4));
					break;
					
		}
				break;
				
			case 2:
				
				System.out.print("Inserta el número de la opción que desees \n"
						+ "1. Meyor o igual \n"
						+ "2. Menor o igual \n"
						+ "3. mayor \n"
						+ "4. menor \n");
				numeroMenu3=keyboard.nextInt();
				keyboard.nextLine();
				
				switch (numeroMenu3) {
				
				case 1:
					
					System.out.println(LecturaComparacion(short1, short2, numero1));
					break;
				
				case 2:
				
				System.out.println(LecturaComparacion(short1, short2, numero2));
					break;

				
				case 3:
					
					System.out.println(LecturaComparacion(short1, short2, numero3));
						break;

					
				case 4:
					
					System.out.println(LecturaComparacion(short1, short2, numero4));
					break;
				}
	}
		}
			
		
	}

	public static void KeyboardClose() {

		keyboard.close();
		System.out.println("Teclado cerrado");
	}

	public static char LecturaChar(char charKey) {
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

	public static String LecturaString(String stringKey) {
		System.out.println("Introduce una cadena");
		stringKey = keyboard.nextLine();
		return stringKey;
	}

	public static boolean LecturaBoolean(String elección, String Opción1, String Opción2) {
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

	public static boolean LecturaBoolean(String pregunta) {
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

	public static byte LecturaNumero(byte number) {
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

	public static short LecturaNumero(short number) {

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

	public static int LecturaNumero(int number) {

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

	public static double LecturaNumero(double number) {

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

	public static long LecturaNumero(long number) {

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

	public static float LecturaNumero(float number) {

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
					number1 = LecturaNumero(number1);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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
						number = LecturaNumero(number);

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

	public static int MenuNumero(int numeroMenu) {
		
		
		System.out.print("Inserta el número de la opción que desees \n"
				+ "1. byte \n"
				+ "2. short \n"
				+ "3. int \n"
				+ "4. long \n"
				+ "5. float \n"
				+ "6. double \n");
		
		numeroMenu=keyboard.nextInt();
		keyboard.nextLine();
		
		return numeroMenu;
	}
	
	public static int MenuComparacion(int numeroMenu) {
		
		
		System.out.print("Inserta el número de la opción que desees \n"
				+ "1. Meyor o igual \n"
				+ "2. Menor o igual \n"
				+ "3. mayor \n"
				+ "4. menor \n");
		numeroMenu=keyboard.nextInt();
		keyboard.nextLine();
		
		return numeroMenu;
	}
}
