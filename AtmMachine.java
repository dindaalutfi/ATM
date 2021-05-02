import java.util.Scanner;

class AtmMachine{
	static Scanner scanner=new Scanner(System.in);
	static String nama = null;
	static String password = null;
	static int option;
	static AccountManager m = new AccountManager();
	
	public static void main(String[] args){
		System.out.println("Selamat datang!");
		
		System.out.println("Masukkan nama :");
		nama = new String(scanner.nextLine());
			
		System.out.println("Masukkan password :");
		password =new String(scanner.nextLine());

		Account customer = m.selectAccount(nama, password);
		
		System.out.print(customer.accountName);
		do{
			System.out.println("Selamat Datang "+ customer.accountName);
			System.out.println("Pilihan :");
			System.out.println("1.Saldo\n"
					+ "2.Tarik Tunai\n"
					+ "3.Transfer\n"
					+ "4.Ministatement\n"
					+ "5.Exit\n");	
			switch(option){
			case 1:
				System.out.print(customer.checkBalance());
				break;
			case 2:
				System.out.println("Masukkan jumlah penarikan");
				double amount=scanner.nextInt();
				double left=customer.withdrawl(amount);
				System.out.println("Sisa "+left);
				break;
			case 3:
				customer.transfer(0);;
				break;
				
			case 4:
				System.out.print("Mini Statement");
				break;
			}
			option=scanner.nextInt();
		}while(option!=5);
	}
}