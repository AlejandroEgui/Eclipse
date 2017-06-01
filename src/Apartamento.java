
public abstract class Apartamento extends Piso {
	public Apartamento (int piso, int puerta, int portal){
		super(piso,puerta,portal);
	}
	@Override
	public float getMetros(){
		// TODO Auto-generated method stub
		return 50;
	}
	@Override
	public float getCuota(){
		// TODO Auto-generated method stub
		return cuotaApartamento;
	}
	
}
