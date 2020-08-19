import java.util.Scanner;

public class DatosPorTeclado
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		String nombre = "";
		int clave=0, antiguedad=0;
		System.out.println("Bienvenido");
		System.out.println("");
		System.out.println("");
		System.out.println("Cual es el nombre del trabajador");
		nombre=entrada.nextLine();
		System.out.println("");
		
		System.out.println("Cuanto tiempo tiene trabajando el pendejo?");
		antiguedad=entrada.nextInt();	
		System.out.println("");

		System.out.println("Cual es la clave del trabajador?");
		clave=entrada.nextInt();
		System.out.println("");
		
		if(clave==1){
		
		}else if(clave==2){
		
		}else if(clave==3){
		}else
		{
			System.out.println("La clave es incorrecta")
		}
	}
}  