package farrukh.car_park

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_easy_payment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var tag = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        tag = intent.getStringExtra("user_tag").toString()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        forgot_password.setOnClickListener {
            Toast.makeText(
                this,
                "Is this my fault you failure ? Go and remember",
                Toast.LENGTH_SHORT
            ).show()
            Log.d("aaaa", tag)
        }

        sign_up.setOnClickListener{
            startActivity(Intent(this,Signup_activity::class.java))
        }
        login_button.setOnClickListener{
            startActivity(Intent(this,User_Screen::class.java))
        }
    }
}