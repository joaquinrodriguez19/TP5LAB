package principal;

import java.util.Objects;

public class Contacto {

    private final int dni;
    private final String nombre;
    private final String apellido;
    private final String ciudad;
    private final String direccion;

    public Contacto(int dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return dni + " - " + apellido + ", " + nombre + " (" + ciudad + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contacto)) {
            return false;
        }
        Contacto that = (Contacto) o;
        return dni == that.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
