
public class Libros {
	
	public int codigo;
	private String nombre;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libros(int pCodigo,String pNombre, String pTitulo,String pAutor,int pNumPaginas) {
		  codigo = pCodigo;
		  nombre = pNombre;
		  titulo = pTitulo;
		  autor = pAutor;
		  numPaginas = pNumPaginas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
	
}
