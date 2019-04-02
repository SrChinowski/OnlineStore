package dataBase;
import javax.swing.*;
import java.io.*;

public class WriterReaderObjeto {

    public static void main(String[] args) {

        Objetos ob1 = new Objetos("laptop", 562);
        Objetos ob2 = new Objetos("juguete", 50);

        try {
            //escribimos los objetos
            FileOutputStream f = new FileOutputStream("objetos.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(ob1);
            o.writeObject(ob2);

            o.close();
            f.close();

            //leemos los objetos
            FileInputStream fi = new FileInputStream("objetos.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Objetos obj1 = (Objetos) oi.readObject();
            Objetos obj2 = (Objetos) oi.readObject();


            System.out.println(obj1.toString());
            System.out.println(obj2.toString());

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

    public void ObjetoDefault(){
        String name = "Pc";
        int precio = 65;

        RegistroObjeto(name, precio);
        //name = JOptionPane.showInputDialog(null,"Ingresa nombre")
    }

    public void RegistroObjeto(String name, int precio){

        try {
            Objetos obnew = new Objetos(name, precio);

            FileOutputStream f = new FileOutputStream("objetos.txt",true);
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(obnew);

            o.close();
            f.close();

            //leemos el objeto
            FileInputStream fi = new FileInputStream(new File("objetos.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Objetos obj1 = (Objetos) oi.readObject();

            System.out.println(obj1.toString());
            JOptionPane.showMessageDialog(null, "nombre; "+obj1.getName()+"\nprecio: "+obj1.getPrecio(),"Producto creado",1);

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO: Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void ImprimirLista(){
        try {
            //leemos los objetos
            FileInputStream fi = new FileInputStream(new File("objetos.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            System.out.println("\nLista de objetos:\n");
            Objetos nobj =(Objetos) oi.readObject();
            while (nobj !=  null) {
                // Read objects
                nobj = (Objetos) oi.readObject();
                System.out.println(nobj.toString() +"\n");
                //System.out.println("Imprime aqui");
                if((nobj=(Objetos) oi.readObject())==null) System.out.println("Adios");
            }

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException  e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void LimpiarArchivo(){
        //try {
            //FileOutputStream f = new FileOutputStream("objetos.txt");
        //}

    }
}
