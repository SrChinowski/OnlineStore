package dataBase;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import jdk.jfr.events.FileReadEvent;

import java.io.*;

public class dataBase {
    File tienda = null;
    File objetos = null;
    File usuarios = null;
    FileReader fr = null;
    BufferedReader br = null;

    public dataBase(){
        try {
            //abrimos el archivo si es posible
            File tienda = new File("");
            System.out.println("Se abrio el archivo");
            fr = new FileReader(tienda);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }catch (Exception eo){
            eo.printStackTrace();
            System.out.println("El archivo no se encuentra");
        }finally{
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta
        // una excepcion.
        try{
            if( null != fr ){
                fr.close();
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }


    }
}
