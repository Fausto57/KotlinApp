package com.example.royalcookie

data class DatosGS (
    val id: String,
    val Nombre: String,
    val Direccion: String,
    val Pedido: String
)
/* val listNombre: MutableList<String> = ArrayList()
 val listDirection: MutableList<String> = ArrayList()
 val listToping: MutableList<String> = ArrayList()
 val listId: MutableList<String> = ArrayList()

 init      val queue = Volley.newRequestQueue(MainActivity().applicationContext)
     val url = "https://royalback.herokuapp.com/api/obtenergalletas"
     val stRequest = StringRequest(Request.Method.GET, url, { response ->
         val jsonArray = JSONArray(response)
         for (i in 0 until jsonArray.length()){
             val jsonObject = JSONObject(jsonArray.getString(i))
             val txNombre = jsonObject.get("Nombre")
             val txDirection = jsonObject.get("Direccion")
             val txToping = jsonObject.get("Toping")
             val txId = jsonObject.get("idLineaPedido")
             listNombre.add(txNombre.toString())
             listDirection.add(txDirection.toString())
             listToping.add(txToping.toString())
             listId.add(txId.toString())
         }

     }, { error ->
         println(error.toString()) })
     queue.add(stRequest)
 }

 fun lisNombre() : MutableList<String> {
     return listNombre
 }
}
 */
