public class TestCounter {

    public static void main(String args[]) {

        Counter thr1 = new Counter("Gulshan");
        Counter thr2 = new Counter("Fidan");
        Counter thr3 = new Counter("Mehriban");
        Counter thr4 = new Counter("Fahmin");
        Counter thr5 = new Counter("Saida");
        Counter thr6 = new Counter();
        Counter thr7 = new Counter();
        Counter thr8 = new Counter();


        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
        thr8.start();





    }
}
