package isp.lab10.exercise1;


public class Aircraft implements Runnable {
    private String id;
    private int altitude;
    private String airplane;
    private String lock = "lock";
    int k = 0;

    public Aircraft ( String id ) {
        this.id = id;
    }

    public void start ( ) {
        Thread t = new Thread ( this );
        t.start ( );
    }

    public String getId ( ) {
        return id;
    }

    public int getAltitude ( ) {
        return altitude;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public void setAltitude ( int altitude ) {
        this.altitude = altitude;
    }

    @Override
    public void run ( ) {
        while (k < 20) {
            System.out.println ( "Aircraft " + id + " is flying" );
            k++;
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                throw new RuntimeException ( e );
            }
            if ( k == 15 ) {
                synchronized (lock) {
                    try {
                        lock.wait ( );
                    } catch (InterruptedException e) {
                        throw new RuntimeException ( e );
                    }
                }
            }
            System.out.println ( "Aircraft " + id + " is landing" );
        }
    }

    public void land ( ) {
        synchronized (lock) {
            lock.notify ( );
        }
    }
}