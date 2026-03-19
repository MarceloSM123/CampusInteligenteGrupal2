package universidad.infraestructura;

public class Laboratorio {

    private String nombreLab;
    private int capacidad;
    private boolean equiposEncendidos;
    public Laboratorio(String nombreLab, int capacidad) {
        this.nombreLab = nombreLab;
        this.capacidad = capacidad;
        this.equiposEncendidos = false ;  
    }

    public String getNombreLab() {
		return nombreLab;
	}

	public void setNombreLab(String nombreLab) {
		this.nombreLab = nombreLab;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isEquiposEncendidos() {
		return equiposEncendidos;
	}

	public void setEquiposEncendidos(boolean equiposEncendidos) {
		this.equiposEncendidos = equiposEncendidos;
	}

	public void abrirLaboratorio() {
        this.equiposEncendidos = true;
        System.out.println("El laboratorio " + this.nombreLab + " ha sido abierto. ¿Equipos encendidos? " + this.equiposEncendidos);
    }
    
    public void mostrarInformacion() {
        System.out.println("-- Info Lab: " + this.nombreLab + " Capacidad: " + this.capacidad + " personas ---");
    }
}
