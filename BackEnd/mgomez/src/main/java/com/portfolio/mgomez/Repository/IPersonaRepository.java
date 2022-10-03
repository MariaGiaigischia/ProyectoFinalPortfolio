
package com.portfolio.mgomez.Repository;

import com.portfolio.mgomez.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mamag
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
