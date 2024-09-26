import java.util.Objects;

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



}
