package javabanco;

import java.util.ArrayList;

import javabanco.entidade.ContaCorrente;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		int umNumero = 42;
		
		Integer umNumeroObj = new Integer(42);
		
		System.out.println("umNumero: " + umNumero);
		System.out.println("umNumeroObj: " + umNumeroObj);

		
		ArrayList<Integer> contas = new ArrayList<Integer>(); 
		
		contas.add(12345);
		contas.add(67890);
		contas.add(2468);
		
		System.out.println("contas: " + contas);
		
		ContaCorrente cc1 = new ContaCorrente(); 
		System.out.println("cc1.getSaldo(): " + cc1.getSaldo());
		
		cc1.credito(umNumero);
		
		System.out.println("cc1.getSaldo() após crédito: " + cc1.getSaldo());
		
		cc1.debito(20);
		
		System.out.println("cc1.getSaldo() após débito: " + cc1.getSaldo());
		
		System.out.println("cc1.extrato(): " + cc1.extrato());
		
	}

}
