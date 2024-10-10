public abstract class Account implements AccountInterface {

	private int branch;
	private int numAccount;
	private double balance;
	private Bank bank;

	public Account(int branch, int numAccount, String bank) {
		this.branch = branch;
		this.numAccount = numAccount;
		this.bank = new Bank(bank);
	}

	public int getBranch() {
		return branch;
	}

	public int numAccount() {
		return numAccount;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double money) {
		this.balance -= money;
	}

	@Override
	public void deposit(double money) {
		this.balance += money;
	}

	@Override
	public void transfer(double money, Account account) {
		this.balance -= money;
		account.deposit(money);
	}

	@Override
	public void printStatement() {
		System.out.println(balance);
	}

	public String getBank() {
		return this.bank.getName();
	}

}
