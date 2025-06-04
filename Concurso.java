import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private String nombre;
    private String fecha;
    private List<Categoria> categorias = new ArrayList<>();
    private List<Estudiante> participantes = new ArrayList<>();

    public Concurso(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public void agregarCategoria(Categoria cat) {
        categorias.add(cat);
    }

    public void inscribirEstudiante(Estudiante est) {
        participantes.add(est);
    }

    public void mostrarDetalleParticipantes() {
        System.out.println("Concurso: " + nombre + " (" + fecha + ")");
        System.out.println("---------------------------------------");
        for (Estudiante est : participantes) {
            System.out.println("Participante: " + est.getNombre() + " (Código: " + est.getCodigo() + ")");
            System.out.println("  Modalidad: " + est.getCategoria().getNombre());
            System.out.println("  Laboratorio: " + est.getLaboratorio().getNombre());
            System.out.println("  Computadora asignada: " + est.getComputadora().getCodigo());
            System.out.println("  Software del laboratorio:");
            for (Software s : est.getLaboratorio().getSoftwareInstalado()) {
                System.out.println("    - " + s);
            }
            System.out.println("  Software requerido por el estudiante:");
            for (Software s : est.getSoftwareRequerido()) {
                System.out.println("    - " + s);
            }
            System.out.println("---------------------------------------");
        }
    }
}
