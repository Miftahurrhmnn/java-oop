class Register {
  String firstName;
  String lastName;

  public Register(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }

  public void setFirstName(String firstName) { this.firstName = firstName; }
  public void setLastName(String lastName) { this.lastName = lastName; }

  public void data() {
    System.out.println("Firstname: " + firstName);
    System.out.println("Lastname: " + lastName);
  }
}


public class User extends Register {
  String email;
  int password;

  public User(String firstName, String lastName, String email, int password) {
    super(firstName, lastName);
    this.email = email;
    this.password = password;
  }

  public void displayDataAccount() {
    data();
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void main(String[] args) {
    User user = new User("Miftah", "hurrahman", "miftah@gmail.com", 123123123);
    user.displayDataAccount();
  }
}