import java.math.*;
public class Jugador extends Futbolista  implements Comparable<Futbolista>  {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
		
	public Jugador(short golesMarcados, byte dorsal, String nombre, int edad, String posicion) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	
	}
	

	@Override
	public String jugarConLasManos() {
		return "falso";

	}

	@Override
	public int compareTo(Futbolista otro) {
		int x = Math.abs(this.getEdad()-otro.getEdad());
		return x;
	}
	
	@Override

	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
	}

}
