package com.mycompany.srpnotas;

import java.util.ArrayList;

public class UsuarioReportes{
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioReportes(ArrayList<Usuario> usuarios) {
        this.usuarios=usuarios;
    }          
    public void consultarNotasSexoM(){
    
        System.out.println("NOTAS USUARIOS MASCULINOS:");
        for (Usuario usuario : usuarios) {
            if(usuario.getSexo()){
                System.out.println("NOMBRE: "+usuario.getNombre()+" NOTA: "+usuario.getNota());
            }   
        }      
    }
    
    public void consultarNotasSexoF(){
        System.out.println("NOTAS USUARIOS FEMENINOS:");
        for (Usuario usuario : usuarios) {
            if(!usuario.getSexo()){
                System.out.println("NOMBRE: "+usuario.getNombre()+" NOTA: "+usuario.getNota());
            }
            
        }   
    }
}
