package futbol;

public class Portero extends Futbolista implements Comparable<Portero> {
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad,"Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	
	}

	public int compareTo(Portero p) {
		int x = Math.abs(this.golesRecibidos-p.golesRecibidos);
		return x;
	}
	@Override
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
	}


}
