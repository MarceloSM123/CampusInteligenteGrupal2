package universidad.usuarios;
import universidad.usuarios.Estudiante;​
import universidad.infraestructura.Laboratorio;
public class SistemaCampus {
public static void main(String[] args) {
	Estudiante estudiante1=new Estudiante("","","",1);
	Estudiante estudiante2=new Estudiante("","","",2);
	Laboratorio laboratorio1=new Laboratorio("",5);
	laboratorio1.mostrarInformacion();
	laboratorio1.abrirLaboratorio();
	estudiante1.presentarse();
	estudiante1.estudiar();
	estudiante2.presentarse();
}
}
