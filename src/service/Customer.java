package service;


public class Customer implements Runnable{

    Waiter waiter;
    Order order;
    int id;


    public Customer(Waiter waiter,Order order) {

        this.waiter = waiter;
        this.order=order;
    }

    public Customer(int id,Waiter waiter) {
        this.waiter = waiter;
        this.id=id;
    }

    public Customer() {

    }

    public Customer(int id,Order order) {
        this.order=order;
        this.id = id;
    }

    public int getId() {

        return id;
    }

    @Override
    public void run() {
        System.out.println("Customer" + id + " is coming in restaurant");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Customer" + id + " is leaving in restaurant");

    }

}