package cr.edwin.veterinaria.service;
import cr.edwin.veterinaria.domain.TipoServicio;
import cr.edwin.veterinaria.repository.TipoServicioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class TipoServicioServiceImpl implements TipoServicioService {
 private final TipoServicioRepository repo;
 public TipoServicioServiceImpl(TipoServicioRepository repo){this.repo=repo;}
 @Override public List<TipoServicio> listar(){return repo.findAll();}
 @Override public Optional<TipoServicio> buscarPorId(Integer id){return repo.findById(id);}
 @Override public TipoServicio guardar(TipoServicio objeto){return repo.save(objeto);}
 @Override public void eliminar(Integer id){repo.deleteById(id);}
}
