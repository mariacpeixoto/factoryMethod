//Classe que representa um criador concreto de carros da Fiat, estendendo a classe CarCreator.
public class FiatConcreteCreator extends CarCreator {
	
	//M�todo de f�brica que cria um produto concreto Palio da Fiat.
	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
