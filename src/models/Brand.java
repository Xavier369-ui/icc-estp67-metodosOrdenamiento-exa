package models;

import java.util.Arrays;

public class Brand {
    private Brand[] brands;
    private String name;
    private int years;

    public Brand(Brand[] brands, String name, int years) {
        this.brands = brands;
        this.name = name;
        this.years = years;
    }

    public Brand[] getBrands() {
        return brands;
    }

    public void setBrands(Brand[] brands) {
        this.brands = brands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    public int getTotalValidYears() {
        if()
    }

    @Override
    public String toString() {
        return "Brand [brands=" + Arrays.toString(brands) + ", name=" + name + ", years=" + years + "]";
    }
    

    
    
}
