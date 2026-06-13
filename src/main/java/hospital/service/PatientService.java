package hospital.service;

import hospital.entity.Patient;
import hospital.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Patient save(Patient patient) {
        return repository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }
}