
package com.portfolio.mgomez.Service;

import com.portfolio.mgomez.Entity.Persona;
import com.portfolio.mgomez.Interface.IPersonaService;
import com.portfolio.mgomez.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mamag
 */
@Service
public class ImPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;
            
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona= ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
