package jlexdev.com.recyclerviewpicasso;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by JLex on 2/07/16.
 */
public class EstrenosAdapter extends RecyclerView.Adapter<EstrenosHolder> {

    private ArrayList<Estrenos> datos;

    public EstrenosAdapter(ArrayList<Estrenos> datos) {
        this.datos = datos;
    }

    @Override
    public EstrenosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item_estrenos, parent, false);
        EstrenosHolder eh = new EstrenosHolder(v);
        return eh;
    }

    @Override
    public void onBindViewHolder(EstrenosHolder holder, int position) {
        // Contexto para Picasso
        Context context = holder.imgImagen.getContext();

    /* Uso directamente, sin usar bindEsternos
        Picasso.with(context)
                .load(datos.get(position).getImagen())
                .into(holder.imgImagen);
    */

        Estrenos item = datos.get(position);
        holder.bindEstrenos(item, context);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
