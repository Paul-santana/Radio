
public class Inventario extends Libros {
	private String ActualizarDatos;

	public Inventario(int pCodigo, String pNombre, String pTitulo, String pAutor, int pNumPaginas) {
		super(pCodigo, pNombre, pTitulo, pAutor, pNumPaginas);
		// TODO Auto-generated constructor stub
	}

	public String getActualizarDatos() {
		return ActualizarDatos;
	}

	public void setActualizarDatos(String actualizarDatos) {
		ActualizarDatos = actualizarDatos;
	}
	
	private String referencia;
	int cantidad;
	void Libros (String referencia, int cantidad){
		setReferencia(referencia);
		setCantidad(cantidad);
		
	}
	public void setReferencia(String c) {referencia = c;}
	public void setCantidad(int n) {cantidad = n;}
	
	public String getReferencia() {return referencia;}
	public int getCantidad() {return cantidad;}
	
	public void mostrarinventario () {
		System.out.println("\nReferencia:" + getReferencia()+"\nCantidad:"+ getCantidad());
	}
}

