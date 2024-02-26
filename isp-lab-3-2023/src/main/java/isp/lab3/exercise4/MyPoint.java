package isp.lab3.exercise4;

public class MyPoint {
    public int x;
    public int y;
    public int z;
    public MyPoint(){
        x = 0;
        y = 0;
        z = 0;
    }
    public MyPoint(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }
    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return  "(" + x + ", " + y + ", " + z + ")";
    }
    }

