public class Main {
    public static void main(String[] args) {
        Concurso concurso = new Concurso("Concurso Académico", "2025-07-10");

        Categoria logica = new Categoria("Lógica Básica");
        Categoria empresarial = new Categoria("Empresarial");

        concurso.agregarCategoria(logica);
        concurso.agregarCategoria(empresarial);

        Laboratorio labA = new Laboratorio("Laboratorio A", 10);
        Laboratorio labB = new Laboratorio("Laboratorio B", );

        labA.agregarSoftware(new Software("Visual Studio", "2022"));
        labA.agregarSoftware(new Software("PostgreSQL", "14"));
        labB.agregarSoftware(new Software("SQL Server", "2019"));

        for (int i = 1; i <= 5; i++) {
            labB.agregarComputadora(new Computadora("B" + i));
        }

        logica.agregarLaboratorio(labA);
        logica.agregarLaboratorio(labB);
        empresarial.agregarLaboratorio(labB);

        Estudiante e1 = new Estudiante("Ana Torres", "20231234");
        e1.seleccionarCategoria(logica);
        e1.seleccionarLaboratorioYComputadora(labA, labA.getComputadoras().get(0));
        e1.agregarSoftwareRequerido(new Software("Python", "3.11"));
        e1.agregarSoftwareRequerido(new Software("PostgreSQL", "14"));

        Estudiante e2 = new Estudiante("Carlos Ruiz", "20231235");
        e2.seleccionarCategoria(empresarial);
        e2.seleccionarLaboratorioYComputadora(labB, labB.getComputadoras().get(1));
        e2.agregarSoftwareRequerido(new Software("SQL Server", "2019"));

        concurso.inscribirEstudiante(e1);
        concurso.inscribirEstudiante(e2);

        concurso.mostrarDetalleParticipantes();
    }
}
