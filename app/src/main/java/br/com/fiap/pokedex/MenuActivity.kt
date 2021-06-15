package br.com.fiap.pokedex


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.pokedex.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btSearch.setOnClickListener {
            val intent = Intent(this@MenuActivity, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btPokedex.setOnClickListener {
            val intent = Intent(this@MenuActivity, PokedexPagerActivity::class.java)
            startActivity(intent)
        }
    }
}