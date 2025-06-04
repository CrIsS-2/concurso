public class Software {
    private String nombre;
    private String version;

    public Software(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    @Override
    public String toString() {
        return nombre + " " + version;
    }
}
