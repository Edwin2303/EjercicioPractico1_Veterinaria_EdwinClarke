package cr.edwin.veterinaria.controllers;
import cr.edwin.veterinaria.service.CitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/citas")
public class CitaController {
 private final CitaService service;
 public CitaController(CitaService service){this.service=service;}
 @GetMapping public String listar(Model model){model.addAttribute("citas",service.listar()); return "citas/listado";}
}
