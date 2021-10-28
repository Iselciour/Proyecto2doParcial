package com.amalip.cocktailapp.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

/**
 * Created by Amalip on 9/29/2021.
 */

@Parcelize
@Entity
@JsonClass(generateAdapter = true)
class Cocktail(
    @PrimaryKey(autoGenerate = false)
    val idDrink: Int = 0,
    @Json(name = "strDrink") val name: String = "",
    @Json(name = "strCategory") val category: String = "",
    @Json(name = "strDrinkThumb") val urlThumb: String = "",
    @Json(name = "strImageSource") val url: String? = "",
    @Json(name = "strAlcoholic") val alcoholic: String? = "",
    @Json(name = "strInstructions") val instructions: String? = ""
) : Parcelable {

    val urlDetail: String
        get() = url ?: urlThumb

}