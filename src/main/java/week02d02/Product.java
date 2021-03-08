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

    public boolean areTheyEqualNamel(Product product) {
        return name.equals(product.getName());
    }

    public boolean areTheyEqualNameAndCode(Product product) {
        return name.equals(product.getName()) && Math.abs(code.length() - product.code.length()) <= 1;
    }

    public static void main(String[] args) {

        Product productOne = new Product("White bread", "WB-1");
        Product productTwo = new Product("White bread", "WB-11");
        Product productThree = new Product("Roll", "R-01");

        System.out.println(productOne.areTheyEqualNamel(productTwo));
        System.out.println(productOne.areTheyEqualNamel(productThree));
        System.out.println(productOne.areTheyEqualNameAndCode(productTwo));
        System.out.println(productOne.areTheyEqualNameAndCode(productThree));
    }
}
