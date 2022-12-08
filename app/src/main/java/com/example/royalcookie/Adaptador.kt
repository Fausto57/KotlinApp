package com.example.royalcookie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adaptador(private val data: List<DatosGS>): RecyclerView.Adapter<Adaptador.viewHolder>() {

    class viewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
 /*      var imagen: ImageView
        var itemnombre: TextView
        var itemdireccion: TextView
        var itempedido: TextView
        var btntermina: Button

        init {
            imagen = itemview.findViewById(R.id.item_imagen2)
            itemnombre = itemview.findViewById(R.id.txtNombre2)
            itemdireccion = itemview.findViewById(R.id.txtDireccion2)
            itempedido = itemview.findViewById(R.id.txtPedido2)
            btntermina = itemview.findViewById(R.id.btnTermina2)
        }*/
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview2, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(viewholder: viewHolder, position: Int) {
    /*    val dat = data[position]
        viewholder.imagen.setImageResource(R.drawable.ic_launcher_background)
        viewholder.itemnombre.text = dat.Nombre
        viewholder.itemdireccion.text = dat.Direccion
        viewholder.itempedido.text = dat.Pedido*/
    }

    override fun getItemCount(): Int{
        return data.size
    }

}