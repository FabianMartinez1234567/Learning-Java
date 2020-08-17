import java.util.Scanner;

public class DatosPorTeclado
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String nombre = "";
		int numero1 = 0, numero2 = 0, resultado = 0;
		System.out.println("Cual es tu nombre?");
		nombre = in.nextLine();				
		
		System.out.println("Ingrese el primer numero: ");
		numero1 = in.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		numero2 = in.nextInt();
	
		resultado = numero1 + numero2;
		System.out.println("Hola "+ nombre +" El resultado de tu suma es: " + resultado);
	}
} 