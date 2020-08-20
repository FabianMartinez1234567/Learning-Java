import java.util.Scanner;

public class DatosPorTeclado
{
	public static void main(String args[])
	{
		int numero1= 5, numero2=3, resultado=0;
		int parametro=2;
		switch(parametro){

		case 1: resultado=numero1+numero2;
			System.out.println("La suma es: "+ resultado);
			break;

		case 2: resultado=numero1-numero2;
			System.out.println("La resta es: "+ resultado);
			break;

		case 3: resultado=numero1/numero2;
			System.out.println("La division es: "+ resultado);
			break;

		default:System.out.println("Opcion incorrecta");
			break;



		}
	}
}  