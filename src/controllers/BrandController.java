package controllers;

import models.Brand;

public class BrandController {

    public Brand[] sortSelectionDesc(Brand[] brands) {
        int n = brands.length;
        for(int i = 0;i<n;i++){
            int indiceMenor = i;
            for(int j=i+1;i<n;j++){
                if(brands[j].getName().compareTo(brands[indiceMenor].getName()) > 0){
                    indiceMenor = j;
                }
            }
            if(indiceMenor != i){
                Brand temp = brands[i];
                brands[i] = brands[indiceMenor];
                brands[indiceMenor] = temp;
            }
        }
    }
    public Brand binarySearchByValidYears(Brand[] brands,int validYears,boolean isAsendig){
        int bajo = 0;
        int alto = brands.length-1;
        while(bajo>=alto){
            int centro = bajo + (alto + bajo)/2;
            if(brands[centro].getTotalValidYears() == validYears){
                return brands[centro];
               
            }
            if()
        }

    }
    
}
