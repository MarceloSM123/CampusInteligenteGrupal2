package universidad.recursos;

public class Libro {
private String titulo,autor;
private boolean disponible;
public Libro(String titulo, String autor) {
	this.titulo = titulo;
	this.autor = autor;
	this.disponible=true;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public boolean isDisponible() {
	return disponible;
}

public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}

public void prestarLibro() {
	this.disponible=false;
	System.out.println("El libro '"+this.titulo+"' de "+this.autor+" hasido prestado.");
}
public void devolverLibro() {
	this.disponible=true;
	System.out.println("El libro '"+this.titulo+"' ha sido devuelto a la biblioteca.");
}
}
