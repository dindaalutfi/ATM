import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Account {
	String accountName;
	String accountPass;
	double balance;
	public Account(String name,String password,double balance){
		this.accountName=Objects.requireNonNull(name);
		this.accountPass=Objects.requireNonNull(password);
		this.balance=balance;
	}
	public boolean isMatching(String name, String encryptedPassword) {
        return Objects.equals(this.accountName, name) 
                    && Objects.equals(this.accountPass, encryptedPassword);
    }
}