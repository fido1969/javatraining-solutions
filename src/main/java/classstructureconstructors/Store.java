package classstructureconstructors;

public class Store {

    private String product;

    private int stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public void store(int storeIn) {
        stock += storeIn;
    }

    public void dispatch(int storeOut) {
        stock -= storeOut;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
