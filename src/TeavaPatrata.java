import java.util.Objects;

public class TeavaPatrata extends Profile{
    private double suprafata;
    private double greutate;
    private double latura;
        private double grosime;


    public TeavaPatrata(String material, double lungime,  double pretML, double latura, double grosime) {
        super(material, lungime);
        this.grosime=grosime;
        this.latura=latura;
        this.pretML=pretML;

    }
    public double calcGreutate(){
        String materialul= ceMaterial(getMaterial());
        double lungimea = getLungime();
        double volumTotal=latura*latura*lungimea;
        double volumInterior = (latura-2*grosime)*(latura-2*grosime)*lungimea;
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
        this.suprafata=(4*latura)*lungimea/10000;
        return this.suprafata;
    }

}
