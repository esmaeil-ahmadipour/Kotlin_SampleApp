package ir.ea2.kotlin_sampleapp


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import ir.ea2.kotlin_sampleapp.adapter.TabLayoutViewPagerAdapter
import ir.ea2.kotlin_sampleapp.util.getUsers
import kotlinx.android.synthetic.main.fragment_home.*
class HomeFragment : Fragment() {

companion object{
    fun newInstance()=HomeFragment()
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupTabLayout(view.context)
    }
   fun setupTabLayout(context: Context){
       fr_home_viewpager.adapter=TabLayoutViewPagerAdapter(childFragmentManager)
       fr_home_tablayout.setupWithViewPager(fr_home_viewpager)
       fr_home_tablayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
           override fun onTabReselected(p0: TabLayout.Tab?) {
               //To change body of created functions use File | Settings | File Templates.

           }

           override fun onTabUnselected(p0: TabLayout.Tab?) {
               //To change body of created functions use File | Settings | File Templates.

           }

           override fun onTabSelected(p0: TabLayout.Tab?) {
               //To change body of created functions use File | Settings | File Templates.
               UserListFragment.list.clear()
               if(p0?.position==0){
                   UserListFragment.list=
                       getUsers(context).filter {  it.category.name.equals("Man")}.toMutableList()
               }else if(p0?.position==1){
                   UserListFragment.list=
                       getUsers(context).filter {  it.category.name.equals("Woman")}.toMutableList()
               }
               UserListFragment.recyclerViewAdapter.updateItems()
           }
       })
   }
}
