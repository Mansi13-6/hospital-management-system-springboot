package hospital.controller;

import hospital.entity.Patient;
import hospital.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public Patient addPatient(
            @RequestBody Patient patient) {
        return service.save(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }
}