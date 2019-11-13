package com.example.proyectofinal2019;

import java.io.Serializable;

public class Dto implements Serializable {
    //Datos del Autor
    String nombreAutor;
    String comentarioAutor;

    //Datos de la categoria
    String nombreCategoria;
    String comentarioCategoria;

    //Datos del Himnario
    String titulo;
    String Letra;

    public Dto() {
    }

    public Dto(String nombreAutor, String comentarioAutor, String nombreCategoria, String comentarioCategoria, String titulo, String letra) {
        this.nombreAutor = nombreAutor;
        this.comentarioAutor = comentarioAutor;
        this.nombreCategoria = nombreCategoria;
        this.comentarioCategoria = comentarioCategoria;
        this.titulo = titulo;
        Letra = letra;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getComentarioAutor() {
        return comentarioAutor;
    }

    public void setComentarioAutor(String comentarioAutor) {
        this.comentarioAutor = comentarioAutor;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getComentarioCategoria() {
        return comentarioCategoria;
    }

    public void setComentarioCategoria(String comentarioCategoria) {
        this.comentarioCategoria = comentarioCategoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String letra) {
        Letra = letra;
    }
}
