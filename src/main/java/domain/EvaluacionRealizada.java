package domain;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluacionRealizada {
    private Date fecha;
    private Time hora;
    private Docente docente;
    private Alumno alumno;
    private Cursada cursada;
    private List<Respuesta> respuestas = new ArrayList<Respuesta>();

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setCursada(Cursada cursada) {
        this.cursada = cursada;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Docente getDocente() {
        return docente;
    }

    public Cursada getCursada() {
        return cursada;
    }

    public void setFechaHora(Date fecha, Time hora) {
        this.setFecha(fecha);
        this.setHora(hora);
    }

    public boolean verificarCompletitud() {
        return false;
    }

    public void nuevaRta(Respuesta respuesta){
        this.respuestas.add(respuesta);
    }

}
