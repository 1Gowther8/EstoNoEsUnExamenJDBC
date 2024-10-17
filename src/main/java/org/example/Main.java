package org.example;

import org.example.dao.JdbcUtils;
import org.example.dao.PeliculaDAO;
import org.example.model.Pelicula;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        new PeliculaDAO(JdbcUtils.getConnection()).filtrarPorAños(2000,2010);
        System.out.println("Peliculas filtradas por años 2000-2010");

        new PeliculaDAO(JdbcUtils.getConnection()).contarPeliculas();
       

        new PeliculaDAO(JdbcUtils.getConnection()).save(new Pelicula(
                "El señor de los anillos",2003,"Fantasia"));



    }
}