import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {


		
//		Escreva um programa em Java para fazer a corre��o de uma prova contendo 10 
//		quest�es de m�ltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o n�mero de alunos 
//		dever� ser informado pelo usu�rio da aplica��o). O programa dever� gerar as respostas dos alunos 
//		de forma aleat�ria e as respostas dever�o ser impressas no v�deo no formato de uma tabela 
//		(conforme apresentado durante as aulas). Em seguida, o programa dever� ler o gabarito da prova 
//		(a entrada dever� ser informada pelo usu�rio da aplica��o). O seu programa dever� emitir um relat�rio contendo a nota de cada aluno e a sua situa��o (aprovado ou reprovado) considerando 
//		que a nota para aprova��o dever� ser maior ou igual a 7. 

		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		int alunos;
		
		System.out.println("Informe quantos alunos tem na sala ");
		alunos = teclado.nextInt();
		
		
		int [][] prova = new int [alunos][10];
		     for(int i = 0; i < alunos; i++) {
		    	 for(int j = 0; j < 10; j++) {
		    		 prova[i][j] = gerador.nextInt(5);
		    	  System.out.print(prova [i][j] + "\t");
		    	  } System.out.println();
		     }

}
}