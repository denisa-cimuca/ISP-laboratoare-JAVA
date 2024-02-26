package isp.lab5.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer curstomer;
    private Order order;
    public Product ( String productId, String name, double price, ProductCategory productCategory){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }
    public Product(){
        productId = productId;
        name = name;
        price = price;
        productCategory = productCategory;
        this.order = order;
    }
    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public ProductCategory getProductCategory(){
        return productCategory;
    }
    public void setProductCategory(ProductCategory productCategory){
        this.productCategory = productCategory;
    }
    public String toString(){
        return productId + " " + name + " " + price + " " + productCategory;
    }
}
