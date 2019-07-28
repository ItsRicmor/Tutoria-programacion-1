package app.class_object;

class Person {
	
  // Atributos
  // Tipo de acceso - Tipo de dato - nombre de atributo
  private String name;
  private String lastName;
  
  // Constructor
  Person( String name, String lastName ) {
  	this.name = name;
    this.lastName = lastName;
  }
  
  // Getters y Setters
  // Tipo de acceso - Tipo de dato de retorno - nombre de metodo
  public String getName() {
  	return this.name;
  }
  
  public void setName( String name ) {
  	this.name = name;
  }
  
  public String getLastName() {
  	return this.lastName;
  }
  
  public void setLastName( String lastName ) {
  	this.lastName = lastName;
  }
  
}