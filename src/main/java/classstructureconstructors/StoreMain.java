package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store storeApple = new Store("Apple");
        System.out.println("Opening stock of " + storeApple.getProduct() + " = " + storeApple.getStock());

        storeApple.store(200);
        System.out.println("Current stock of " + storeApple.getProduct() + " = " + storeApple.getStock());

        storeApple.dispatch(50);
        System.out.println("Current stock of " + storeApple.getProduct() + " = " + storeApple.getStock());

        System.out.println();

        Store storeOrange = new Store("Orange");

        System.out.println("Opening stock of " + storeOrange.getProduct() + " = " + storeOrange.getStock());

        storeOrange.store(200);
        System.out.println("Current stock of " + storeOrange.getProduct() + " = " + storeOrange.getStock());

        storeOrange.dispatch(50);
        System.out.println("Current stock of " + storeOrange.getProduct() + " = " + storeOrange.getStock());
    }
}
