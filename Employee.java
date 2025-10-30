public class Employee {
  String nama;
  int usia;
  float gaji;

  // Constructor
  public Employee(String nama, int usia, float gaji) {
    this.nama = nama;
    this.usia = usia;
    this.gaji = gaji;
  }

  // Getter
  public String getName() { return nama; }
  public int getUsia() { return usia; }
  public float getGaji() { return gaji; }

  // Setter
  public void setName(String nama) { this.nama = nama; }
  public void setUsia(int usia) { this.usia = usia; }
  public void setGaji(float gaji) { this.gaji = gaji; }

  // Instance method
  public void displayDetails() {
    System.out.println("nama: " + nama);
    System.out.println("usia: " + usia);
    System.out.println("gaji: " + gaji);
  }

  public static void main(String[] args) {
    Employee emp = new Employee("Miftah", 19, 30000.0f);
    emp.displayDetails();
  }
}