import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private List<Laboratorio> laboratorios = new ArrayList<>();

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLaboratorio(Laboratorio lab) {
        laboratorios.add(lab);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Laboratorio> getLaboratorios() {
        return laboratorios;
    }
}
