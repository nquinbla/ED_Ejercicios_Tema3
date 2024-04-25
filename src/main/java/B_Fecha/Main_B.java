package B_Fecha;

public class Main_B {
    public static void main(String[] args) {

        Fecha fecha = new Fecha(20, 10, 2018);

        fecha.setAño(2018); // si no pongo aqui esto no se cambia el año :(

        System.out.println(fecha);

        fecha.setAño(2019); // cambiamos el año

        System.out.println(fecha);
    }
}
