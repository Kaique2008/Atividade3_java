package estruturaRepeticao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int f;
	double s, st = 0, mt;
	System.out.println("Quantos funcionarios tem sua empresa?");
	f = ler.nextInt();
	for (int i=f; i>=1; i--) {
		System.out.println("Qual é o salario?");
		s = ler.nextDouble();
		st +=s;
	}
	mt = st/f;
	System.out.println("A média slarial é "+mt);
	ler.close();
	}

}
