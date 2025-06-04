import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String codigo;
    private Categoria categoria;
    private Laboratorio laboratorio;
    private Computadora computadora;
    private List<Software> softwareRequerido = new ArrayList<>();

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void seleccionarCategoria(Categoria cat) {
        this.categoria = cat;
    }

    public void seleccionarLaboratorioYComputadora(Laboratorio lab, Computadora comp) {
        this.laboratorio = lab;
        this.computadora = comp;
        comp.asignarEstudiante(this);
    }

    public void agregarSoftwareRequerido(Software s) {
        softwareRequerido.add(s);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public List<Software> getSoftwareRequerido() {
        return softwareRequerido;
    }
}
