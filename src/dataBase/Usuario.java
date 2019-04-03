import java.io.Serializable;

public class Usuario implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String Nombre; //35
	private String Correo; //30
	private int Saldo; //10
	private String Tarjeta;//10
	private String Contrasena; //10
	
	public Usuario(String nombre,String correo, int saldo,String contrasena, String tar){
		setNombre(nombre);
		setCorreo(correo);
		setSaldo(saldo);
		setContraseña(contrasena);
		setTarjeta(tar);
		}	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public int getSaldo() {
		return Saldo;
	}
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContraseña(String contrasena) {
		Contrasena = contrasena;
	}
	public String getTarjeta() {
		return Tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		Tarjeta = tarjeta;
	}
}