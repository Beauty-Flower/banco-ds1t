package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		//Criar uma agência
		Agencia agencia = new Agencia();
		agencia.setNumero("4214-9");
		agencia.setNomeGerente("João");
		agencia.setTelefone("(11) 9 5863-9854");
		agencia.setCidade("Jandira");
		
		//Criar a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria@email.com");
		clienteMaria.setSalario(5000);
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setAgencia(agencia);
		contaMaria.setCliente(clienteMaria);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);	
		
		//Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@email.com");
		clientePedro.setSalario(2500);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setAgencia(agencia);
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		
		//Criar a cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana@email.com");
		clienteAna.setSalario(4700);
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setAgencia(agencia);
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
	}

}
