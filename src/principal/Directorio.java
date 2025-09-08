package principal;

import java.util.*;

public class Directorio {

    private final TreeMap<Long, Contacto> agenda = new TreeMap<>();
    private final TreeSet<String> ciudades = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    public boolean agregarContacto(long telefono, Contacto contacto) {
        if (agenda.containsKey(telefono)) {
            return false;
        }
        agenda.put(telefono, contacto);
        if (contacto.getCiudad() != null && !contacto.getCiudad().isEmpty()) {
            ciudades.add(contacto.getCiudad());
        }
        return true;
    }

    public Contacto buscarContacto(long telefono) {
        return agenda.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new HashSet<>();
        if (apellido == null) {
            return telefonos;
        }

        for (Iterator<Map.Entry<Long, Contacto>> it = agenda.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Long, Contacto> e = it.next();
            Contacto c = e.getValue();
            if (c != null && c.getApellido() != null
                    && c.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(e.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> lista = new ArrayList<>();
        if (ciudad == null) {
            return lista;
        }

        for (Iterator<Contacto> it = agenda.values().iterator(); it.hasNext();) {
            Contacto c = it.next();
            if (c != null && c.getCiudad() != null
                    && c.getCiudad().equalsIgnoreCase(ciudad)) {
                lista.add(c);
            }
        }
        return lista;
    }

    public boolean borrarContacto(long telefono) {
        return agenda.remove(telefono) != null;
    }


    public SortedSet<String> getCiudades() {
        return Collections.unmodifiableSortedSet(ciudades);
    }

    public boolean addCiudad(String ciudad) {
        if (ciudad == null || ciudad.isEmpty()) {
            return false;
        }
        return ciudades.add(ciudad.trim());
    }

    public Set<Long> keySet() {
        return agenda.keySet();
    }

    public Set<Map.Entry<Long, Contacto>> entrySet() {
        return agenda.entrySet();
    }
}
