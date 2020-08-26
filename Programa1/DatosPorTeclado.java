import java.util.Scanner;

public class DatosPorTeclado
{
	public static void main(String args[])
	{
		String CadenaOriginal = "" , cadenaSub = "";
		int numCaracteres=0,desde=0, hasta=0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de caracteres: ");
		CadenaOriginal=in.nextLine();
		
		numCaracteres=CadenaOriginal.length();
		
		System.out.println("La cadena " + CadenaOriginal + " pose "+ 				numCaracteres + " caracteres.");
		System.out.println("¿Desde que caracter desea optener la 				cadena?: ");
		desde = in.nextInt();
		System.out.println("Hasta que caractes desea obtener la cadena:");
		hasta = in.nextInt();			
		
		cadenaSub= CadenaOriginal.substring(desde,hasta);
		System.out.print("La nueva cadena es: " + cadenaSub);
	}
}  