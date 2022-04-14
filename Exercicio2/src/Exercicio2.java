import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

////		Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
//		valores inteiros aleatórios (gerados a partir da classe Random) e, em seguida, faça a impressão dos 
//		elementos no formato de uma tabela (impressão como apresentado durante as aulas). Após a 
//		impressão o seu programa deverá trocar os elementos armazenados no triângulo superior da matriz 
//		com os elementos armazenados no triângulo inferior. Imprima novamente a matriz no vídeo para 
//		conferência. Veja o exemplo abaixo indicando como a troca dos elementos deverá ser realizada. 

		int[][] global = MatrizP();
		
		PrintMatriz(global);
		
		int[][] labolg = InverterMatriz(global);
		System.out.println();
		PrintMatriz(labolg);
		

	}

	public static int[][] MatrizP() {

		Random gerador = new Random();

		int[][] x = new int[4][4];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(10);

			}

		}
		return x;
	}

	public static void PrintMatriz(int[][] x) {

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();

		}
	}
    
	public static int[][] InverterMatriz(int[][] x){
     
		int [][] y = new int [4][4];
		    for(int i = 0; i < x.length; i++) {
		    	for( int j = 0; j < x.length; j++) {
		    		
		    		if(i==j) {
		    			y[i][j] = x[i][j];
		    		}else {
		    			y[j][i] = x[i][j];
		    		}
		    		
		    	}
		    }
		    return y;
		    
	}
}

