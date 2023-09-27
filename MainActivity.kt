package co.ls.animalsoundsimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var recyclerViewAnimalsAdapters : RecyclerViewAnimalsAdapters? = null
    private var animalList = mutableListOf<Animals>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvAnimalList) as RecyclerView
        recyclerViewAnimalsAdapters = RecyclerViewAnimalsAdapters(this@MainActivity, animalList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewAnimalsAdapters

        prepareAnimalListData()
    }

    private fun prepareAnimalListData() {
        var animals = Animals("Ape", R.drawable.letter_a,"a")
        animalList.add(animals)
           animals = Animals("Bear", R.drawable.letter_b, "b")
           animalList.add(animals)
        animals = Animals("Cat", R.drawable.letter_c, "c")
        animalList.add(animals)
        animals = Animals("Dog", R.drawable.letter_d, "d")
        animalList.add(animals)
        animals = Animals("Elephant", R.drawable.letter_e,"e")
        animalList.add(animals)
        animals = Animals("Falcon", R.drawable.letter_f, "f")
        animalList.add(animals)
        animals = Animals("Gibbon", R.drawable.letter_g, "g")
        animalList.add(animals)
        animals = Animals("Horse", R.drawable.letter_h, "h")
        animalList.add(animals)
        animals = Animals("Iguana", R.drawable.letter_i, "i")
        animalList.add(animals)
        animals = Animals("Jaguar", R.drawable.letter_j, "j")
        animalList.add(animals)
        animals = Animals("Killer Whale", R.drawable.letter_k, "k")
        animalList.add(animals)
        animals = Animals("Leopard", R.drawable.letter_l, "l")
        animalList.add(animals)
        animals = Animals("Mouse", R.drawable.letter_m, "m")
        animalList.add(animals)
        animals = Animals("NightHawk", R.drawable.letter_n, "n")
        animalList.add(animals)
        animals = Animals("Ostrich", R.drawable.letter_o, "o")
        animalList.add(animals)
        animals = Animals("Pig", R.drawable.letter_p, "p")
        animalList.add(animals)
        animals = Animals("Quail", R.drawable.letter_q, "q")
        animalList.add(animals)
        animals = Animals("Rhinoceros", R.drawable.letter_r, "r")
        animalList.add(animals)
        animals = Animals("Sheep", R.drawable.letter_s, "s")
        animalList.add(animals)
        animals = Animals("Tiger", R.drawable.letter_t, "t")
        animalList.add(animals)
        animals = Animals("Ugandan Kob", R.drawable.letter_u, "u")
        animalList.add(animals)
        animals = Animals("Vulture", R.drawable.letter_v, "v")
        animalList.add(animals)
        animals = Animals("Wolf", R.drawable.letter_w, "w")
        animalList.add(animals)
        animals = Animals("Xantus Hummingbird", R.drawable.letter_x, "x")
        animalList.add(animals)
        animals = Animals("Yak", R.drawable.letter_y, "y")
        animalList.add(animals)
        animals = Animals("Zebra", R.drawable.letter_z, "z")
        animalList.add(animals)


        recyclerViewAnimalsAdapters!!.notifyDataSetChanged()
    }
}