
public class Colegio extends Edificio { //esta en rojo colegio porque me pide el constructor
	private int numeroAulas;
	private boolean pabellon;
	public Colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral, int numeroAulas) {
		super(direccion, codigoPostal, altura, calefaccionCentral);
		this.numeroAulas=numeroAulas;
		
		
		// TODO Auto-generated constructor stub
	}
	public int getCapacidadColegio(){ //los parentesis no tienen nada porque para calcular la capacidad no necesito info externa
		int capacidadColegio;
		capacidadColegio=numeroAulas*30;  //30 alumnos por aula por ejemplo
		return(capacidadColegio);
		
		
		
	}
