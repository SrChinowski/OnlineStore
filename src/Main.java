import dataBase.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Johan es bien zorra");
        //dataBase base = new dataBase();

        WriterReaderUsuario manejadorUsuario = new WriterReaderUsuario();
        WriterReaderObjeto manejadorObjeto = new WriterReaderObjeto();

        //crea un usuario default
       // manejadorUsuario.UsuarioDefault();

        //imprime la lista de objetos
       // manejadorObjeto.ImprimirLista();

        //crea un objeto default
        manejadorObjeto.ObjetoDefault();

        //imprime la lista de objetos
        manejadorObjeto.ImprimirLista();

        //Limpiar el archivo objetos.txt  **beta
        //manejadorObjeto.LimpiarArchivo();
    }
}
