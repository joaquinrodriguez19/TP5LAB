package principal;

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

}
