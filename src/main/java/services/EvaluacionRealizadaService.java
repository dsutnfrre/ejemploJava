package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import domain.EvaluacionRealizada;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public class EvaluacionRealizadaService {
    public static void save(EvaluacionRealizada evaluacionRealizada) {
        try {
            Writer writer = new FileWriter("/home/manu/Projects/dsdb/" + new Date().toString() + ".json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(evaluacionRealizada, writer);
            writer.flush(); //flush data to file   <---
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
