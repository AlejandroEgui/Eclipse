
public abstract class PisoNormal extends Piso {
	public PisoNormal (int piso, int puerta, int portal){
		super(piso,puerta,portal);
	}
	@Override
	public float getMetros() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public float getCuota() {
		// TODO Auto-generated method stub
		return cuotaNormal;
	}

}
