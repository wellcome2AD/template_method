package org.example;

public class Main {
    public static void main(String[] args) {
        MyScanner scan = new ScannerOfProducts();
        Product product = scan.ScanProduct();
        System.out.println(product.toString());
        System.out.println("type of stock: " + scan.GetTypeOfStock());
        System.out.println("position at stock: " + scan.getPositionAtStock());
    }
}