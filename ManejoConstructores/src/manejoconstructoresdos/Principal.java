/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructoresdos;

/**
 *
 * @author INSPIRON
 */
public class Principal {
  public static void main(String[] args) {
      Ciudad c1 = new Ciudad("Cuenca","Azuay");
      Ciudad c2 = new Ciudad("Quito","Pichincha");
      Ciudad c3 = new Ciudad("Guayaquil","Guayas");
      
      Equipo eq1 = new Equipo ("Deportivo Cuenca", c1);
      Equipo eq2 = new Equipo ("Aucas", c2);
      Equipo eq3 = new Equipo ("Barcelona", c3);
      Equipo eq4 = new Equipo ("Guayaquil City", c3);
      
      Entrenador1 entrenador1 = new Entrenador1("Luis Soler", 59,
      "Fútbol", 9500, eq1);
      Entrenador1 entrenador2 = new Entrenador1("José Shurer", 60,
      "Fútbol", 8500, eq2);
      Entrenador1 entrenador3 = new Entrenador1("Leonardo Ramos", 55,
      "Fútbol", 10500, eq3);
      Entrenador1 entrenador4 = new Entrenador1("Paul Gavilanes", 45,
      "Fútbol", 5500, eq4);  
      
      Entrenador1 [] entrenadores = new Entrenador1[4];
      entrenadores [0] = entrenador1;
      entrenadores [1] = entrenador2;
      entrenadores [2] = entrenador3;
      entrenadores [3] = entrenador4;
      
      OperacionEntrenador operacion = new OperacionEntrenador(entrenadores);
      operacion.establecerPromedioEdades();
      operacion.establecerPromedioSalarios();
      System.out.printf("%s\n", operacion);
      
      /*
      int suma = 0;
      double salario = 0;
      double promedioEdades = 0;
      double promedioSalario = 0;
      
      for (int i= 0; i < entrenadores.length; i++){
        //System.out.printf("%s\n", entrenadores[i]);
      
  }
      /*
      System.out.printf("%s\n", eq1);
      System.out.printf("%s\n", eq2);
      System.out.printf("%s\n", eq3);
      */
  }
}
