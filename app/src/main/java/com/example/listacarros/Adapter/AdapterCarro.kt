package com.example.listacarros.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listacarros.databinding.ActivityMainBinding
import com.example.listacarros.databinding.ContainerCarroBinding
import com.example.listacarros.modelo.Carro

class AdapterCarro(val listaCarros: List<Carro>): RecyclerView.Adapter<AdapterCarro.CarroViewHolder>() {

    class CarroViewHolder(val binding: ContainerCarroBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        val binding =
            ContainerCarroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarroViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        with(holder) {
            with(listaCarros[position]) {
                binding.nomeCarro.text = nome
                binding.motorCarro.text = motor
                binding.fotoCarro.setImageResource(foto)
                binding.fabricanteCarro.setImageResource(fabricante)
            }
        }
    }

    override fun getItemCount(): Int = listaCarros.size
}

//class AdapterCarro(private val context: Context, private val carros: MutableList<Carro>): RecyclerView.Adapter<AdapterCarro.CarroViewHolder>() {
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
//        val carroLista = LayoutInflater.from(context).inflate(R.layout.container_carro,parent,false)
//        val holder = CarroViewHolder(carroLista)
//        return holder
//    }
//
//    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
//        holder.foto.setImageResource(carros[position].foto)
//        holder.nome.text = carros[position].nome
//        holder.motor.text = carros[position].motor
//        holder.fabricante.setImageResource(carros[position].fabricante)
//    }
//
//    override fun getItemCount(): Int = carros.size
//
//    inner class CarroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val foto = itemView.findViewById<ImageView>(R.id.fotoCarro)
//        val nome = itemView.findViewById<TextView>(R.id.nomeCarro)
//        val motor = itemView.findViewById<TextView>(R.id.motorCarro)
//        val fabricante = itemView.findViewById<ImageView>(R.id.fabricanteCarro)
//    }
//}