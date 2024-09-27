import java.util.Objects;
import java.util.Scanner;

public class Platbanda extends Profile{
    private double suprafata;
    private double greutate;
    private double latura;
    private double grosime;

    public Platbanda(String material, double lungime,  double pretML, double latura, double grosime) {
        super(material, lungime);
        this.grosime=grosime;
        this.latura=latura;
        this.pretML=pretML;

    }

    public Platbanda(){}

    public void introducereDate(){
        System.out.println("Introduceti lungimea: ");
        Scanner sc4  = new Scanner(System.in);
        setLungime(sc4.nextDouble());

        System.out.println("Introduceti latura scurta: ");
        latura=(sc4.nextDouble());


        System.out.println("Introduceti grosimea: ");
        grosime=(sc4.nextDouble());

        System.out.println("Greutatea este de "+calcGreutate()+" kg");
        System.out.println("Suprafata este de "+calcSuprafata()+" mp");
        System.out.println("Pretul este de " + CalculatorPret()+" lei");
    }

    public double calcGreutate(){
        String materialul= ceMaterial(getMaterial());
        double lungimea = getLungime();

        if(Objects.equals(materialul, "Otel")){

            this.greutate = DensitateMateriale.densitateOtel*(latura*grosime*lungimea)/1000000;

        }
        else if (Objects.equals(materialul, "Inox")){
            this.greutate = DensitateMateriale.densitateInox*(latura*grosime*lungimea)/1000000;

        }
        return greutate;

    }

    public double calcSuprafata(){
        double lungimea = getLungime();
        this.suprafata=(2*grosime+2*latura)*lungimea/10000;
        return this.suprafata;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public void setGrosime(double grosime) {
        this.grosime = grosime;
    }
}
