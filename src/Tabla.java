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
        this.greutate=0;
        this.pretKG=0;
        this.grosime=grosime;
    }


}
