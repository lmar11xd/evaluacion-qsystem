package model;

public class Persona {
    private String dni;
    private String appPaterno;
    private String appMaterno;

    public Persona() {
    }

    public Persona(String dni, String appPaterno, String appMaterno) {
        this.dni = dni;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    @Override
    public String toString() {
        return "DNI: " + this.dni + ", Apellido Paterno: " + this.appPaterno + ", Apellido Materno: " + this.appMaterno;
    }
}
