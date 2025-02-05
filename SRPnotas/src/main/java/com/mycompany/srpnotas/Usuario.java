package com.mycompany.srpnotas;

public class Usuario {
    public String Nombre;
    public double Nota;
    public boolean Sexo;

    public Usuario(String Nombre, double Nota, boolean Sexo) {
        this.Nombre = Nombre;
        this.Nota = Nota;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public boolean getSexo() {
        return Sexo;
    }

    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
