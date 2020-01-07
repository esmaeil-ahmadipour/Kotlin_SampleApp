package ir.ea2.kotlin_sampleapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ea2.kotlin_sampleapp.R
import ir.ea2.kotlin_sampleapp.UserListFragment
import ir.ea2.kotlin_sampleapp.model.User
import kotlinx.android.synthetic.main.user_item_layout.view.*

class RecyclerViewAdapter(var userList:List<User> ):RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder>(){

    class myViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        //To change body of created functions use File | Settings | File Templates.
        val view=LayoutInflater.from(parent.context).inflate(R.layout.user_item_layout,parent,false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        //To change body of created functions use File | Settings | File Templates.
        return userList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        //To change body of created functions use File | Settings | File Templates.
        holder.itemView.layout_user_txt_name.text="name: ".plus(userList[position].name )
        holder.itemView.layout_user_txt_age.text="age: ".plus(userList[position].age )

        Glide.with(holder.itemView).load(userList[position].image).into(holder.itemView.layout_user_img_user)

    }
    fun updateItems(){
        userList=UserListFragment.list
        notifyDataSetChanged()
    }
}