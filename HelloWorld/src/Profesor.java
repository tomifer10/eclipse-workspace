public class Profesor extends Persona {
	//Atributos
	private int numeroDeEdadesEstudiantes;
	private int sumaDeEdadesEstudiantes;
	private float estudiantesEdadMedia;
	//Constructor
	
	//M�todos
	public void agregarEdadEstudiante() {}
	public void mostrarInfo() {
		getNumeroDeEdadesEstudiantes();
		getSumaDeEdadesEstudiantes();
		getEstudiantesEdadMedia();
	}
	public int getNumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	};
	public int getSumaDeEdadesEstudiantes() {
		return sumaDeEdadesEstudiantes;
	};
	public float getEstudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}
	@Override
	public void mostrarID() {
		// TODO Auto-generated method stub
		
	}
	
}