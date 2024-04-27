//Classe que representa um criador concreto de carros da Volkswagem, estendendo a classe CarCreator.
public class VolksConcreteCreator extends CarCreator {
	
	//Método de fábrica que cria um produto concreto Gol da Volkswagem.
	protected Car factoryMethod() {
		return new ConcreteProductGol();
	}
}
