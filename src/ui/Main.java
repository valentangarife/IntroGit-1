package ui; // Paquete de la clase -> la carpeta donde se guarda el archivo 

// Importar clase de otro paquete
import model.PersonController;
import java.util.Scanner;


public class Main { // Nombre de la clase -> el nombre del archivo 
	
	

  // Método -> Método pirncipal del lenguaje -> Método main
  public static void main(String[] args){
  	System.out.println("Inicio del programa");
  	PersonController controller = new PersonController(); 
  	
  	controller.addPerson(20, "Name1", 50, 1.60); 
  	controller.addPerson(30, "Name2", 60, 1.70); 
  	
  	// NO SE PUEDE 
  	// controller.getEmptyPosition(); 
  	
  	System.out.println( controller.getPeople()[1] ); 
  	
  	controller.deletePerson("Name2");
  	System.out.println( controller.getPeople()[1] ); 
  	
  	
  	System.out.println( controller.searchPerson("Name1") ); 
    
  	System.out.println("Fin del programa");
  } // Cierro el método main
  
  
  
} // Cierro la clase Main


// Notas anteriores: 

/**
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
    System.out.println("Nombre actual: " + nombre);
    
    persona1.setName("Hola"); 
    
    nombre = persona1.getName();
    System.out.println("Nuevo nombre: " + nombre);
    
    
    PersonController controller = new PersonController(persona1); 
    System.out.println(controller); 
    
    System.out.println(persona1.getImc());
    System.out.println(persona1.getImc(50, 1.70)); 
*/
