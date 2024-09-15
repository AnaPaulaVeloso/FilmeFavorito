package com.example.filmefavorito

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmefavorito.model.Filme


class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            var filmes = mutableListOf<Filme>()
            filmesF = FilmeFavorito(filmes)


            val recyclerView = findViewById<RecyclerView>(R.id.rv_filmes)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = filmesF


            val novaListaDeFilmes = listOf(
                Filme("Filme 1", "Diretor 1"),
                Filme("Filme 2", "Diretor 2")
            )

            // Atualizando a lista no adaptador
            filmesF.setFilmes(novaListaDeFilmes)
        }
    }
    }
}
