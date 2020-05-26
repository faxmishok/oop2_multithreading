public class Counter extends Thread {
    private String name;
    private static int counter = 0;
    private int myOrderOfBirth = 0;
    private static int myOrderOfDeath = 0;
    public static int noNames = 0;


    public Counter() {
        this.name="Untitled " + ++noNames;
        this.myOrderOfBirth=++counter;
    }

    public Counter(String name) {
        this.name=name;
        this.myOrderOfBirth=++counter;

    }


    @Override
    public void run() {

        for (int i=0; i<3; i++) {
            int x = (int)(Math.random()*((5-0)+1))+0;
            try {
                sleep(x*1000);
                System.out.println("Thread - " + this.name + " is now at counter " + i + " after " + x + " seconds of sleep" + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        myOrderOfDeath++;
        System.out.println( this.myOrderOfBirth + "th Thread - " +  this.name + " succesfully terminated " + myOrderOfDeath + "th ");
    }
}



