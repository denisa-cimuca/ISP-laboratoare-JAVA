package isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Product p = new Product ( "123", "Boiler", 1500.00, ProductCategory.ELECTRONICS );
        Product p1 = new Product (  );
        Address s = new Address ( "Lalelelor", "Bistita" );
        System.out.println(p.toString ());
        System.out.println(p1.toString ());
        System.out.println(s.toString ());
    }
}
