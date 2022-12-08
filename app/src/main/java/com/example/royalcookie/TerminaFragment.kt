package com.example.royalcookie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TerminaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TerminaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

val listNombre: ArrayList<String> = ArrayList()
val listDirection: ArrayList<String> = ArrayList()
val listToping: ArrayList<String> = ArrayList()
val listId: ArrayList<String> = ArrayList()


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    arguments?.let {
        param1 = it.getString(ARG_PARAM1)
        param2 = it.getString(ARG_PARAM2)
    }
}
/*
fun Consulta(){
    val adap = CustomAdapter()
    val queue = Volley.newRequestQueue(context)
    val url = "https://royalback.herokuapp.com/api/obtenergalletas"
    val stRequest = StringRequest(Request.Method.GET, url, { response ->
        val jsonArray = JSONArray(response)
        for (i in 0 until jsonArray.length()){
            val jsonObject = JSONObject(jsonArray.getString(i))
            val txNombre = jsonObject.get("IDCatalogo")
            val txDirection = jsonObject.get("Toping")
            val txToping = jsonObject.get("Precio")
            val txId = jsonObject.get("IDProducto")
            Toast.makeText(context, txNombre.toString()+" "+txDirection.toString()+" "+txToping.toString()+" "+txId.toString(), Toast.LENGTH_SHORT).show()
            listNombre.add(txNombre.toString())
            listDirection.add(txDirection.toString())
            listToping.add(txToping.toString())
            listId.add(txId.toString())
            println(txNombre.toString()+" "+txDirection.toString()+" "+txToping.toString()+" "+txId.toString())
            adap.Obtener(txNombre.toString(), txDirection.toString(), txToping.toString(), txId.toString())
        }

    }, { error ->
        Toast.makeText(context, error.toString(), Toast.LENGTH_LONG).show()
        println(error.toString()) })
    queue.add(stRequest)
}*/


override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val queue = Volley.newRequestQueue(context)
    val url = "https://royalback.herokuapp.com/api/obtenergalletas"
    val stRequest = StringRequest(Request.Method.GET, url, { response ->
        val jsonArray = JSONArray(response)
        for (i in 0 until jsonArray.length()){
            val jsonObject = JSONObject(jsonArray.getString(i))
            val txNombre = jsonObject.get("IDCatalogo")
            val txDirection = jsonObject.get("Toping")
            val txToping = jsonObject.get("Precio")
            val txId = jsonObject.get("IDProducto")
            Toast.makeText(context, txNombre.toString()+" "+txDirection.toString()+" "+txToping.toString()+" "+txId.toString(), Toast.LENGTH_SHORT).show()
            listNombre.add(txNombre.toString())
            listDirection.add(txDirection.toString())
            listToping.add(txToping.toString())
            listId.add(txId.toString())
            println(txNombre.toString()+" "+txDirection.toString()+" "+txToping.toString()+" "+txId.toString())
        }

    }, { error ->
        Toast.makeText(context, error.toString(), Toast.LENGTH_LONG).show()
        println(error.toString()) })
    queue.add(stRequest)

    val rec = view.findViewById<RecyclerView>(R.id.reciclerview)
    val adapter = CustomAdapter(listNombre,listDirection,listToping, listId)
    rec.layoutManager = LinearLayoutManager(context)
    rec.adapter = adapter

}

override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    return inflater.inflate(R.layout.fragment_termina, container, false)
}

companion object {
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TerminaFragment.
     */
    // TODO: Rename and change types and number of parameters
    @JvmStatic
    fun newInstance(param1: String, param2: String) =
        TerminaFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
}
}