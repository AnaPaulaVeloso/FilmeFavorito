package com.example.filmefavorito.dao

import com.example.filmefavorito.model.Filme

class FilmeDaoImp:FilmeDao {
    companion object{
        private val filmes = mutableListOf<Filme>()
    }

    override fun adicionarFilme(titulo: Filme, diretor: Filme) {
        Companion.filmes.add(titulo)
        Companion.filmes.add(diretor)
    }

    override fun obterFilmes(): List<Filme> {
        return Companion.filmes
    }
}