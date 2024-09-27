import java.util.Objects;
import java.util.Scanner;

public class TeavaRectangulara extends Profile{
    private double suprafata;
    private double greutate;
    private double latura1;
    private double latura2;
    private double grosime;


    public TeavaRectangulara(String material, double lungime,  double pretML, double latura1, double latura2, double grosime) {
        super(material, lungime);
        this.grosime=grosime;
        this.latura1=latura1;
        this.latura2=latura2;
        this.pretML=pretML;

    }

    public TeavaRectangulara(){}

    public void introducereDate(){
        System.out.println("Introduceti lungimea: ");
        Scanner sc2  = new Scanner(System.in);
        setLungime(sc2.nextDouble());

        System.out.println("Introduceti latura scurta: ");
        latura1=sc2.nextDouble();

        System.out.println("Introduceti latura lunga: ");
        latura2=sc2.nextDouble();

        System.out.println("Introduceti grosimea: ");
        grosime=sc2.nextDouble();

        System.out.println("Greutatea este de "+calcGreutate()+" kg");
        System.out.println("Suprafata este de "+calcSuprafata()+" mp");
        System.out.println("Pretul este de " + CalculatorPret()+" lei");
    }

    public double calcGreutate(){
         String materialul= ceMaterial(getMaterial());
         double lungimea = getLungime();
        double volumTotal=latura1*latura2*lungimea;
        double volumInterior = (latura1-2*grosime)*(latura2-2*grosime)*lungimea;
        if(Objects.equals(materialul, "Otel")){

           this.greutate = DensitateMateriale.densitateOtel*(volumTotal-volumInterior)/1000000;

        }
        else if (Objects.equals(materialul, "Inox")){
            this.greutate = DensitateMateriale.densitateInox*(volumTotal-volumInterior)/1000000;

        }
        return greutate;

    }

    public double calcSuprafata(){
        double lungimea = getLungime();
        this.suprafata=(2*latura1+2*latura2)*lungimea/10000;
        return this.suprafata;
    }


    public void setGrosime(double grosime) {
        this.grosime = grosime;
    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
    }
}
