package services;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import domain.Cursada;
import domain.Pregunta;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CursadaService {
    public static Cursada[] getCursada() {
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader("/home/manu/Projects/dsdb/cursada.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Cursada[] cursadas = gson.fromJson(reader, Cursada[].class);
        return cursadas;
    }
}
