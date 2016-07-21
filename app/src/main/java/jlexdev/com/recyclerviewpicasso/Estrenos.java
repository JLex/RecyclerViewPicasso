package jlexdev.com.recyclerviewpicasso;

/**
 * Created by JLex on 2/07/16.
 */
public class Estrenos {

    private String imagen; // String to use "Link-image"
    private String nombre;

    public Estrenos(String imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }
}
