package javabanco;

import java.util.ArrayList;
import java.util.Date;

import javabanco.entidade.ContaCorrente;
import javabanco.entidade.Operacao;

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
		
		ContaCorrente cc1 = new ContaCorrente(12345, "Marcos"); 
		System.out.println("cc1.getSaldo(): " + cc1.getSaldo());
		
		cc1.credito(umNumero);
		
		System.out.println("cc1.getSaldo() após o crédito: " + cc1.getSaldo());
		
		cc1.debito(20);
		
		System.out.println("cc1.getSaldo() após o débito: " + cc1.getSaldo());
		
		System.out.println("cc1.extrato(): " + cc1.extrato());
		
		Operacao o1 = new Operacao(500, "CREDITO", (new Date()));
		Operacao o2 = new Operacao(300, "DEBITO", (new Date()));
		
		System.out.println("o1: " + o1.getValor() + ", " + o1.getTipoOperacao() + ", " + o1.getDataHora() );
		System.out.println("o2: " + o2.getValor() + ", " + o2.getTipoOperacao() + ", " + o2.getDataHora() );
		
		System.out.println("o1: " + o1.toString());
		
		ContaCorrente cc2 = new ContaCorrente(67890, "Paula");
		cc1.transferencia(10, cc2);
		System.out.println("cc1.extrato(): " + cc1.extrato());
		System.out.println("cc2.extrato(): " + cc2.extrato());
		
		System.out.println("Nome titular da conta 1: " + cc1.getTitular());
		System.out.println("Número da conta 1: " + cc1.getNumero());
		System.out.println("Nome titular da conta 2: " + cc2.getTitular());
		System.out.println("Número da conta 2: " + cc2.getNumero());
	}

}
