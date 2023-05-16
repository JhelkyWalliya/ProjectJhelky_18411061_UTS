package com.example.projectjhelky_18411061_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList : List<Image> = listOf<Image>(
            Image(
                R.drawable.kopi,
            "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.kopigelas,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.kopigiling,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.kopipanen,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.kopipanentangan,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.kopiputih,
                "kopi",
                "satu-satunya Kopi di papua dengan produk terbaik. biji kopi ini di produksi" +
                        " dan di olah dengan kualitas terbaik di papua yang terletak di paniai."
            ),
            Image(
                R.drawable.kopiwamena,
                "kopi",
                "Selain itu kami mengelolah dan menjual Prodak kopi papua Kami juga menjual kopi makanan serta  minuman kopi" +
                        " yang dalam bentuk kamasan "
            ),
            Image(
                R.drawable.okbab,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.okhika,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.paniai,
                "kopi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            Image(
                R.drawable.sabin,
                "kopi",
                "Kopi sabin Merupakan Kopi penghasilan yang berasal dari Papua yang sangat baik di Papua"
            ),
            Image(
                R.drawable.tangan,
                "kopi",
                "Tangan adalah daera pedelaman yang terletak di kapupaten Pengunungan Binntang " +
                        "dan di tengan juga salah satu daera penghasil kopi terbaik yang berasal dari papua"
            ),
            Image(
                R.drawable.tiom,
                "kopi",
                "ini adalah penghasilan kopi papua dari Tiom" +
                        "Tiom merupakan salah satu daera pedalaman yang cukup jau dari perkotaan dan di daera ini menghasilkan kopi terbaik dari papua"

            ),
        )

        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.imageRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdpater(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}