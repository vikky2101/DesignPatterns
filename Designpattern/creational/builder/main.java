package builder;

public class main {

	public static void main(String[] args) {
		User user = new User.Builder().fName("Vikash").lName("Kumar").city("Patna").address("Bhelwara").Build();
        System.out.println(user.toString());
	}

}
