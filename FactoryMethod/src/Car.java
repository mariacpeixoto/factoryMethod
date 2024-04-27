//Classe abstrata que representa um carro.
public abstract class Car {
	private String model;
	private String factory;
	private String category;
	
	//M�todo para exibir as informa��es do carro.
	public void showInformation() {
		System.out.println("Model:" + this.getModel()+ "\nFactory:" + this.getFactory() + "\nCategory: " + this.getCategory());
	}
	
	//M�todos para obter as informa��es do carro.
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
