/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.Pa2RCiudades.app.controladores;

import hn.uth.Pa2RCiudades.app.modelos.Ciudades;
import hn.uth.Pa2RCiudades.app.servicios.CiudadesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author linda
 */
@RestController
@RequestMapping("/ws/ciudades/")
public class CiudadesRestController {
    @Autowired
    private CiudadesService servicio;
    
    @GetMapping("/")
    public List<Ciudades> getListaCiudades(){
        return servicio.getLista();
    }
    
    @GetMapping("/{id}")
    public Optional<Ciudades> getCiudadesById(@PathVariable Long id){
        return servicio.getEntidad(id);
    }
    
    @PostMapping("/guardar")
    public String guardar(@RequestBody Ciudades ciudades){
        servicio.guardar(ciudades);
        return "elemento guardado";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return "elemento eliminado";
    }
}
