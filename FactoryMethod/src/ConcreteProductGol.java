//Classe que representa um produto concreto específico (Gol) que estende a classe Carro.
public class ConcreteProductGol extends Car {
	
	//Define os atributos específicos do carro Gol e exibe suas informações.
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setCategory("Batch");
		this.setFactory("Volks");
		this.showInformation();
	}
}
