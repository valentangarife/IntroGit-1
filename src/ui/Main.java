package ui; // Paquete de la clase -> la carpeta donde se guarda el archivo 

import model.Person; // Importar clase de otro paquete
import java.util.Scanner;


public class Main{ // Nombre de la clase -> el nombre del archivo 

  // Método -> Método pirncipal del lenguaje -> Método main
  public static void main(String[] args){
  
    Scanner reader = new Scanner(System.in);
    System.out.println("Type a number: "); 
    //int number1 = reader.nextInt();
    
    
    //System.out.println(number1);
  
    // Declaración e inicialización de la variable
    // Tipo de dato nombreVariable = valor;
    int a = 10;
    System.out.println(a); 
    
    // Tipo de dato (Clase) | NombreVariable = new -> (Llamado al método constructor de la clase) 
    Person persona1 = new Person(20, "Persona1", 60, 1.60); 
    
    String nombre = persona1.getName();
    
    System.out.println(nombre);
    
    System.out.println(persona1.getImc());
    System.out.println(persona1.getImc(50, 1.70)); 
  
  } // Cierro el método main
  
  
  
} // Cierro la clase Main
