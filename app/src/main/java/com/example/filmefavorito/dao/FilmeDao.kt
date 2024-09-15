package com.example.filmefavorito.dao

import com.example.filmefavorito.model.Filme

interface FilmeDao {
    fun adicionarFilme(titulo: Filme, diretor: Filme)
    fun obterFilmes():List<Filme>

}