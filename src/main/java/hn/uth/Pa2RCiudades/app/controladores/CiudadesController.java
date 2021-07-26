/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.Pa2RCiudades.app.controladores;

import hn.uth.Pa2RCiudades.app.modelos.Ciudades;
import hn.uth.Pa2RCiudades.app.servicios.CiudadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author linda
 */
@Controller
public class CiudadesController {
    

    @Autowired
    private CiudadesService servicio;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("lista", servicio.getLista());
        return "index";
    }
    
    @GetMapping("/crear")
    public String abrirFormularioCrearCiudades(Model model){
        model.addAttribute("ciudades", new Ciudades());
        return "ciudadesFormulario";
    }
    
    @GetMapping("/actualizar/{id}")
    public String abrirFormularioActualizarCiudades(@PathVariable Long id,Model model){
        model.addAttribute("ciudades", servicio.getEntidad(id));
        return "ciudadesFormulario";
    }
    
    @PostMapping("/guardarFormulario")
    public String guardarFormularioCiudades(Ciudades ciudades,Model model){
        servicio.guardar(ciudades);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarCiudades(@PathVariable Long id,Model model){
        servicio.eliminar(id);
        return "redirect:/";
    }
    
}
