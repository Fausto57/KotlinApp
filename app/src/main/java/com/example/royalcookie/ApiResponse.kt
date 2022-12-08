package com.example.royalcookie

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("IDCatalogo") var idcatalogo: List<Int>,
    @SerializedName("Toping") var topping: List<String>,
    @SerializedName("Precio") var precio: List<Float>,
    @SerializedName("IDProducto") var idproducto: List<Int>
    )
