package domain;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    private String descripPgta;
    private List<Respuesta> respuestas = new ArrayList<Respuesta>();

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public void setDescripPgta(String descripPgta) {
        this.descripPgta = descripPgta;
    }

    public String getDescripPgta() {
        return descripPgta;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }
}
