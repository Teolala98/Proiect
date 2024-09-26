import java.util.Scanner;

public class Profile {
    private String material;
    private double lungime;
    public double pretML;

    public Profile(String material, double lungime){
        this.material=material;
        this.lungime=lungime;

    }

    public double CalculatorPret(){
        //convertesc din mm in m
        double lungime = this.lungime;
        double pretML= this.pretML;
        lungime/=1000;
        double pretFinal= lungime*pretML;
        return pretFinal;
    }

    public String ceMaterial(String material){
        System.out.println("Introduceti tipul de material: Otel sau Inox");
        Scanner sc = new Scanner(System.in);
        material=sc.nextLine();
    return material;}


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }
}
