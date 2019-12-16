package builder;

public class User {

  private String fName;
  private String lName;
  private String city;
  private String address;

  private User(Builder builder) {
    this.fName = builder.fName;
    this.lName = builder.lName;
    this.city = builder.city;
    this.address = builder.address;
  }

  public static class Builder {

    private String fName;
    private String lName;
    private String city;
    private String address;

    public Builder fName(String name) {
      this.fName = name;
      return this;
    }

    public Builder lName(String name) {
      this.lName = name;
      return this;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  @Override
  public String toString() {
    return "User Info- FirstName: " + fName + " LastName: " + lName + " City: " + city
        + " Address: " + address;
  }

}
