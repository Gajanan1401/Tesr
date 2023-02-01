
public class Account {
      private int accountNo;
      private String name;
      private float balance;
      private static int counter;
	public Account() {

      this.accountNo=000;
      this.name="myacc";
      this.balance=00.122f;
		counter++;
	}
	
	public Account(int accno,String nm,float bal) {

	      this.accountNo=accno;
	      this.name=nm;
	      this.balance=bal;
			counter++;
		}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float amount)
	{
		this.balance+=amount;
	}

	public void withdraw(float amount)
	{
		this.balance-=amount;
	}

	public void transferFunds(Account var,float tranf) {
       var.deposit(tranf);
       this.withdraw(tranf);
       
	}
	  public String getAccDetails() {
		String bal= "accno: " +this.accountNo+ "\nname: " +this.name+ "\nbalance: " +this.balance;
		return bal;
	}
	public static int getAccCount()
	{
		return counter;
	}
	
}
