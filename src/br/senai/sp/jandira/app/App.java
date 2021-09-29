package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Cria��o da conta da Maria
		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numero = "7845-8";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.saldo = 500.0;
		contaMaria.tipo = "Corrente";
		
		// Cria��o da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.titular = "Pedro Cabral";
		contaPedro.numero = "6547-6";
		contaPedro.saldo = 200.0;
		contaPedro.tipo = "Poupan�a";
		contaPedro.numeroAgencia = "4214-9";
		
		// Cria��o da conta da Ana
		Conta contaAna = new Conta();
		contaAna.titular = "Ana Gomes";
		contaAna.numero = "23145-9";
		contaAna.saldo = 2000.0;
		contaAna.tipo = "Corrente";
		contaAna.numeroAgencia = "4214-9";
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		

	}

}
