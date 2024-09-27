import java.util.Scanner;

public class Profile {
    private String material;
    private double lungime;
    public double pretML;
    private double pretFinal;

    public Profile(String material, double lungime){
        this.material=material;
        this.lungime=lungime;

    }
    public Profile(){}

    public double CalculatorPret(){

        System.out.println("Introduceti pretul pe metru liniar: ");
        //convertesc din mm in m
        Scanner sc = new Scanner(System.in);
        double lungime = this.lungime;
        double pretML= sc.nextDouble();
        lungime/=1000;
        double pretFinal= lungime*pretML;
        return this.pretFinal=pretFinal;
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
