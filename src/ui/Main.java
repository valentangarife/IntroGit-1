package ui; // Paquete de la clase -> la carpeta donde se guarda el archivo 

import model.Person; 

public class Main{ // Nombre de la clase -> el nombre del archivo 

  // Método -> Método pirncipal del lenguaje -> Método main
  public static void main(String[] args){
  
    // Declaración e inicialización de la variable
    int a = 10;
    System.out.println(a); 
    
    Person persona1 = new Person(20, "Persona1"); 
    
    String nombre = persona1.getName();
    
    System.out.println(nombre);
  
  } // Cierro el método main
  
  
  
} // Cierro la clase Main
