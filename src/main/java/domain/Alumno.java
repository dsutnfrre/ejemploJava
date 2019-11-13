package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alumno extends Persona{

    private Date fechaIngreso;
    private List<Cursada> cursadas;
    private List<EvaluacionRealizada> evaluacionRealizadas = new ArrayList<EvaluacionRealizada>();

    public void setCursadas(List<Cursada> cursadas) {
        this.cursadas = cursadas;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setEvaluacionRealizadas(List<EvaluacionRealizada> evaluacionRealizadas) {
        this.evaluacionRealizadas = evaluacionRealizadas;
    }

    public List<Cursada> getCursadas() {
        return cursadas;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public List<EvaluacionRealizada> getEvaluacionRealizadas() {
        return evaluacionRealizadas;
    }

    public List<Cursada> getCursadasSinEvaluacion(int anio){
        List<Cursada> lcevPend = new ArrayList<Cursada>();
        for (int i = 0; i < this.getCursadas().size(); i++) {
            if(!this.estaEvalRealizada(this.getEvaluacionRealizadas(), this.getCursadas().get(i))){
                lcevPend.add(this.getCursadas().get(i));
            }
        }
        return lcevPend;
    }

    public boolean estaEvalRealizada(List<EvaluacionRealizada> evaluacionRealizadas, Cursada cursada){
        boolean estaRealizada = false;
        for (int i = 0; i < evaluacionRealizadas.size(); i++) {
            EvaluacionRealizada evaluacionRealizada = evaluacionRealizadas.get(i);
            Cursada cursadaEvaluada = evaluacionRealizada.getCursada();
            if(cursada.getAnio() == cursadaEvaluada.getAnio() && cursada.getMateria().getNombre() == cursada.getMateria().getNombre()) {
                estaRealizada = true;
                break;
            }
        }
        return estaRealizada;
    }
}
