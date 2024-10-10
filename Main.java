
public class Main {

	public static void main(String[] args) {
		
		Account ContaCorrente = new CheckingAccount(4234, 342362642, "Banrisul");
		Account ContaPoupanca = new SavingAccount(4234, 342362642, "Banrisul");
		
		
		ContaCorrente.deposit(200);
		ContaCorrente.printStatement();
		
		ContaPoupanca.deposit(23);
		ContaPoupanca.printStatement();
		
		ContaCorrente.transfer(100, ContaPoupanca);
		
		ContaCorrente.printStatement();
		ContaPoupanca.printStatement();
	}
}
