package org.example;
import java.util.Scanner;

public class ScannerOfProducts extends MyScanner{
    @Override
    public String ScanName() {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Input name of the product: ");
        s = sc.nextLine();
        return s;
    }
    @Override
    public category_of_product ScanCategory() {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Input category of the product: ");
        s = sc.nextLine();
        category_of_product category = Product.ConvertStringToCategory(s);
        return category;
    }
    @Override
    public float[] ScanDimensions() {
        Scanner sc = new Scanner(System.in);
        float[] dimensions = new float[3];
        System.out.println("Input 3 dimensions of the product in sm: ");
        for(int i =0; i <3; ++i) {
            dimensions[i] = sc.nextFloat();
        }
        return dimensions;
    }
    @Override
    public float ScanWeight() {
        Scanner sc = new Scanner(System.in);
        float weight = 0;
        System.out.println("Input weight of the product in kg: ");
        weight = sc.nextFloat();
        return weight;
    }
}
