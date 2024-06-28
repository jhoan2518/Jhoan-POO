/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleres_poo.taller1;

/**
 *
 * @author jhoan
 */
public class Notas {
    private String NombreDelCurso;

    public String getNombreDelCurso() {
        return NombreDelCurso;
    }

    public void setNombreDelCurso(String NombreDelCurso) {
        this.NombreDelCurso = NombreDelCurso;
    }
    public Notas(String name){}
    public String displayMessage(){return "bienvenido a las notas del curso, el nombre del curso es: " + getNombreDelCurso();}

    
    }
    
     