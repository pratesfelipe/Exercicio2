import java.util.Scanner;

public class Exercicio2_1 {

	public static void main(String[] args) {

//		Exercício 1: Escreva um programa em Java que leia inicialmente as dimensões da matriz (número 
//				de linhas e número de colunas) e, em seguida, faça o preenchimento da matriz com valores inteiros 
//				fornecidos pelo usuário. Após o preenchimento da matriz deverá ser lido via teclado um valor X e 
//				o seu programa deverá fazer a busca desse valor na matriz. Se o valor for encontrado deverá ser 
//				impresso no vídeo a sua localização (número da linha e número da coluna). Caso o valor não esteja 
//				na matriz deverá ser impresso no vídeo a mensagem: “X não se encontra na matriz”. 

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
					System.out.println(valor + " está na posição " + (i + 1) + ", " + (j + 1));
					achou = true;
					break;
				}
			}

		}
		if (!achou) {
			System.out.println("Valor não se encontra na matriz");

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