
public class BankTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account p1=new Account(001,"gajanan",50000);
		Account p2=new Account(002,"Baba",60000);
		System.out.println("ACC deatils of p1 before transfer: "+p1.getAccDetails());
		System.out.println("ACC deatils of p1 before transfer: "+p2.getAccDetails());
		System.out.println("***************************************************************");
         p1.transferFunds(p2, 10000);
         System.out.println("ACC deatils of p1 after transfer: "+p1.getAccDetails());
 		System.out.println("ACC deatils of p1 after transfer: "+p2.getAccDetails());
        System.out.println("total no of acc avilable = "+ Account.getAccCount());

	}

}
