package estruturaRepeticao;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		
		int num, num2;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o primerio valor");
		num = ler.nextInt();
		
		System.out.println("Informe o segundo valor");
		num2 = ler.nextInt();
		
		for (int i=num; i<=num2; i++)
			
			if (i % 2 ==1) {
				System.out.println(i +" O valor pe ímpar");
			}
		
			else {
				System.out.println(i+ " O valor é par");
			}
 		ler.close();
	
		
		

	}

}
