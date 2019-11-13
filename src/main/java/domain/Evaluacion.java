package domain;

import services.PreguntaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evaluacion {
    private int anio;
    private List<Pregunta> preguntas = new ArrayList<Pregunta>();
    private List<EvaluacionRealizada> evaluacionRealizadas = new ArrayList<EvaluacionRealizada>();

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEvaluacionRealizadas(List<EvaluacionRealizada> evaluacionRealizadas) {
        this.evaluacionRealizadas = evaluacionRealizadas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public int getAnio() {
        return anio;
    }

    public List<EvaluacionRealizada> getEvaluacionRealizadas() {
        return evaluacionRealizadas;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void buscarPyREval(int idEncuesta) {

    }

}
