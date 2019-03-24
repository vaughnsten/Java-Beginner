package Hello;

public class ConstructorExercise {

	public static void main(String[] args) {
		
		AccountConstructors bobsAccount = new AccountConstructors();
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
	}
}
