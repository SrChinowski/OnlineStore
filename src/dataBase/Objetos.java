package dataBase;

import java.io.Serializable;

public class Objetos implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String descripcion;
    private int precio;
    private int existencia;
    private String imagen;

    public Objetos(String name, int precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public int getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Objetos{" +
                "name='" + name + '\'' +
                ", precio=" + precio +
                '}';
    }
}

