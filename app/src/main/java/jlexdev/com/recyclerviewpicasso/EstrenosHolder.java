package jlexdev.com.recyclerviewpicasso;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by JLex on 2/07/16.
 */
public class EstrenosHolder extends RecyclerView.ViewHolder {

    public ImageView imgImagen; // No Private para obtenerlo desde Context
    private TextView tvNombre;

    public EstrenosHolder(View v) {
        super(v);
        imgImagen = (ImageView)v.findViewById(R.id.img_imagen);
        tvNombre = (TextView)v.findViewById(R.id.tv_nombre);
    }

    public void bindEstrenos(Estrenos item, Context context) {

     // Picasso
        Picasso.with(context)
                .load(item.getImagen())
                .placeholder(R.drawable.xd)        // Fondo mientras carga mi Imagen
                .fit()                             // Redimensionar Imagen al tamaño de "ImageView"
                .error(R.mipmap.ic_launcher)       // Imagen que aparecerá al ocurri un Error
              .transform(new CircleTransform())  // "Redondear" Imagen
                .into(imgImagen);

//      imgImagen.setImageResource(item.getImagen()); // Linea reemplazada por Picasso
        tvNombre.setText(item.getNombre());
    }
}
