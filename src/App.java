import controllers.BrandController;
import models.Brand;
import test.TestData;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");
        BrandController controller = new BrandController();

    
        Brand[] brands = TestData.createBrands();

    
        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " - Años válidos: " + b.getTotalValidYears());
        }

        System.out.println(" Desendente");
        controller.sortSelectionDesc(brands);

        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " - Años válidos: " + b.getTotalValidYears());
        }
       
        Brand found1 = controller.binarySearchByValidYears(brands, 8, false);
        if (found1 != null) {
            System.out.println("Encontrada: " + found1.getBrandName() +
                               " - Años válidos: " + found1.getTotalValidYears());
        } else {
            System.out.println("No encontrada");
        }

        Brand found2 = controller.binarySearchByValidYears(brands, 10, false);
        if (found2 != null);
        


    }

}
