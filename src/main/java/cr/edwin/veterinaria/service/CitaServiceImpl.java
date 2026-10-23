package cr.edwin.veterinaria.service;
import cr.edwin.veterinaria.domain.Cita;
import cr.edwin.veterinaria.repository.CitaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CitaServiceImpl implements CitaService {
 private final CitaRepository repo;
 public CitaServiceImpl(CitaRepository repo){this.repo=repo;}
 @Override public List<Cita> listar(){return repo.findAll();}
}
