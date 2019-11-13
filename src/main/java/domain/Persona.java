package domain;

public class Persona {

    private int legajo;
    private int dni;
    private String nombre;
    private String apellido;


    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }
}
