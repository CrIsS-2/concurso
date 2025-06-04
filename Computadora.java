public class Computadora {
    private String codigo;
    private boolean disponible = true;
    private Estudiante estudiante;

    public Computadora(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void asignarEstudiante(Estudiante estudiante) {
        if (disponible) {
            this.estudiante = estudiante;
            this.disponible = false;
        }
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
