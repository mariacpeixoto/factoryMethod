//Classe que representa um produto concreto espec�fico (Gol) que estende a classe Carro.
public class ConcreteProductGol extends Car {
	
	//Define os atributos espec�ficos do carro Gol e exibe suas informa��es.
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setCategory("Batch");
		this.setFactory("Volks");
		this.showInformation();
	}
}
