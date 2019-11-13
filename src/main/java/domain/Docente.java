package domain;

import java.util.Date;

public class Docente extends Persona {
    private Date anioIngreso;
    private String cargo;

    public void setAnioIngreso(Date anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getAnioIngreso() {
        return anioIngreso;
    }

    public String getCargo() {
        return cargo;
    }
}
