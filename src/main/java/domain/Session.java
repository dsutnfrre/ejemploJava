package domain;

import java.util.List;

public class Session {
    private Alumno alumno;
    private List<Opcion> opciones;

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }
}
