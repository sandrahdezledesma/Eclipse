
public class ManejaMascotas {

	public static void main(String[] args) {
		Mascota cuqui;
		cuqui=new Mascota("cuqui",3,"perro",'h');
		System.out.println("Mi mascota se llama "+cuqui.getNombre());
		System.out.println("y tiene "+cuqui.getEdad() +" a�os");
		//pasa un a�o
		cuqui.setEdad(4);
		System.out.println("Ahora tiene "+cuqui.getEdad());
		System.out.println("por lo tanto naci� en el a�o "+cuqui.getAnioNacimiento(2018));
	}

}
