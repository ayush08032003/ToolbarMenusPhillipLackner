package com.ayushwalker.toolbarmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

/*
HOW TO ADD MENU BY CREATING THE ANDROID XML FILE
Step 1: app -> res-> right click on res -> New -> Android Resource Directory -> Resource Type: menu -> OK
Step 2: Right CLick on menu directory -> New -> Menu Resource File -> Named it: -> OK
Step 3: Add icons in drawable folder using New -> Image Asset, and you r good to go..!

 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // this function is for implementing our menu which we created..!! ( this is enough for displaying our Menu)
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true // this true represents that we successfully display our Menu..
    }

    // Detects onclick events on our Menu buttons
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miAddContact -> Toast.makeText(this,"You Clicked on Add Contact", Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
            R.id.miFavourite -> Toast.makeText(this,"You Clicked on Favourite", Toast.LENGTH_SHORT).show()
            R.id.miFeedBack -> Toast.makeText(this,"You Clicked on Feedback", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this,"You Clicked on Settings", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}