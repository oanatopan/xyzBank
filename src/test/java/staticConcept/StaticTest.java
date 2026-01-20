package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {

    // avem cerinta sa prezentam toti elevii de la clasa Liviu Rebreanu
    //static este un keyword pe care il folosim in scopul de a salva o valoare default pentru o variabila definita
    // daca definim acest lucru salvam spatiu in memorie si toate obiectele pe care le folosim vor folosi aceeasi valoare

    @Test
    public void testMethod() {


        Elev oana = new Elev("Elev1", "Elev1", 10);
        Elev cristina = new Elev("Elev2", "Elev2", 12);
        Elev marius = new Elev("Elev3", "Elev3", 13);
        Elev ioan = new Elev("Elev4", "Elev4", 9);
        Elev alex = new Elev("Elev5", "Elev5", 11);


        oana.prezentareElev();
        System.out.println();

        cristina.prezentareElev();
        System.out.println();

        marius.prezentareElev();
        System.out.println();

        ioan.prezentareElev();
        System.out.println();

        alex.prezentareElev();
        System.out.println();

        oana.calculEcuson();
        Elev.infoElev();
    }

}
