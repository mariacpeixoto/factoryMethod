//Classe que representa um produto concreto espec�fico (Palio) que estende a classe Carro.
public class ConcreteProductPalio extends Car {
	
	//Define os atributos espec�ficos do carro Palio e exibe suas informa��es.
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setCategory("Batch");
		this.setFactory("Fiat");
		this.showInformation();
	}
}
