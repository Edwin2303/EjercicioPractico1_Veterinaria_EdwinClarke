package cr.edwin.veterinaria.service;
import cr.edwin.veterinaria.domain.Servicio;
import java.util.List;
import java.util.Optional;
public interface ServicioService {
 List<Servicio> listar();
 Optional<Servicio> buscarPorId(Integer id);
 Servicio guardar(Servicio objeto);
 void eliminar(Integer id);
}
