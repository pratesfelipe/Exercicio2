import java.util.Scanner;

public class Exercicio2_1 {

	public static void main(String[] args) {

//		Exerc�cio 1: Escreva um programa em Java que leia inicialmente as dimens�es da matriz (n�mero 
//				de linhas e n�mero de colunas) e, em seguida, fa�a o preenchimento da matriz com valores inteiros 
//				fornecidos pelo usu�rio. Ap�s o preenchimento da matriz dever� ser lido via teclado um valor X e 
//				o seu programa dever� fazer a busca desse valor na matriz. Se o valor for encontrado dever� ser 
//				impresso no v�deo a sua localiza��o (n�mero da linha e n�mero da coluna). Caso o valor n�o esteja 
//				na matriz dever� ser impresso no v�deo a mensagem: �X n�o se encontra na matriz�. 

		int[][] x = Matriz();
		Preencher(x);
		Valor(x);
	}

	public static void Valor(int[][] x) {
		Scanner teclado = new Scanner(System.in);

		int colunas, linhas, valor;
		System.out.print("Informe um valor dentro da matriz ");
		valor = teclado.nextInt();

		boolean achou = false;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == valor) {
					System.out.println(valor + " est� na posi��o " + (i + 1) + ", " + (j + 1));
					achou = true;
					break;
				}
			}

		}
		if (!achou) {
			System.out.println("Valor n�o se encontra na matriz");

		}

	}

	public static void Preencher(int[][] x) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println("Valor :");
				x[i][j] = teclado.nextInt();

			}
		}
	}

	public static int[][] Matriz() {
		Scanner teclado = new Scanner(System.in);
		int colunas, linhas, valor;
		System.out.print("Informe o numero de colunas ");
		colunas = teclado.nextInt();
		System.out.print("Informe o numero de linhas ");
		linhas = teclado.nextInt();
		int[][] x = new int[colunas][linhas];

		return x;
	}

}