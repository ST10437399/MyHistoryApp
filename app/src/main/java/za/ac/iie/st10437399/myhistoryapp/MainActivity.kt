package za.ac.iie.st10437399.myhistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Declarations */

        val BackButton = findViewById<Button>(R.id.BackButton)
        val EnterButton = findViewById<Button>(R.id.EnterButton)
        val NumTextNumber = findViewById<EditText>(R.id.EditAge)
        val ResultTextView = findViewById<TextView>(R.id.ResultTextView)
        EnterButton.setOnClickListener {

            /* if else statement */
            val age = NumTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                ResultTextView.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    ResultTextView.text = "please enter a valid age between 20 to 100"
                    NumTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                       44 -> "Mary,Queen of Scots the only daughter of the late james V of the ruling stewart dynasty"
                       90 -> "Desmond Tutu was a South African archbishop best known for his opposition to apartheid in South Africa,for which he received the Nobel Prize for Peace in 1984"
                       74 -> "Muhammad Ali was one of the greatest boxers in history,the first fighter to win the world heavyweight championship on three separate occasions"
                       81 -> "Queen Victoria An Intimate Biography of the Woman who Ruled an Empire by Australian author and journalist Julia Baird"
                       51 -> "Alfred the Great his valiant defence of his kingdom against a stronger enemy, for securing peace with the Vikings and for his farsighted reforms in the reconstruction of Wessex and beyond."
                       39 -> "Cleopatra  supported advancements in science and medicine And her relationships with Julius Caesar and Mark Antony."
                       30 -> "Sylvia Plath was an American writer whose best-known works, including the poems “Daddy” and “Lady Lazarus"
                       95 -> "Nelson Mandela was successfully leading the resistance to South Africa's policy of apartheid in the 20th century, during which he was infamously incarcerated at Robbin Island Prison (1964–82)."
                       51 -> "Napoleon Bonaparte was one of the most successful generals of the French revolutionary armies. He was emperor of France from 1804-14, and in 1815."
                       55 -> "Elizabeth Wood ville Queen of England from her marriage to King Edward IV"

                        else -> "Sorry,Age not matched,try a different one !"

                    }
                    ResultTextView.text = result

                }
            }
            BackButton.setOnClickListener {
                NumTextNumber.text.clear()
                ResultTextView.text = ""
            }



        }



    }







}





