package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author 54266
 */
class Directorio {

    private static TreeMap<Long, Contacto> directorio;

    public Directorio() {
        this.directorio = new TreeMap<>();
    }
    

    public void agregarContacto(long l, Contacto contacto) {
        directorio.put(l, contacto);
    }

    public Contacto buscarContacto(long l) {
        return directorio.get(l);
    }

    public void borrarContacto(long l) {
        directorio.remove(l);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new HashSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> lista = new ArrayList<>();
        for (Contacto c : directorio.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                lista.add(c);
            }
        }
        return lista;
    }

}
