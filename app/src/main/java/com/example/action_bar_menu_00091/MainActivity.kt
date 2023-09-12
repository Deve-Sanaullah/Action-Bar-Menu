package com.example.action_bar_menu_00091

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "Sanaullah"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add -> {
                Toast.makeText(this, "Add Contact", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.fav -> {
                Toast.makeText(this, "Favourites", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.instagram-> {
                Toast.makeText(this, "Instagram", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.settings-> {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.whatsapp-> {
                Toast.makeText(this, "WhatsApp", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.share-> {
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.exit-> {
                Toast.makeText(this,"Exit", Toast.LENGTH_SHORT).show()
                return true
            } else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}