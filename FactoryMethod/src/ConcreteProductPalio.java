//Classe que representa um produto concreto específico (Palio) que estende a classe Carro.
public class ConcreteProductPalio extends Car {
	
	//Define os atributos específicos do carro Palio e exibe suas informações.
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setCategory("Batch");
		this.setFactory("Fiat");
		this.showInformation();
	}
}
