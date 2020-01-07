package ir.ea2.kotlin_sampleapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ir.ea2.kotlin_sampleapp.adapter.RecyclerViewAdapter
import ir.ea2.kotlin_sampleapp.model.User
import ir.ea2.kotlin_sampleapp.util.getUsers
import kotlinx.android.synthetic.main.fragment_list_user.*

class UserListFragment : Fragment(){
    companion object{
        fun newInstance()=UserListFragment()
        lateinit var list: MutableList<User>
        val recyclerViewAdapter:RecyclerViewAdapter by lazy { RecyclerViewAdapter (list)}
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list_user , container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView(view.context)
    }
    private fun setupRecyclerView(context: Context){
        list= getUsers(context).filter {  it.category.name.equals("Man")}.toMutableList()
        fr_rv.layoutManager=LinearLayoutManager(context)
        fr_rv.adapter= recyclerViewAdapter
    }
}