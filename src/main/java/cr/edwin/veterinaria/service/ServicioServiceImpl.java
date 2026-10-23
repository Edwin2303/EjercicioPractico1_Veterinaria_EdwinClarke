package cr.edwin.veterinaria.service;
import cr.edwin.veterinaria.domain.Servicio;
import cr.edwin.veterinaria.repository.ServicioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ServicioServiceImpl implements ServicioService {
 private final ServicioRepository repo;
 public ServicioServiceImpl(ServicioRepository repo){this.repo=repo;}
 @Override public List<Servicio> listar(){return repo.findAll();}
 @Override public Optional<Servicio> buscarPorId(Integer id){return repo.findById(id);}
 @Override public Servicio guardar(Servicio objeto){return repo.save(objeto);}
 @Override public void eliminar(Integer id){repo.deleteById(id);}
}
