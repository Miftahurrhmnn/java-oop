import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Transaction{
  int idUser;
  String nameUser;
  float qtyDeposit;

  ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

  public Transaction() {

  }

  public Transaction(int idUser, String namaUser, float qtyDeposit) {
    this.idUser = idUser;
    this.nameUser = namaUser;
    this.qtyDeposit = qtyDeposit;
  }

  // Getter
  public int getId() {
    return idUser;
  }

  public String getName() {
    return nameUser;
  }

  public float getDeposit() {
    return qtyDeposit;
  }


  // Setter
  public void setId(int idUser) {
    this.idUser = idUser;
  }

  public void setId(String nameUser) {
    this.nameUser = nameUser;
  }

  public void setQtyDeposit(float qtyDeposit) {
    this.qtyDeposit = qtyDeposit;

    if (qtyDeposit >= 1000000000) {
      System.out.println(nameUser + "Nasabah Prioritas");
      System.out.println("Jumlah Deposit " + qtyDeposit);
    } else {
      scheduler.schedule(new Runnable() {
        @Override
        public void run() {
          System.out.println(nameUser + "Nasabah Biasa");
          System.out.println("Jumlah Deposit " + qtyDeposit);
        }
      }, 1000, TimeUnit.SECONDS);
    }
  }

  public void displayTransactionUser() {
    System.out.println("Id: " + idUser);
    System.out.println("Username: " + nameUser);
    System.out.println("Deposit: " + qtyDeposit);
  }

  public void main(String[] args) {
    Scanner myData = new Scanner(System.in);

    System.out.println("Masukkan ID anda: ");
    int idUser = myData.nextInt();
    myData.nextLine();

    System.out.println("Masukkan Username anda: ");
    String nameUser = myData.nextLine();

    System.out.println("Masukkan jumlah Deposit anda: ");
    float qtyDeposit = myData.nextFloat();

    Transaction transaction = new Transaction(idUser, nameUser, qtyDeposit);
    transaction.displayTransactionUser();

     myData.close();
  }
}