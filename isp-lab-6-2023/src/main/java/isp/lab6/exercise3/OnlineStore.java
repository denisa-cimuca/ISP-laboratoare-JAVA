package isp.lab6.exercise3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products;
    private Map sessions;
    public List getProducts(){
       return products = products;
    }
    public List getProductsSorted( Comparator<Product> sortCriteria ){
        return (List) (sortCriteria = sortCriteria);
    }
    protected void addSession(String userName){

        }
    protected void removeSession(String userName){

    }
    public void addToCart(List<Product> product,String userName,String quantity){
        boolean added = product.add( (Product) products );
        if(added){
            System.out.println ( "added");
        }
    }
    public String checkout(String userName){
        return userName;
    }

}
