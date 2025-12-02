package controllers;

import models.Brand;

public class BrandController {

    public Brand[] sortSelectionDesc(Brand[] brands) {
        for (int i = 0; i < brands.length ; i++) {
            int minimoIndice = i;
            for (int j = i + 1; j < brands.length; j++) {
                if (brands[j].getTotalValidYears() > brands[minimoIndice].getTotalValidYears()) {
                    minimoIndice = j;
                }
            }
            if (minimoIndice != i) {
                Brand temp = brands[i];
                brands[i] = brands[minimoIndice];
                brands[minimoIndice] = temp;
            }
        }
        return brands;
    }
    public Brand binarySearchByValidYears(Brand[] brands,int validYears,boolean isAsendig){
        int bajo = 0;
        int alto = brands.length - 1;

        while (bajo <= alto) {
            int centro = bajo + (alto - bajo) / 2;
            int centroValidYears = brands[centro].getTotalValidYears();

            if (centroValidYears == validYears) {
                return brands[centro];
            }

            if (isAsendig) {
                if (centroValidYears < validYears) {
                    bajo = centro + 1;
                } else {
                    alto = centro - 1;
                }
            } else {
                if (centroValidYears > validYears) {
                    bajo = centro + 1;
                } else {
                    alto = centro - 1;
                }
            }
        }
        return null; 

    }
    
}
