package net.itinajero.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import net.itinajero.doglist.databinding.ItemDogBinding

class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image:String){
        // https://github.com/bumptech/glide
        Glide.with(binding.root.context).load(image).into(binding.ivDog)
    }

}