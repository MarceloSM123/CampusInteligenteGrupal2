package universidad.usuarios;

public class Estudiante {
	private String nombre;
	private String matricula;
	private String carrera;
	private int semestre;

	public Estudiante(String nombre, String matricula, String carrera, int semestre) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public void presentarse() {
		System.out.println(
				"Hola, soy " + this.nombre + ", estudiante de " + this.carrera + " en el semestre " + this.semestre);
	}

	public void estudiar() {
		System.out.println("El estudiante " + this.nombre + " (Matricula: " + this.matricula
				+ ") esta estudiando para sus exámenes");
	}
}
