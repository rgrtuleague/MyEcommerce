package com.example.myecommerce

import android.os.Bundle
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myecommerce.model.Product
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.coroutines.*
import java.net.URL

class MainFragment : Fragment() {

 /**   suspend fun getProducts() : Int = coroutineScope {
            val json = async {URL("https://finepointmobile.com/data/products.json").readText()}
            d("sergio", json.await())
           /* val products = async {Gson().fromJson(json, Array<Product>::class.java).toList()}
            products.await()*/
        val result = async{5}
        result.await()
    }
*/
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)



   /**    val products = runBlocking {
           launch {
               getProducts()
           }
       }
*/
        root.recycle_view.apply {
            layoutManager = GridLayoutManager(activity, 2)
           // adapter = ProductsAdapter(products)
        }

        return root
    }
}
