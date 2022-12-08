package com.example.royalcookie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EntregaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EntregaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
/*
        val retrofit = Retrofit.Builder().baseUrl("https://royalback.herokuapp.com/api")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val api = retrofit.create(ApiService::class.java)
        api.obtenerEntregas().enqueue(object : Callback<List<DatosGS>>{
            override fun onResponse(call: Call<List<DatosGS>>, response: Response<List<DatosGS>>) {
                Log.d("Consulta exitosa", "onResponse: {${response.body()!![0].Nombre}}")
            }

            override fun onFailure(call: Call<List<DatosGS>>, t: Throwable) {
                Log.d("Falla en la consulta", "onFailures")
            }

        })*/
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_entrega, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*
       val rec = view.findViewById<RecyclerView>(R.id.reciclerview2)
        rec.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(context)
        rec.layoutManager = layoutManager
        val data = ArrayList<DatosGS>()
        val adapter = Adaptador(data)
        rec.layoutManager = LinearLayoutManager(context)
        rec.adapter = adapter*/
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EntregaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EntregaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

