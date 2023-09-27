package co.ls.animalsoundsimage
import android.content.res.Resources
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.coroutines.internal.synchronized
import kotlinx.coroutines.runBlocking

class RecyclerViewAnimalsAdapters constructor(
    private val getActivity: MainActivity,
    private val animalList: List<Animals>) :
        RecyclerView.Adapter<RecyclerViewAnimalsAdapters.MyViewHolder>() {
    var music: MediaPlayer? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAnimalsAdapters.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_animal_list_item, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAnimalsAdapters.MyViewHolder, position: Int) {
        holder.tvAnimalTitle.text = animalList[position].title
        holder.ivAnimalImg.setImageResource(animalList[position].image)
        holder.cardView.setOnClickListener {
            //  Toast.makeText(getActivity, animalList[position].title, Toast.LENGTH_LONG).show()
            runBlocking {
                if (music!=null) {
                    if (music!!.isPlaying) {
                        music?.stop()
                    }
                }

                val resID = getActivity.resources.getIdentifier(
                    animalList[position].audio,
                    "raw",
                    getActivity.packageName
                )
                if (resID != null && resID != 0) {
                    music = MediaPlayer.create(getActivity, resID)
                }
//                if (music.isPlaying ()) {
//                    if (music != null){
//                        music.stop ();
//                    }
//                } else if (music != null) {
//                    music.start ();
//                }

                if (music != null) {
                    music?.start()
               } else {
                   Toast.makeText(getActivity, "Something went wrong", Toast.LENGTH_SHORT).show()
               }


            }
        }
    }

    override fun getItemCount(): Int {
       return animalList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvAnimalTitle : TextView = itemView.findViewById(R.id.tvAnimalTitle)
        val ivAnimalImg : ImageView = itemView.findViewById(R.id.ivAnimalImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)


    }
}













