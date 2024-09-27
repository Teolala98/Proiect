import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tabla tabla = new Tabla();
        TeavaRectangulara teavaRectangulara = new TeavaRectangulara();
        TeavaPatrata teavaPatrata = new TeavaPatrata();
        Platbanda platbanda = new Platbanda();

        System.out.println("Dupa ce ati terminat de calculat scrieti end");
        System.out.println("Doriti sa incepeti programul? ");

        Scanner scEnd = new Scanner(System.in);
        String end = scEnd.nextLine();

        while(!Objects.equals(end, "end")){
        System.out.println("Ce tip de material este necesar pentru lucrare?");
        System.out.println("1. Tabla ");
        System.out.println("2. Teava Rectangulara");
        System.out.println("3. Teava Patrata");
        System.out.println("4. Platbanda");



        Scanner sc  = new Scanner(System.in);
        int tip = sc.nextInt();

        switch(tip) {
            case 1:
                tabla.introducereDate();
                break;
            case 2:
                teavaRectangulara.introducereDate();
                break;
            case 3:
                teavaPatrata.introducereDate();

            case 4:
                platbanda.introducereDate();

            default:
                // code block
        }

    }
    }

}