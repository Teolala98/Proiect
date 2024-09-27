import java.util.Objects;
import java.util.Scanner;

public class Tabla {
    private String material;
    private double latime;
    private double lungime;
    private double greutate;
    public double pretKG;
    private double grosime;
    private double suprafata;
    private double pretFoaie;

    public Tabla(String material, double latime, double lungime, double grosime, double pretKG){
        this.material=material;
        this.latime=latime;
        this.lungime=lungime;
        this.pretKG=pretKG;
        this.grosime=grosime;
    }

    public Tabla(){}

    public double calcSuprafata(){
        return suprafata=latime*lungime*2/1000000;
    }

    public String ceMaterial(String material){
        System.out.println("Introduceti tipul de material: Otel sau Inox");
        Scanner sc = new Scanner(System.in);
        material=sc.nextLine();
        return material;}

    public double calcGreutate(){
        String materialul= ceMaterial(material);
        double lungimea = lungime;

        if(Objects.equals(materialul, "Otel")){

            this.greutate = DensitateMateriale.densitateOtel*(lungimea*latime*grosime)/1000000;

        }
        else if (Objects.equals(materialul, "Inox")){
            this.greutate = DensitateMateriale.densitateInox*(lungimea*latime*grosime)/1000000;

        }
        return greutate;
    }
    public void setPretKG(double pretKG) {
        this.pretKG = pretKG;
    }

    public double cePret(){
        System.out.println("Introduceti pretul pe kg");
        Scanner sc = new Scanner(System.in);
        double pret = sc.nextDouble();
        setPretKG(pret);
        return pret;
    }

    public double CalculatorPret(){
        //convertesc din mm in m
        double greutate = this.greutate;
        double pretKg= cePret();

        return this.pretFoaie=greutate*pretKg;
    }

    public void introducereDate(){
        System.out.println("Introduceti lungimea: ");
        Scanner sc1  = new Scanner(System.in);
        lungime = sc1.nextDouble();

        System.out.println("Introduceti latimea: ");
        latime = sc1.nextDouble();

        System.out.println("Introduceti grosimea: ");
        grosime = sc1.nextDouble();

        System.out.println("Greutatea este de "+calcGreutate()+" kg");
        System.out.println("Suprafata este de "+calcSuprafata()+" mp");
        System.out.println("Pretul este de " + CalculatorPret()+" lei");
    }


    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public void setGrosime(double grosime) {
        this.grosime = grosime;
    }
}
