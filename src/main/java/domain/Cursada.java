package domain;

public class Cursada {
    private int anio;
    private int nivel;
    private Docente docente;
    private Materia materia;

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getAnio() {
        return anio;
    }

    public int getNivel() {
        return nivel;
    }

    public Docente getDocente() {
        return docente;
    }

    public Materia getMateria() {
        return materia;
    }
}
