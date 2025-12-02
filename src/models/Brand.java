package models;



public class Brand {
    private String brandName;
    private CarModel[] carModels;

    public Brand(String brandName, CarModel[] carModels) {
        this.brandName = brandName;
        this.carModels = carModels;
    }

    public String getBrandName() {
        return brandName;
    }

    public CarModel[] getCarModels() {
        return carModels;
    }

    public void setCarModels(CarModel[] carModels) {
        this.carModels = carModels;
    }

    
    public int getTotalValidYears() {
        int total = 0;

        for (CarModel model : carModels) {
            for (CarYear year : model.getYears()) {
                if (year.isValid()) {
                    total++;
                }
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return brandName + " - Años válidos: " + getTotalValidYears();
    }
    

    
    

    

    
    
   
    

    
    
}
