
public abstract class Duplex extends Piso {

	private int plazaGaraje;
	public Duplex(int piso, int puerta, int portal,int plazaGaraje) {
		super(piso, puerta, portal);
		// TODO Auto-generated constructor stub
		this.plazaGaraje=plazaGaraje;
	}

	@Override
	public float getMetros() {
		// TODO Auto-generated method stub
		return 110;
	}

	@Override
	public float getCuota() {
		// TODO Auto-generated method stub
		return cuotaDuplex;
	}

}
