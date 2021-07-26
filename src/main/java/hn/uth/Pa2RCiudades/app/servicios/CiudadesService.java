/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.Pa2RCiudades.app.servicios;

import hn.uth.Pa2RCiudades.app.modelos.Ciudades;
import hn.uth.Pa2RCiudades.app.repositorios.CiudadesRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author linda
 */
@Service
public class CiudadesService {
    
@Autowired
    private CiudadesRepositorio repositorio;
    
    public void guardar(Ciudades ciudades){
        repositorio.save(ciudades);
    }
    
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    public Optional<Ciudades> getEntidad(Long id){
        return repositorio.findById(id);
    }
    
    public List<Ciudades> getLista(){
        return (List<Ciudades>) repositorio.findAll();
    }
    
}

