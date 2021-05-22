package entitities;

import java.util.Scanner;

public class Conta {

	Scanner leia = new Scanner(System.in);

	public int numero;
	public String dono;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, String dono) {

		this.numero = numero;
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public double depositar(double saldo) {
		return this.saldo += saldo;
	}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com Sucesso, R$: " + valor);
		} else {
			System.out.println("Saque não realizado, saldo insuficiente!");
		}
	}

	public void transf(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Transferencia realizada com Sucesso, R$: " + valor);

		} else {
			System.out.println("Transferência não realizada, saldo insuficiente!");

		}
	}

}
