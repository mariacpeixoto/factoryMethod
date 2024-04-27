//Classe abstrata que representa um carro.
public abstract class Car {
	private String model;
	private String factory;
	private String category;
	
	//Método para exibir as informações do carro.
	public void showInformation() {
		System.out.println("Model:" + this.getModel()+ "\nFactory:" + this.getFactory() + "\nCategory: " + this.getCategory());
	}
	
	//Métodos para obter as informações do carro.
	public String getModel() {
		return model;
	}
	
	public void setModel (String model) {
		this.model = model;
	}
	
	public String getFactory() {
		return factory;
	}
	
	public void setFactory(String factory) {
		this.factory = factory;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
}
