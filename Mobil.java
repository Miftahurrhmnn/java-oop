interface kendaraan {
  void jalan();
  void klakson();
}

public class Mobil implements kendaraan {
  private String nama;

  public Mobil(String nama) {
    this.nama = nama;
  }

  public void jalan() {
    System.out.println(nama + " melaju di jalan...");
  }

  public void klakson() {
    System.out.println(nama + " memberikan klakson...");
  }

   public static void main(String[] args) {
      Mobil m = new Mobil("Honda");
      m.jalan();
      m.klakson();
  }
}