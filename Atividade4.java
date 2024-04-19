package estruturaRepeticao;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		int n,f=1;
		Scanner ler = new Scanner (System.in);
		System.out.println("qual u número deseja transformar em fatorial?");
		n = ler.nextInt();
		for(int i=n; i>=1; i--) {
			f*=i;
		}
		System.out.println(f);
		ler.close();
	}
}