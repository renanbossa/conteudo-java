import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int inicioTrabalho = 8;
		double testeDouble = 2.899;
		String nome = "pais";
		int dia = 11;
		
		// TODO Auto-generated method stub
		System.out.println("Olá mundo!");
		System.out.print("Olá java! ");
		System.out.println("Olá itaú!");
		System.out.println("Início do trabalho : " + inicioTrabalho);
		System.out.printf("%.2f%n",testeDouble);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",testeDouble);
		System.out.printf("Comprei uma TV para os meus %s no dia %d no valor de R$ %.2f reais%n", nome,dia,testeDouble);
	}

}
