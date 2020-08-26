
import javax.swing.*;

public class Formulario extends JFrame{		//extends nos ayuda importar librerias J
	
	private JLabel etiqueta;				//nuestros lavel siembre van a ser privados

	public Formulario(){
		setLayout(null);
		etiqueta = new JLabel ("yyyyiiiiiiiuuuuuuuuu");
		etiqueta.setBounds(10,20,200,300);
		add(etiqueta);
	}
	public static void main(String args[]){
		Formulario formulario1= new Formulario();
		formulario1.setBounds(0,0,4,3);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	}
}