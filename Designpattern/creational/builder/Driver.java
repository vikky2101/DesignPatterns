package builder;

public class Driver {

  public static void main(String[] args) {
    User user = new User.Builder().fName("Vikash").lName("Kumar").city("Patna").address("Bhelwara")
        .build();
    System.out.println(user.toString());
  }

}
