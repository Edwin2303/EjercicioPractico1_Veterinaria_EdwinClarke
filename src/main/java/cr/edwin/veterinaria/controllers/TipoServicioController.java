package cr.edwin.veterinaria.controllers;
import cr.edwin.veterinaria.domain.TipoServicio;
import cr.edwin.veterinaria.service.TipoServicioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@RequestMapping("/tipos")
public class TipoServicioController {
 private final TipoServicioService service;
 public TipoServicioController(TipoServicioService service){this.service=service;}
 @GetMapping public String listar(Model model){model.addAttribute("tipos",service.listar()); return "tipos/listado";}
 @GetMapping("/nuevo") public String nuevo(Model model){model.addAttribute("tipo",new TipoServicio()); return "tipos/formulario";}
 @GetMapping("/editar/{id}") public String editar(@PathVariable Integer id, Model model){
  TipoServicio tipo=service.buscarPorId(id).orElseThrow(); model.addAttribute("tipo",tipo); return "tipos/formulario";
 }
 @PostMapping("/guardar") public String guardar(@ModelAttribute TipoServicio tipo, RedirectAttributes flash){
  service.guardar(tipo); flash.addFlashAttribute("mensaje","Tipo de servicio guardado correctamente"); return "redirect:/tipos";
 }
 @PostMapping("/eliminar/{id}") public String eliminar(@PathVariable Integer id, RedirectAttributes flash){
  try {service.eliminar(id); flash.addFlashAttribute("mensaje","Tipo eliminado correctamente");}
  catch(Exception ex){flash.addFlashAttribute("error","No se puede eliminar: el tipo tiene servicios asociados.");}
  return "redirect:/tipos";
 }
}
