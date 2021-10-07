package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private double saldo;

	// Método construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	//Métodos - set e get
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Valor inválido!");
		} else {
			saldo += valorDeposito;
		}

	}

	public boolean sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("Valor inválido!");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}

	}

	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Não foi possível realizar a transferência!");
		}

	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia.getNumero());
		System.out.printf("Gerente: %s\n", agencia.getNomeGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
