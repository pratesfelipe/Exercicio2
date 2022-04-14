import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {


		
//		Escreva um programa em Java para fazer a correção de uma prova contendo 10 
//		questões de múltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o número de alunos 
//		deverá ser informado pelo usuário da aplicação). O programa deverá gerar as respostas dos alunos 
//		de forma aleatória e as respostas deverão ser impressas no vídeo no formato de uma tabela 
//		(conforme apresentado durante as aulas). Em seguida, o programa deverá ler o gabarito da prova 
//		(a entrada deverá ser informada pelo usuário da aplicação). O seu programa deverá emitir um relatório contendo a nota de cada aluno e a sua situação (aprovado ou reprovado) considerando 
//		que a nota para aprovação deverá ser maior ou igual a 7. 

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