package com.example.progmob2023.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob2023.Model.Petani
import com.example.progmob2023.R

class PetaniCVAdapter {
    class PetaniCVAdapter(private val petaniList: List<Petani>) :
        RecyclerView.Adapter<PetaniCVAdapter.PetaniHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.cv_item_petani, parent, false)
            return PetaniHolder(view)
        }

        override fun onBindViewHolder(holder: PetaniHolder, position: Int) {
            holder.bindPetani(petaniList[position])
        }

        override fun getItemCount(): Int {
            return petaniList.size
        }

        class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
            lateinit var txtUser: TextView
            lateinit var txtNama: TextView
            lateinit var txtJumlahLahan: TextView
            lateinit var txtIdentifikasi: TextView
            lateinit var txtTambahLahan: TextView

            fun bindPetani(petani: Petani) {
                itemView.apply {
                    txtUser = findViewById(R.id.txtUserCV) // Adjust the view IDs here
                    txtNama = findViewById(R.id.txtNamaCV) // Adjust the view IDs here
                    txtJumlahLahan = findViewById(R.id.txtJumlahLahanCV) // Adjust the view IDs here
                    txtIdentifikasi = findViewById(R.id.txtIdentifikasiCV) // Adjust the view IDs here
                    txtTambahLahan = findViewById(R.id.txtTambahLahanCV) // Adjust the view IDs here

                    txtUser.text = petani.user
                    txtNama.text = petani.nama
                    txtJumlahLahan.text = petani.jumlahLahan
                    txtIdentifikasi.text = petani.identifikasi
                    txtTambahLahan.text = petani.tambahLahan
                }
            }
        }
    }

}