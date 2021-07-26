/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.Pa2RCiudades.app.repositorios;

import hn.uth.Pa2RCiudades.app.modelos.Ciudades;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author linda
 */
public interface CiudadesRepositorio  extends CrudRepository<Ciudades, Long>  {
    
}
