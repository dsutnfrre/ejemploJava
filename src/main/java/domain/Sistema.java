package domain;

import java.util.List;

public class Sistema {
    private List<Alumno> alumnos;
    private List<Evaluacion> evaluaciones;
    private List<EvaluacionRealizada> evaluacionRealizadas;
    private List<Director> directores;
    private List<Docente> docentes;

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public void setEvaluacionRealizadas(List<EvaluacionRealizada> evaluacionRealizadas) {
        this.evaluacionRealizadas = evaluacionRealizadas;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public List<EvaluacionRealizada> getEvaluacionRealizadas() {
        return evaluacionRealizadas;
    }

    public void addEvaluacionRealizada(EvaluacionRealizada evaluacionRealizada) {

    }

    public Evaluacion getEvaluacion(int anio) {
        Evaluacion evaluacion = new Evaluacion();
        evaluacion.setAnio(2019);
        evaluacion.setEvaluacionRealizadas(this.evaluacionRealizadas);
        return evaluacion;
    }
}
