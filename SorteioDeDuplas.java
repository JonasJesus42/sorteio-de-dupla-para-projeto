import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteioDeDuplas {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Criando array para os nomes dos participantes e projetos.
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<String> projetos = new ArrayList<String>();
		
		//Perguntando no terminal os Nomes e atribuindo para o array.
		for (int i = 0; i <= 5; i++) {
			System.out.print(i+1+"° nome?: ");
			nomes.add(entrada.next());
			System.out.println("");
			System.out.println("==========================================================================");
			System.out.println("");
		}
		
		//Perguntando no terminal os Projetos e atribuindo para o array.
		for (int i = 0; i <= 2; i++) {
			System.out.print(i+1+"° Projeto?: ");
			projetos.add(entrada.next());
			System.out.println("");
			System.out.println("==========================================================================");
			System.out.println("");
		}
		
		//Embaralhando os nomes e projetos.
		 Collections.shuffle(nomes);
		 Collections.shuffle(projetos);
		 
		 System.out.println("");
		 
		 //Separa as duplas em projetos nomeando uma pessoa a lider.
		 int contador = 0;
		for(int i = 0; i <= 4; i+=2) {
			int primeiro = i;
			int segundo = i+1;
			
			System.out.println("A dupla para o projeto "+projetos.get(contador)+".");
			System.out.println(nomes.get(primeiro)+" serar o(a) Lider, "+nomes.get(segundo)+" sera a outra dupla"+".");
			System.out.println("");
			System.out.println("##################################################################################");
			System.out.println("");
			contador= contador +1;
		}
		
		 System.out.println("");
		 System.out.println("QUE COMECEM OS JOGOS!!!.");
		entrada.close();
	}
}
