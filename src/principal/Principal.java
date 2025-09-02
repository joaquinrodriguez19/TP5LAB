
package principal;

/**
 *
 * @author 54266
 */
public class Principal {

   public static void main(String[] args) {
       
        Directorio dir = new Directorio();

        dir.agregarContacto(1234567890L, new Contacto(1001, "Juan", "Saez", "San Luis", "Colon y Bolivar 390"));
        dir.agregarContacto(9876543210L, new Contacto(1002, "Ana", "Lopez", "Juana Koslay", "Belgrano 456"));
        dir.agregarContacto(5556667777L, new Contacto(1003, "Luis", "Garcia", "Villa Mercedes", "Mitre 789"));
        dir.agregarContacto(4445556666L, new Contacto(1004, "María", "Perez", "La Toma", "Rivadavia 321"));

        // Por telefono //
        System.out.println("Buscar contacto: " + dir.buscarContacto(1234567890L));

        // Por apellido //
        System.out.println("Teléfonos de Saez: " + dir.buscarTelefono("Pérez"));

        // Por ciudad //
        System.out.println("Contactos en Juana Koslay: " + dir.buscarContactos("Mendoza"));

        // Borrar //
        dir.borrarContacto(9876543210L);
        System.out.println("Después de borrar: " + dir.buscarContacto(9876543210L));
        
        
    }
    

    
}
