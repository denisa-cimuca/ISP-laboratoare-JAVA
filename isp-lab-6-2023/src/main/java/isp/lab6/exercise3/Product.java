package isp.lab6.exercise3;

import java.util.Objects;

public class Product {
    public String name;
    public String price;

    public Product ( String name , String price ) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Product product = (Product) o;
        return Objects.equals ( name , product.name ) && Objects.equals ( price , product.price );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( name , price );
    }

    @Override
    public String toString ( ) {
        return "Product: "  + name + " " + price ;
    }
}
