package dataBase;
import javax.swing.*;
import java.io.*;

public class WriterReaderUsuario {

    public static void main(String[] args) {

        Usuario p1 = new Usuario("Arturo","bbcita@gmail.com", "yolo","55225");
        Usuario p2 = new Usuario("Karen","tuhombre@outlook.com", "swag","5465");

        try {
            //escribimos los objetos
            FileOutputStream f = new FileOutputStream(new File("usuarios.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            //leemos los objetos
            FileInputStream fi = new FileInputStream(new File("usuarios.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Usuario pr1 = (Usuario) oi.readObject();
            Usuario pr2 = (Usuario) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void UsuarioDefault(){
        String name = "Artio";
        String email = "email@email";
        String password = "ppp";
        String card = "8768";

        RegistroUsuario(name, email, password, card);
        //name = JOptionPane.showInputDialog(null,"Ingresa nombre")
    }

    public void RegistroUsuario(String name, String email, String password, String card){

        try {
            Usuario pnew = new Usuario(name, email, password, card);

            FileOutputStream f = new FileOutputStream(new File("usuarios.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(pnew);

            o.close();
            f.close();

            //leemos el objeto
            FileInputStream fi = new FileInputStream(new File("usuarios.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Usuario pr1 = (Usuario) oi.readObject();

            System.out.println(pr1.toString());
            JOptionPane.showMessageDialog(null, "nombre; "+pr1.getName()+"\nemail: "+pr1.getEmail(),"Nuevo Usuario",1);

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
