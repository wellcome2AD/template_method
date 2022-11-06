package org.example;
// тип товара, категория товара (продукты, хозтовары, техника и т.д на Ваш выбор), измеряют габариты и массу
enum category_of_product
{
    food, clothes, household_appliances, household_goods, furniture
}
public class Product {
    private String name_of_product = null;
    private category_of_product category = null;
    private float[] dimensions = new float[3];
    private float weight = 0;
    public Product() {};
    public Product(String _name_of_product, category_of_product _category, float[] _dimensions, float _weight) {
        name_of_product = _name_of_product;
        category = _category;
        for(int i=0; i<3; ++i)
        {
            dimensions[i] = _dimensions[i];
        }
        weight = _weight;
    }
    public category_of_product getCategory() {
        return category;
    }

    public float getWeight() {
        return weight;
    }

    public static category_of_product ConvertStringToCategory(String s){
        category_of_product result = null;
        if(s.equals("food"))
        {
            result = category_of_product.food;
        }
        else if(s.equals("clothes"))
        {
            result = category_of_product.clothes;
        }
        else if(s.equals("household_appliances"))
        {
            result = category_of_product.household_appliances;
        }
        else if(s.equals("household_goods"))
        {
            result = category_of_product.household_goods;
        }
        else if(s.equals("furniture"))
        {
            result = category_of_product.furniture;
        }
        return result;
    }
    public static String ConvertCategoryToString(category_of_product category){
        String result = new String();
        if(category == category_of_product.food)
        {
            result = "food";
        }
        else if(category == category_of_product.clothes)
        {
            result = "clothes";
        }
        else if(category == category_of_product.household_appliances)
        {
            result = "household_appliances";
        }
        else if(category == category_of_product.household_goods)
        {
            result = "household_goods";
        }
        else if(category == category_of_product.furniture)
        {
            result = "furniture";
        }
        return result;
    }
    @Override
    public String toString() {
        String result = "name: " + name_of_product;
        result += "\ncategory: " + ConvertCategoryToString(category);
        result += "\ndimensions: ";
        for(int i=0; i<3; ++i)
            result += dimensions[i] + " ";
        result += "\nweight: " + weight + "\n";
        return result;
    }
}
