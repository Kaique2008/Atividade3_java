package estruturaRepeticao;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		double n = 0;
		Scanner ler = new Scanner (System.in);
		for (int i=1; i <=5; i++) {
			System.out.println("Qual são os valores");
			double n2 = ler.nextDouble();
			n += n2;
		}System.out.println("A soma "+n+" e a media é "+n/5);
		ler.close();
	}
}