package cr.edwin.veterinaria.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class InicioController {
 @GetMapping("/") public String inicio(){return "inicio";}
 @PostMapping("/contacto") public String contacto(@RequestParam String nombre, @RequestParam String correo,
  @RequestParam String mascota, @RequestParam String mensaje, RedirectAttributes flash){
  flash.addFlashAttribute("agradecimiento","Gracias "+nombre+". Recibimos su consulta sobre "+mascota+".");
  return "redirect:/#contacto";
 }
}
