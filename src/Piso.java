
public abstract class Piso {
	protected static float cuotaApartamento=70;
	protected static float cuotaNormal=100;
	protected static float cuotaDuplex=110;
	
	private int portal;
	private int piso;
	private int puerta;
	
	private float metros;
	private float cuota;
	
	public Piso (int piso, int puerta, int portal){
		this.piso=piso;
		this.portal=portal;
		this.puerta=puerta;
	}
	public abstract float getMetros();
	
	public abstract float getCuota();
	
	public static void setCuotaApartamento(float cuotaApartamento) {
		Piso.cuotaApartamento = cuotaApartamento;
	}
	public static void setCuotaNormal(float cuotaNormal) {
		Piso.cuotaNormal = cuotaNormal;
	}
	public static void setCuotaDuplex(float cuotaDuplex) {
		Piso.cuotaDuplex = cuotaDuplex;
	}
	
	
}
