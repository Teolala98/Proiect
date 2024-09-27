//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* TeavaRectangulara teavaRectangulara= new TeavaRectangulara("Otel",2000,12.5,30,20,3);
        System.out.println(teavaRectangulara.calcGreutate());
        System.out.println(teavaRectangulara.CalculatorPret());
        System.out.println(teavaRectangulara.calcSuprafata());*/

        Tabla tabla = new Tabla("Otel",1000,2000,3,4.5);
        System.out.println(tabla.calcGreutate());
        System.out.println(tabla.calcSuprafata());
    }

}