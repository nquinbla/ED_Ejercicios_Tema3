package F_Contraseña;
import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = "password";
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public boolean esFuerte() {
        int countUpper = 0, countLower = 0, countDigit = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) countUpper++;
            if (Character.isLowerCase(c)) countLower++;
            if (Character.isDigit(c)) countDigit++;
        }
        return countUpper > 2 && countLower > 1 && countDigit > 5;
    }

    private String generarPassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public String getContraseña() {return contraseña;}

    public int getLongitud() {return longitud;}

    public void setLongitud(int longitud) {this.longitud = longitud;}
}
