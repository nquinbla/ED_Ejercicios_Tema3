package L_FechaPT2;

public class Main_L {
    public static void main(String[] args) {
        try {
            Fecha2 fecha = new Fecha2(31, 2, 2015);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Fecha2 fecha = new Fecha2(1, 1, 2022);
            fecha.setDia(35);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}