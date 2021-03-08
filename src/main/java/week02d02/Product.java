package week02d02;

public class Product {

    private String name;

    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product product) {
        return name.equals(product.getName());
    }

    public boolean areTheyEqualNamAndCode(Product product) {
        return name.equals(product.getName()) && Math.abs(code.length() - product.code.length()) <= 1;
    }

    public static void main(String[] args) {

        Product productOne = new Product("White bread", "WB-1");
        Product productTwo = new Product("White bread", "WB-11");
        Product productThree = new Product("Roll", "R-01");

        System.out.println(productOne.areTheyEqual(productTwo));
        System.out.println(productOne.areTheyEqual(productThree));
        System.out.println(productOne.areTheyEqualNamAndCode(productTwo));
        System.out.println(productOne.areTheyEqualNamAndCode(productThree));
    }
}
