package com.irfan.chapterthreeclallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Parcelable(
    val nama: String,
    val email: String? = null,
    val umur: String? = null,
    val alamat: String? = null
): Parcelable
