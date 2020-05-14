package com.example.projectrs2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectrs2.models.ListaDulce
import kotlinx.android.synthetic.main.dulce_list_item.view.*

class DulceAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<ListaDulce> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                 return DulceViewHolder(
                  LayoutInflater.from(parent.context).inflate(R.layout.dulce_list_item,parent, false)
                 )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                 when(holder){

                     is DulceViewHolder ->{
                         holder.bind(items.get(position))
                     }
                 }
    }
    override fun getItemCount(): Int {
          return items.size
    }
    fun submitList(dulceList: List<ListaDulce>){
        items = dulceList

    }

    class DulceViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){

        val dulceimage = itemView.dulce_image
        val dulcetitle = itemView.dulce_title
        val dulcename = itemView.dulce_name
fun bind(ListaDulce: ListaDulce){

    dulcetitle.setText(ListaDulce.title)
    dulcename.setText(ListaDulce.username)

    val requestOptions = RequestOptions()
        .placeholder(R.drawable.ic_launcher_background)
        .error(R.drawable.ic_launcher_background)

     Glide.with(itemView.context)
          .applyDefaultRequestOptions(requestOptions)
          .load(ListaDulce.image)
          .into(dulceimage)
}
    }

}