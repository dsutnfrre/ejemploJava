package domain;

import services.CursadaService;

import java.util.Arrays;
import java.util.List;

public class RespuestaForm {
    List<String>  respuestas;
    int docente;
    int cursada;
    String materia;
    List<Cursada> cursadas = Arrays.asList(CursadaService.getCursada());
    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

    public void setDocente(int docente) {
        this.docente = docente;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCursada(int cursada) {
        this.cursada = cursada;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public int getCursada() {
        return cursada;
    }

    public int getDocente() {
        return docente;
    }

    public String getMateria() {
        return materia;
    }

    public Docente getDocenteFromDB() {
        for (int i = 0; i < cursadas.size(); i++) {
            Cursada cursada1 = cursadas.get(i);
            if(cursada1.getAnio() == this.cursada && cursada1.getDocente().getLegajo() == this.docente && cursada1.getMateria().getNombre().equalsIgnoreCase(this.materia)){
                return cursada1.getDocente();
            }
        }
        return new Docente();
    }

    public Materia getMateriaFromDB() {
        return new Materia("","");
    }

    public Cursada getCursadaFromDB(){
        for (int i = 0; i < cursadas.size(); i++) {
            Cursada cursada1 = cursadas.get(i);
            if(cursada1.getAnio() == this.cursada && cursada1.getDocente().getLegajo() == this.docente && cursada1.getMateria().getNombre().equalsIgnoreCase(this.materia)){
                return cursada1;
            }
        }
        return new Cursada();
    }


}
