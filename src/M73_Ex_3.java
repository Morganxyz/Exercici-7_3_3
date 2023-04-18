import java.util.Scanner;

public class M73_Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String frase = "";
			char posicio = ' ';
			int llarFrase = 0;
			String inverse =  "";
			int contador = 0;
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introdueix un palindrom sense espais en blanc: ");
			frase = entrada.nextLine();
			
			//System.out.println(frase.length()); para realizar comprobaciones
			
			llarFrase = frase.length();
			contador = llarFrase;
			
			for(int i = 0; i <llarFrase; i++) {
				posicio = frase.charAt(contador - 1);
				inverse += posicio;
				contador--;
			}
			
			System.out.println((inverse.equalsIgnoreCase(frase)) ? "Molt be, has fet un palindrom!" : "No es un palindrom"); 
			
			}
	
	}

