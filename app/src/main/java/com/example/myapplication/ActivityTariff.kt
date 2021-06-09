package com.example.myapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.abs

    private var selection : TextView? = null
class ActivityTariff : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_tariff))


       var imageView : ImageView? = findViewById(R.id.image_view)

        var tariffs = resources.getStringArray(R.array.Tariffs)


        val tariffsList : ListView = findViewById(R.id.tariff_list)

        val adapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, tariffs)
        tariffsList.adapter = adapter
        tariffsList.onItemClickListener = AdapterView.OnItemClickListener { _,_ , position,_ ->
        if(position == 0){
            imageView?.setImageResource(R.drawable.image002)
        }
            if(position == 1){
                imageView?.setImageResource(R.drawable.image003)
            }
            if(position == 2){
                imageView?.setImageResource(R.drawable.image004)
            }
            if(position == 3){
                imageView?.setImageResource(R.drawable.image005)
            }
            if(position == 4){
                imageView?.setImageResource(R.drawable.image006)
            }
            if(position == 5){
                imageView?.setImageResource(R.drawable.image1)
            }
            if(position == 6){
                imageView?.setImageResource(R.drawable.unnamed2)
            }
            if(position == 7){
                imageView?.setImageResource(R.drawable.unnamed5)
            }

        }
    }
}
