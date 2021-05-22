package entitities;

import java.util.Locale;
import java.util.Scanner;

public class MenuPrincipal {

	public void executaMenu() {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta = new Conta(12345, "Deivson");
		Conta conta1 = new Conta(987456, "Ramalho");
		char resp;
		do {
			System.out.println("");
			System.out.println("=====================================================");
			System.out.println("|        SEA BIENVENIDO AL BANCO DO CHILE           |");
			System.out.println("=====================================================");
			System.out.println("");
			System.out.println("           QUÉ OPERACIÓN DESEA REALIZAR             |");
			System.out.println("                                                    |");
			System.out.println("[01] REALIZAR UM DEPOSITO                           |");
			System.out.println("[02] REALIZAR UM SAQUE                              |");
			System.out.println("[03] REALIZAR UMA TRANSFERENCIA                     |");
			System.out.println("[04] CONSULTAR SALDO                                |");
			System.out.println("[05] SAIR                                           |");
			System.out.println("=====================================================");
			System.out.println("");
			int menu = leia.nextInt();
			double valor = 0;
			int escolhaDeConta = 0;

			switch (menu) {
			case 1:
				System.out.println("Favor escolher qual conta quer depositar [1] Deivson / [2] Ramalho");
				escolhaDeConta = leia.nextInt();
				if (escolhaDeConta == 1) {
					System.out.println("Favor informar o valor do Deposito");
					valor = leia.nextDouble();
					conta.depositar(valor);
					System.out.println("Deposito realizado com Sucesso");
				} else if (escolhaDeConta == 2) {
					System.out.println("Favor informar o valor do Deposito");
					valor = leia.nextDouble();
					conta1.depositar(valor);
					System.out.println("Deposito realizado com Sucesso");
				} else {
					System.out.println("Conta invalida");
				}
				break;
			case 2:
				System.out.println("Favor escolher qual conta quer depositar [1] Deivson / [2] Ramalho");
				escolhaDeConta = leia.nextInt();
				if (escolhaDeConta == 1) {
					System.out.println("Favor informa o valor do saque");
					valor = leia.nextDouble();
					conta.saca(valor);
				} else if (escolhaDeConta == 2) {
					System.out.println("Favor informa o valor do saque");
					valor = leia.nextDouble();
					conta1.saca(valor);
				} else {
					System.out.println("Conta invalida");
				}
				break;
			case 3:
				System.out.println("Favor escolher qual conta quer depositar [1] Deivson / [2] Ramalho");
				escolhaDeConta = leia.nextInt();
				if (escolhaDeConta == 1) {
					System.out.println("Favor informar o valor que será transferido");
					valor = leia.nextDouble();
					conta.transf(valor, conta1);
				} else if (escolhaDeConta == 2) {
					System.out.println("Favor informar o valor que será transferido");
					valor = leia.nextDouble();
					conta1.transf(valor, conta);

				} else {
					System.out.println("Conta invalida");
				}
				break;
			case 4:
				System.out.println("Favor escolher qual conta quer depositar [1] Deivson / [2] Ramalho");
				escolhaDeConta = leia.nextInt();
				if (escolhaDeConta == 1) {
					System.out.println("O saldo em conta é: R$ " + conta.getSaldo());
				} else if (escolhaDeConta == 2) {
					//System.out.println("Favor informa o número da conta");
					//escolhaDeConta = leia.nextInt();
					System.out.println("O saldo em conta é: R$ " + conta1.getSaldo());
				} else {
					System.out.println("Conta invalida");
				}
				break;
			case 5:
				System.out.println("Gracias por usar el banco de Chile");
				break;
			default:
				System.out.println("Opção Invalida");
				System.out.println("Escolha uma Opção de [01] a [05]");

			}
			System.out.println("Deseja fazer nova operação [S] / [N]");
			resp = leia.next().charAt(0);

		} while (resp != 'n' && resp != 'N');
		System.out.println("=====================================================");
		System.out.println("|       Gracias por usar el banco de Chile          |");
		System.out.println("=====================================================");
		leia.close();
	}
}
