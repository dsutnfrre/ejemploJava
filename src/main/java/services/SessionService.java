package services;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import domain.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SessionService {
    public Session getAlumnoAutenticado() {
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader("/home/manu/Projects/dsdb/session.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Session session = gson.fromJson(reader, Session.class);
        return session;
    }
}

