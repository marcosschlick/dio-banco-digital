
public interface AccountInterface {
	
	void withdraw(double money);
	
	void deposit(double money);
	
	void transfer(double money, Account account);
	
	void printStatement();
}
