public class TeavaPatrata extends Profile{
    private String suprafata;
    private String greutate;
    private double latura;
        private double grosime;


    public TeavaPatrata(String material, double lungime,  double pretML, double latura, double grosime) {
        super(material, lungime);
        this.grosime=grosime;
        this.latura=latura;
        this.pretML=pretML;

    }


}
