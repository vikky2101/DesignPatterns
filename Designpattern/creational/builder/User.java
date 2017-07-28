package builder;

public class User {
	private String fname;
	private String lname;
	private String city;
	private String address;

	private User(Builder builder) {
		this.fname = builder.fname;
		this.lname = builder.lname;
		this.city = builder.city;
		this.address = builder.address;
	}

	public static class Builder {
		private String fname;
		private String lname;
		private String city;
		private String address;

		public Builder fName(String name) {
			this.fname = name;
			return this;
		}

		public Builder lName(String name) {
			this.lname = name;
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

		public User Build() {
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User Info- FirstName: " + fname + " LastName: " + lname + " City: " + city + " Address: " + address;
	}

}
