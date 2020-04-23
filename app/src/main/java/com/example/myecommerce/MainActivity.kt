package com.example.myecommerce

import android.os.Bundle
import android.util.Log.d
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myecommerce.model.Product
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.actionHome -> d("sergio", "Going home")
                R.id.actionJeans -> d("sergio", "jeans was pressed")
                R.id.actionShorts -> d("sergio", "shorts was pressed")
                R.id.actionSocks -> d("sergio", "socks was pressed")
            }
            it.isChecked = true
            drawerLayout.closeDrawers()
           
            true
        }

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp)
        }

        val products = arrayListOf<Product>()

        for (i in 0..100) {
            products.add(
                Product(
                    "Dress Shirt #$i",
                    "http://via.placeholder.com/350/ffff00/ff0000",
                    1.09
                )
            )
        }

        recycle_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = ProductsAdapter(products)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        drawerLayout.openDrawer(GravityCompat.START)
        return true
        //return super.onOptionsItemSelected(item)
    }

}
