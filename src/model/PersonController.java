package model; 

public class PersonController {

	// Constante 
	public static final int SIZE = 10; 

	// Visivilidad, Tipo de dato, nombreVariable 
	private Person[] people;
	
	public PersonController(){
		System.out.println("Hola desde el contructor del controllador");
		this.people = new Person[SIZE]; 
	}
	
	public void addPerson(int age1, String name1, double weight, double height){
		Person person = new Person(age1, name1, weight, height); 
		int position = getEmptyPosition(); 
		people[position] = person; 
	}
	
	public Person searchPerson(String name){
		
		Person found = null; 
		boolean isDeleted = false; 
		for(int i = 0; i < SIZE && !isDeleted; i++){
			if(people[i].getName().equals(name)){
				found = people[i]; 
				isDeleted = true; 
			}
		}
		return found;
	}
	
	
	public boolean deletePerson(String name){
		
		boolean isDeleted = false; 
		for(int i = 0; i < SIZE && !isDeleted; i++){
			if(people[i].getName().equals(name)){
				people[i] = null; 
				isDeleted = true; 
			}
		}
		return isDeleted;
	}
	
	private int getEmptyPosition(){ // Abren el método
		int position = 0; 
		boolean isEmpty = false; 
		
		for(int i = 0; i < SIZE && !isEmpty ; i++){ // Abren el ciclo 
			System.out.println("Valor de i: " + i);
		
			if(people[i] == null){ // Abren el if (estructura de control)
				System.out.println("Condición verdadera"); 
				position = i; 
				isEmpty = true; 
			} // cierran el if 
			
		} // cierran el ciclo
		
		System.out.println("Position: " + position);
		return position; 
	} // Cierran el método
	
	
	public Person[] getPeople(){
		return people; 
	}
	
	public String toString(){
		return "Hola desde el toString del controlador"; 
	}



} // Cierre de la clase
