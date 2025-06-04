import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private List<Computadora> computadoras = new ArrayList<>();
    private List<Software> softwareInstalado = new ArrayList<>();

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public void agregarComputadora(Computadora c) {
        computadoras.add(c);
    }

    public void agregarSoftware(Software s) {
        softwareInstalado.add(s);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public List<Software> getSoftwareInstalado() {
        return softwareInstalado;
    }
}
