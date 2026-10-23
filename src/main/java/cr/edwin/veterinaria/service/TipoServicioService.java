package cr.edwin.veterinaria.service;
import cr.edwin.veterinaria.domain.TipoServicio;
import java.util.List;
import java.util.Optional;
public interface TipoServicioService {
 List<TipoServicio> listar();
 Optional<TipoServicio> buscarPorId(Integer id);
 TipoServicio guardar(TipoServicio objeto);
 void eliminar(Integer id);
}
