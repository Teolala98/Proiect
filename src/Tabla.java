import java.util.Objects;

public class Tabla {
    private String material;
    private double latime;
    private double lungime;
    private double greutate;
    public double pretKG;
    private double grosime;
    private double suprafata;

    public Tabla(String material, double latime, double lungime, double grosime, double pretKG){
        this.material=material;
        this.latime=latime;
        this.lungime=lungime;
        this.pretKG=pretKG;
        this.grosime=grosime;
    }
    public double calcSuprafata(){
        return suprafata=latime*lungime*2/1000000;
    }

    public double calcGreutate(){
        String materialul= material;
        double lungimea = lungime;

        if(Objects.equals(materialul, "Otel")){

            this.greutate = DensitateMateriale.densitateOtel*(lungimea*latime*grosime)/1000000;

        }
        else if (Objects.equals(materialul, "Inox")){
            this.greutate = DensitateMateriale.densitateInox*(lungimea*latime*grosime)/1000000;

        }
        return greutate;
    }

}
