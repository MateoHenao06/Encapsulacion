package encapsulacion;

public class Empleado {
	
	private String nombre;
	private double salario;
	
	
	//metodo constructor
	public Empleado(String nombre, double salario) {
		this.nombre=nombre;
		this.salario=salario;
		
	}
	
	//Getter para obtener el nombre	
	public String getNombre() {
		return nombre;
	}
	
	//setter para modificar el nombre
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//getter para obtener el salario
	public double getSalario() {
		return salario;
	}
	
	//seter para modificar el salario
	
	public void setSalario(double salario) {
		if (salario>0) {
			this.salario=salario;
			
		}else {
			System.out.println("El salario debe ser positivo");
		}
	}
	
	
	//metodo para mostrar la informacion
	
	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Salario: $"+salario);
	}
}
