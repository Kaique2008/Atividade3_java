package estruturaRepeticao;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int p = 0, im = 0;
		Scanner ler = new Scanner (System.in);


		for (int i=1; i<=10; i++) {
			System.out.println("informe os números");
			int n = ler.nextInt();
			if (n%2 == 0) {
				p ++;
			}else {
				im ++;
			}
		}
		System.out.println("tem "+ p +" pares e "+ im +" impares ");
	}
}