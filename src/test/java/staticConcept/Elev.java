package staticConcept;

public class Elev {
    // avem cerinta sa prezentam toti elevii de la clasa Liviu Rebreanu

    public String nume;
    public String prenume;
    public String varsta;
    public static String scoala= "Liviu Rebreanu";
    public static int indexEcuson=0;

    public Elev(String prenume, String nume, String varsta) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta = varsta;

    }

    public void prezentareElev() {
        System.out.println("Numele elevului este " + nume);
        System.out.println("Prenumele elevului este " + prenume);
        System.out.println("Varsta elevului este " + varsta);
        System.out.println("Scoala elevului este" + scoala);


    }

    public void calculEcuson() {
        System.out.println("Nr de elevi cu ecuson este " + indexEcuson);


    }

    public static void infoElev (){
        System.out.println("Salut Alex");

    }
}
