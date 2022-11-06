package org.example;

public abstract class MyScanner {
    Product current_scanned_product = null;
    public Product ScanProduct() {
        String name = ScanName();
        category_of_product category = ScanCategory();
        float[] dimensions = ScanDimensions();
        float weight = ScanWeight();
        current_scanned_product = new Product(name, category, dimensions, weight);
        return current_scanned_product;
    }
    protected boolean getIsPerishable() {
        boolean result = false;
        if(current_scanned_product.getCategory() == category_of_product.food) {
            result = true;
        }
        return result;
    }
    public String GetTypeOfStock() {
        String type = new String();
        if(current_scanned_product.getCategory() == null)
        {
            type = "send for additional definition";
        }
        else if(getIsPerishable()) {
            type = "stock for perishable products";
        }
        else {
            type = "stock for long-term storage products";
        }
        return type;
    }
    public String getPositionAtStock() {
        String position = new String();
        if(current_scanned_product.getWeight() >= 50)
        {
            position = "bottom shelf";
        }
        else if (current_scanned_product.getWeight() >= 10)
        {
            position = "middle shelf";
        }
        else if (current_scanned_product.getWeight() > 0){
            position = "high shelf";
        }
        else {
            position = "send for additional definition";
        }
        return position;
    }
    public abstract String ScanName();
    public abstract category_of_product ScanCategory();
    public abstract float[] ScanDimensions();
    public abstract float ScanWeight();
}