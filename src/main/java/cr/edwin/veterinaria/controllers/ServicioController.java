package cr.edwin.veterinaria.controllers;
import cr.edwin.veterinaria.domain.Servicio;
import cr.edwin.veterinaria.service.ServicioService;
import cr.edwin.veterinaria.service.TipoServicioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@RequestMapping("/servicios")
public class ServicioController {
 private final ServicioService servicioService;
 private final TipoServicioService tipoService;
 public ServicioController(ServicioService servicioService, TipoServicioService tipoService){this.servicioService=servicioService;this.tipoService=tipoService;}
 @GetMapping public String listar(Model model){model.addAttribute("servicios",servicioService.listar()); return "servicios/listado";}
 @GetMapping("/nuevo") public String nuevo(Model model){model.addAttribute("servicio",new Servicio()); model.addAttribute("tipos",tipoService.listar()); return "servicios/formulario";}
 @GetMapping("/editar/{id}") public String editar(@PathVariable Integer id, Model model){
  model.addAttribute("servicio",servicioService.buscarPorId(id).orElseThrow()); model.addAttribute("tipos",tipoService.listar()); return "servicios/formulario";
 }
 @PostMapping("/guardar") public String guardar(@ModelAttribute Servicio servicio, @RequestParam Integer tipoId, RedirectAttributes flash){
  servicio.setTipoServicio(tipoService.buscarPorId(tipoId).orElseThrow()); servicioService.guardar(servicio);
  flash.addFlashAttribute("mensaje","Servicio guardado correctamente"); return "redirect:/servicios";
 }
 @PostMapping("/eliminar/{id}") public String eliminar(@PathVariable Integer id, RedirectAttributes flash){
  try {servicioService.eliminar(id); flash.addFlashAttribute("mensaje","Servicio eliminado correctamente");}
  catch(Exception ex){flash.addFlashAttribute("error","No se puede eliminar: hay citas asociadas.");}
  return "redirect:/servicios";
 }
}
