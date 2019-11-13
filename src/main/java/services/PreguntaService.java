package services;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import domain.Pregunta;
import domain.Session;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class PreguntaService {
    public static Pregunta[] getAlumnoAutenticado() {
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader("/home/manu/Projects/dsdb/preguntas.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Pregunta[] preguntas = gson.fromJson(reader, Pregunta[].class);
        return preguntas;
    }
}
