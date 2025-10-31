// Class Child
public class Checkout extends Product {
  int QtyProduct;

  public Checkout(String nama, int QtyProduct) {
    super(nama);
    this.QtyProduct = QtyProduct;
  }

  public void displayProduct() {
    displayNameProduct();
    System.out.println("Jumlah produk: " + QtyProduct);
  }

  public static void main(String[] args) {
   Checkout ck = new Checkout("Milo", 100);
   ck.displayProduct();
  }
}

// Class Parent
class Product {
  private String namaProduct;
  
  public Product(String namaProduct) {
    this.namaProduct = namaProduct;
  }

  public void displayNameProduct() {
    System.out.println(namaProduct);
  }

  public static void main(String[] args) {
    Product p = new Product("milo");
    p.displayNameProduct();
  }
}