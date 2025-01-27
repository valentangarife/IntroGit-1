package model; 

import java.lang.Math; 

public class Person {

  // Declarar una variable
  // Atributo de la Clase
  private int age;
  private String name;
  private double weight; 
  private double height; 
  
  // método (Función) -> Especial -> Constructor 
  public Person(int age1, String name1, double weight, double height){
    // inicializar las variables de la clase 
    // Atributos de una Clase 
    this.age = age1; 
    this.name = name1; 
    this.weight = weight;
    this.height = height; 
    
  }
  
  // Método -> Visivilidad, El tipo de retorno, Nombre del Método
  public String getName(){
    return this.name;
  }

  public String getImc(){
    String msj = "El IMC de la persona es: " + (weight/Math.pow(height, 2));
    return msj; 
  }
  
  public String getImc(double w, double h){
    return "IMC: " + (w / Math.pow(h,2) );
  }
  
}
