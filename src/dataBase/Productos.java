import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;


public class Productos implements Serializable{
	
	public static void main(String[] args) {
		try {
		Usuario P4 = new Usuario ("Cesar Ricardo","serpi312014@salle.com", 200,"holamundo", "0005");
		Cuenta cuenta = new Cuenta (P4);
		cuenta.Guardar();
		Usuario P1 = new Usuario ("Cesar","serpi312011@salle.com", 200,"holamundo", "0001");
		cuenta.getUsuario(P1);
		cuenta.Guardar();
		Usuario P2 = new Usuario ("Ricardo","serpi312012@salle.com", 200,"holamundo", "0002");
		cuenta.getUsuario(P2);
		cuenta.Guardar();
		Usuario P3 = new Usuario ("Ruben","serpi312013@salle.com", 200,"holamundo", "0003");
		cuenta.getUsuario(P3);
		cuenta.Guardar();
		Usuario P = Hash.get("0005");
		cuenta.getUsuario(P);
		cuenta.Cobro(100);
		System.out.println(P.getCorreo());
		System.out.println(P.getSaldo());
			cuenta.Guardar();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	private static final long serialVersionUID = 1L;
	private static File Archivo ;
	private static HashMap <String,Usuario> Hash= new HashMap <String,Usuario>();
	private static Usuario Op;
	
	public Cuenta(Usuario op) {
		Op=op;
		InicializarHash();
	}
	
	public void Guardar() throws FileNotFoundException, UnsupportedEncodingException {
		Archivo = new File ("Usuarios.txt");try {
		ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream(Archivo));
		Hash.put(Op.getTarjeta(),Op);
			if(!Archivo.exists()) {
				try {
				Archivo.createNewFile();
				objeto.writeObject(Hash);
				objeto.close();
				}catch 
			}
			else {
				objeto.writeObject(Hash);
				objeto.close();
			}
		}catch (IOException e) {e.printStackTrace();}
	}
	
	public boolean Cobro (int Costo) {
		Op.setSaldo(Op.getSaldo()-Costo);
		if(Op.getSaldo()>0) {
			Hash.put(Op.getTarjeta(),Op);
			try {
				Guardar();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private void InicializarHash () {
		Archivo = new File ("Usuarios.txt");try {
			ObjectInputStream objeto = new ObjectInputStream(new FileInputStream(Archivo));
				if(!Archivo.exists()) {
				}
				else {
					try {
						Hash =(HashMap<String, Usuario>) objeto.readObject();
					} catch (ClassNotFoundException e) {e.printStackTrace();}
					objeto.close();
				}
			}catch (IOException e) {e.printStackTrace();}
	}
	
	public void getUsuario(Usuario op) {
		Op=op;
	}

}
