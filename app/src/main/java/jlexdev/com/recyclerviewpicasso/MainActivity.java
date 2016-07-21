package jlexdev.com.recyclerviewpicasso;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 *  Fuente:
 *  https://www.learn2crack.com/2016/02/image-loading-recyclerview-picasso.html
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerEstrenos;
    private RecyclerView.Adapter adapterEstrenos;
    private RecyclerView.LayoutManager layoutManagerEstrenos;

    private ArrayList<Estrenos> datos;

/** Prueba de Muestra de Datos (Ordenado)
 *
 *  TODO: Aun me falta conectar estas cadenas con mi Array (Aprender Cómo) :)


    private final String imagen[] = {
            "Angry Birds",
            "Buscando a Dory",
            "Civil War",
            "Dia de la Independencia 2",
            "Nada es lo que parece",
            "X-Men Apocalipsis"
    };

    private final String nombre[] = {
            "http://es.web.img3.acsta.net/pictures/15/12/21/12/04/283699.jpg",
            "http://es.web.img3.acsta.net/c_300_300/pictures/16/03/16/09/10/414033.jpg",
            "https://exorcine.files.wordpress.com/2016/03/capitan-america-3-10.jpg",
            "http://cpmcines.com/nuevo/wp-content/uploads/2016/06/dia-independencia-2.jpg",
            "http://www.rumberos.net/rumberos/images/cinex_tituclo_estrenos.jpg",
            "http://es.web.img2.acsta.net/c_215_290/pictures/16/04/19/15/57/356622.jpg"
    };
*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargo DATOS
        datos = new ArrayList<Estrenos>();


        datos.add(new Estrenos("http://es.web.img3.acsta.net/pictures/15/12/21/12/04/283699.jpg", "Angry Birds"));
        datos.add(new Estrenos("http://es.web.img3.acsta.net/c_300_300/pictures/16/03/16/09/10/414033.jpg", "Buscando a Dory"));
        datos.add(new Estrenos("https://exorcine.files.wordpress.com/2016/03/capitan-america-3-10.jpg", "Civil War"));
        datos.add(new Estrenos("http://cpmcines.com/nuevo/wp-content/uploads/2016/06/dia-independencia-2.jpg", "Dia de la Independencia 2"));
        datos.add(new Estrenos("http://www.rumberos.net/rumberos/images/cinex_tituclo_estrenos.jpg", "Nada es lo que parece"));
        datos.add(new Estrenos("http://es.web.img2.acsta.net/c_215_290/pictures/16/04/19/15/57/356622.jpg", "X-Men Apocalipsis"));


        // Recycler
        recyclerEstrenos = (RecyclerView)findViewById(R.id.recycler_estrenos);
        recyclerEstrenos.setHasFixedSize(true);
        // Adapter
        adapterEstrenos = new EstrenosAdapter(datos);
        recyclerEstrenos.setAdapter(adapterEstrenos);
        // Layout Manager
        layoutManagerEstrenos = new LinearLayoutManager(this);
        recyclerEstrenos.setLayoutManager(layoutManagerEstrenos);


        /** Recojo Datos de Array
         *
         */

    }

}
