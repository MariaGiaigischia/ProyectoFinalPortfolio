
package com.portfolio.mgomez.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mamag
 */
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @NotNull
    @Size(min = 1, max = 50, message= "longitud fuera de rango" )
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message= "longitud fuera de rango" )
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message= "longitud fuera de rango" )
    private String imagen;
}
