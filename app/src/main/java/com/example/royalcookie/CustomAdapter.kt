package com.example.royalcookie

import android.graphics.RenderEffect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(arr1: ArrayList<String>, arr2: ArrayList<String>, arr3: ArrayList<String>,arr4: ArrayList<String>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    var listNombre: ArrayList<String> = arr1
    var listDirection: ArrayList<String> = arr2
    var listToping: ArrayList<String> = arr3
    var listId: ArrayList<String> = arr4

    inner class ViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        var imagen: ImageView
        var itemnombre: TextView
        var itemdireccion: TextView
        var itempedido: TextView
        var btntermina: Button

        init {
            imagen = itemview.findViewById(R.id.item_imagen)
            itemnombre = itemview.findViewById(R.id.txtNombre)
            itemdireccion = itemview.findViewById(R.id.txtDireccion)
            itempedido = itemview.findViewById(R.id.txtPedido)
            btntermina = itemview.findViewById(R.id.btnTermina)
            listNombre.add("lesly")
            listNombre.add("fausto")
            listNombre.add("irving")

            listDirection.add("rio puebla 2344")
            listDirection.add("rio puebla 2344")
            listDirection.add("rio puebla 2344")

            listToping.add("pastel personalizado")
            listToping.add("pastel")
            listToping.add("galletas")
        }

    }

    fun Obtener(nombre: String, dir: String, topin: String, id: String){
        listNombre.add(nombre)
        listDirection.add(dir)
        listToping.add(topin)
        listId.add(id)
        println(nombre+ "###################3#")
        println(dir + "###################3#")
        println(topin + "###################3#")
        println(id + "###################3#")
    }

    override fun onCreateViewHolder(viewgrup: ViewGroup, i: Int): ViewHolder {
        val v  = LayoutInflater.from(viewgrup.context).inflate(R.layout.cardview, viewgrup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, position: Int) {
        viewholder.imagen.setImageResource(R.drawable.ic_launcher_background)
        viewholder.itemnombre.text = listNombre[position]
        viewholder.itemdireccion.text = listDirection[position]
        viewholder.itempedido.text = listToping[position]
    }

    override fun getItemCount(): Int {
        return 3
    }

}

