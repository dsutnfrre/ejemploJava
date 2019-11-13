package domain;

import java.util.Date;

public class Director extends Persona {
    private Date fechaInicio;

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
}
