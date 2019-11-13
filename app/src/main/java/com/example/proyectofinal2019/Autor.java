package com.example.proyectofinal2019;

public class Autor {
    String nombreAutor;
    String comentarioAutor;

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

    public Autor(String nombreAutor, String comentarioAutor) {
        this.nombreAutor = nombreAutor;
        this.comentarioAutor = comentarioAutor;


    }

}
