package senai.jandira.br;

import java.util.Scanner;

public class codPrincipal {

	public static void main(String[] args) {
		
		//leitura
		Scanner leitor = new Scanner(System.in);
		
		 int multiplicando ;
		
		 int minimoMultiplicador;
		
		 int maximoMultiplicador;
		
		 int resultado;
		
		System.out.println("multiplicando?");
		multiplicando=leitor.nextInt();
				
		System.out.println(" minimo multiplicador");
		minimoMultiplicador=leitor.nextInt();
		
		System.out.println("maximo multiplicador");
		maximoMultiplicador = leitor.nextInt();
		
		//equação
		
	   
	   
	   while ( minimoMultiplicador <= maximoMultiplicador) {
		   
		   resultado = multiplicando * minimoMultiplicador;
		   
		   System.out.println(resultado);
		   
		   minimoMultiplicador++;
		
		
	   }
	   
		
		
         
         
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		
		
		
		
	}

}
