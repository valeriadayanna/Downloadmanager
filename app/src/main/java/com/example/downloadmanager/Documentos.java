package com.example.downloadmanager;

import java.io.Serializable;

public class Documentos implements Serializable {
    String id, titulo, documento;
    public Documentos(){}

    public Documentos(String id, String titulo, String documento) {
        this.id = id;
        this.titulo = titulo;
        this.documento = documento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
