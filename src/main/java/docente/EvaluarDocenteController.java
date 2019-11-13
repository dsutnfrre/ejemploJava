package docente;
import com.google.gson.Gson;
import domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import services.EvaluacionRealizadaService;
import services.PreguntaService;
import services.SessionService;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

@Controller
public class EvaluarDocenteController {
    @GetMapping("/opciones")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        SessionService sessionService = new SessionService();
        Session session = sessionService.getAlumnoAutenticado();
        model.addAttribute("alumno", session.getAlumno());
        model.addAttribute("opciones", session.getOpciones());
        return "opciones";
    }

    @GetMapping("/evaluacionesPendientes")
    public String evaluacionesPendientes(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        SessionService sessionService = new SessionService();
        Session session = sessionService.getAlumnoAutenticado();
        model.addAttribute("cursadas", session.getAlumno().getCursadasSinEvaluacion(2019));
        return "evaluacionesPendientes";
    }

    @GetMapping("/evaluacion")
    public String evaluacion(@RequestParam(name="docente", required=false, defaultValue="") String docente,
                             @RequestParam(name="cursada", required=false, defaultValue="") String cursada,
                             @RequestParam(name="materia", required=false, defaultValue="") String materia,
                             Model model) {
        Sistema sistema = new Sistema();
        Evaluacion evaluacion = sistema.getEvaluacion(2019);
        evaluacion.setAnio(2019);
        evaluacion.setPreguntas(Arrays.asList(PreguntaService.getAlumnoAutenticado()));
        model.addAttribute( "evaluacionRealizada", evaluacion);
        model.addAttribute( "cursada", cursada);
        model.addAttribute( "docente", docente);
        model.addAttribute( "materia", materia);

        return "evaluacion";
    }

    @PostMapping(value = "save")
    public String submitForm(@ModelAttribute("respuestaForm") RespuestaForm evaluacion, BindingResult result, Model model) {
        Gson gson = new Gson();
        EvaluacionRealizada nuevaEvaluacionRealizada = new EvaluacionRealizada();
        SessionService sessionService = new SessionService();
        Session session = sessionService.getAlumnoAutenticado();
        for (int i = 0; i < evaluacion.getRespuestas().size(); i++) {
            Respuesta respuesta = new Respuesta();
            respuesta.setDescripRta(evaluacion.getRespuestas().get(i));
            nuevaEvaluacionRealizada.nuevaRta(respuesta);
        }
        nuevaEvaluacionRealizada.setFechaHora(new Date(), new Time(2019));
        nuevaEvaluacionRealizada.setAlumno(session.getAlumno());
        nuevaEvaluacionRealizada.setDocente(evaluacion.getDocenteFromDB());
        nuevaEvaluacionRealizada.setCursada(evaluacion.getCursadaFromDB());
        EvaluacionRealizadaService.save(nuevaEvaluacionRealizada);
        model.addAttribute( "nuevaEvaluacionRealizada", nuevaEvaluacionRealizada);
        return "confirmacion";
    }

    @GetMapping("/confirmacion")
    public String confirmacion(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "confirmacion";
    }
}
