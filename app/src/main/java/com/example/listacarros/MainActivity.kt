package com.example.listacarros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listacarros.Adapter.AdapterCarro
import com.example.listacarros.databinding.ActivityMainBinding
import com.example.listacarros.modelo.Carro

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar!!.hide()

//        val recyclerviewCarros = findViewById<RecyclerView>(R.id.recyclerView_carros)
//        recyclerviewCarros.layoutManager = LinearLayoutManager(this)
//        recyclerviewCarros.setHasFixedSize(true)

        val listaCarros: List<Carro> = listOf(
            Carro(
                R.drawable.evo,
                "Lancer Evolution VII",
                "Motor: 4G63",
                R.drawable.mitsubishi
            ),
            Carro(
                R.drawable.sti,
                "Impreza WRX STI",
                "Motor: EJ25",
                R.drawable.subaru
            ),
            Carro(
                R.drawable.miata,
                "Miata MX-5",
                "Motor: B6ZE",
                R.drawable.mazda
            ),
            Carro(
                R.drawable.rx7,
                "RX-7 Savanna",
                "Motor: 13B Rotary",
                R.drawable.mazda
            ),
            Carro(
                R.drawable.ek9,
                "Civic EK9",
                "Motor: B16B",
                R.drawable.honda
            ),
            Carro(
                R.drawable.nsx,
                "NSX",
                "Motor: C30A",
                R.drawable.honda
            ),
            Carro(
                R.drawable.n350z,
                "350Z",
                "Motor: VQ35DE",
                R.drawable.nissan
            ),
            Carro(
                R.drawable.skyline,
                "Skyline GTR-R34",
                "Motor: RB26DETT",
                R.drawable.nissan
            ),
            Carro(
                R.drawable.ae86,
                "Trueno AE86",
                "Motor: 4AGE",
                R.drawable.toyota
            ),
            Carro(
                R.drawable.supra,
                "Supra RZ",
                "Motor: 2JZ-GTE",
                R.drawable.toyota
            )
        )
        binding.recyclerViewCarros.adapter = AdapterCarro(listaCarros)
    }
}