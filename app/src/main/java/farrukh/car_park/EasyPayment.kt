package farrukh.car_park

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_easy_payment.*

class EasyPayment : AppCompatActivity() {
    var tag = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy_payment)
        supportActionBar?.hide()

        user.setOnClickListener{
            tag = user.tag.toString()
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("user_tag",tag)
            startActivity(intent)
        }
        owner.setOnClickListener{
            tag = owner.tag.toString()
            var intent2 = Intent(this,MainActivity::class.java)
            intent2.putExtra("owner_tag",tag)
            startActivity(intent2)
        }
    }
}