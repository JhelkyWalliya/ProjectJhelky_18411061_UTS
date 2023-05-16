package com.example.projectjhelky_18411061_uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val imageSrc : Int,
    val imageTitle : String,
    val imageDesc : String
): Parcelable