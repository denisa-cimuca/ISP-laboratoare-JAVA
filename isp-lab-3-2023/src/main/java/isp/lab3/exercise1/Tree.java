package isp.lab3.exercise1;

public class Tree {
    public int height;
    public Tree ( ) {

        height = 15;
    }
    public void grow ( int meters ) {
        if ( meters >= 1 ) {
            height = height + meters;
        }
    }
    public String toString ( ) {

        return String.valueOf ( height );
    }
}
