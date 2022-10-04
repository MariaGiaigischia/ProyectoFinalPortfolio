
package com.portfolio.mgomez.Security.Enums.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author mamag
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = )
    private int id;
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
}
