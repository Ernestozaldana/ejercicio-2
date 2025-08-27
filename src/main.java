public class Main {
    public static void main(String[] args) {
        // Crear persona usando constructor con parámetros
        Persona p1 = new Persona("Juan", "Pérez", 25);

        // Crear persona con constructor vacío y usar setters
        Persona p2 = new Persona();
        p2.setNombre("Ana");
        p2.setApellido("López");
        p2.setEdad(30);

        // Mostrar información
        p1.mostrarInformacion();
        System.out.println("----------------");
        p2.mostrarInformacion();
    }
}

