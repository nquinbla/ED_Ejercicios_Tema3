package L_FechaPT2;

public class Fecha2 {
    private int dia;
    private int mes;
    private int año;

    public Fecha2(int dia, int mes, int año) {
        if (!esFechaValida(dia, mes, año)) {
            throw new IllegalArgumentException("Fecha no válida");
        }
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (!esFechaValida(dia, this.mes, this.año)) {
            throw new IllegalArgumentException("Fecha no válida");
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (!esFechaValida(this.dia, mes, this.año)) {
            throw new IllegalArgumentException("Fecha no válida");
        }
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (!esFechaValida(this.dia, this.mes, año)) {
            throw new IllegalArgumentException("Fecha no válida");
        }
        this.año = año;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    private boolean esFechaValida(int dia, int mes, int año) {
        if (año < 0) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasEnMes(mes)) {
            return false;
        }
        return true;
    }

    private int diasEnMes(int mes) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;  // No se tiene en cuenta el año bisiesto
            default:
                return 31;
        }
    }
}
