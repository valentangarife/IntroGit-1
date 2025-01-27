package model; 

public class Person {

  // Declarar una variable
  private int age;
  private String name;
  
  // método (Función) -> Especial -> Constructor 
  public Person(int age1, String name1){
    // inicializar las variables de la clase 
    // Atributos de una Clase 
    this.age = age1; 
    this.name = name1; 
    
  }
  
  // Método -> Visivilidad, El tipo de retorno, Nombre del Método
  public String getName(){
    return this.name;
  }

  
}
