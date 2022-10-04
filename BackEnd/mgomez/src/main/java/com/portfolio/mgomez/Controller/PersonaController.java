
package com.portfolio.mgomez.Controller;

import com.portfolio.mgomez.Entity.Persona;
import com.portfolio.mgomez.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mamag
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("persona/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("persona/crear")
    public String CreatPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Se ha creado una persona";
    }
    
    @DeleteMapping("persona/borrar")
    public String DeletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "Se ha borrado una persona";
    }
    @PutMapping("persona/editar")
    public Persona EditPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("imagen") String nuevoImagen){
        
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagen(nuevoImagen);
        
        ipersonaService.savePersona(persona);
        return persona;
    
    }
    
    @GetMapping("persona/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }                            
}
