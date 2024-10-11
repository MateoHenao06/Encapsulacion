package encapsulacion;

public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidadStock;
	
	

    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

	//getter para obtener el nombre
	public String getNombre() {
		return nombre;
	}
	
	//setter para modificar el nombre
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//getter para obtener el precio
	public double getPrecio() {
		return precio;
	}
	
	//setter para modificar el precio
	public void setPrecio(double precio) {
		if (precio>0) {
			this.precio=precio;
		}else {
			System.out.println("el precio debe de ser positivo");
		}
		
	}
	
	//getter para obtener la cantidad del stock
	public int getCantidadStock() {
		return cantidadStock;
	}
	
	//setter para modificar la cantidad del stock
	public void setCantidadStock(int cantidadStock) {
		if (cantidadStock>0) {
			this.cantidadStock=cantidadStock;
		}else {
			System.out.println("La Cantidad de stock debe ser positiva");
		}
		
	}
	
	
	public void mostrarProductos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("precio: "+precio);
		System.out.println("cantidad de stock:"+cantidadStock);
	}
}
