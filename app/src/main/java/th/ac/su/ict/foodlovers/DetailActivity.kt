package th.ac.su.ict.foodlovers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val foodName = intent.getStringExtra("foodName")
        val description = intent.getStringExtra("description")
        val imageFile = intent.getStringExtra("imageFile")
        val caption = intent.getStringExtra("caption")





        tvFoodName.setText(foodName)
        tvCaption.setText(caption)
//        tvPrice.setText(price)
        tvDetail.setText(description)

//
//
        val res = resources
        val drawableId:Int = res.getIdentifier(imageFile,"drawable",packageName)

        imgView.setImageResource(drawableId)


    }
}
