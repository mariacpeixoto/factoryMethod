//Classe abstrata que representa um criador de carros.
public abstract class CarCreator {
	//Método responsável por construir um carro. O carro é criado através do método factoryMethod() 
	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	//Método de fábrica abstrato para criar um carro.
	protected abstract Car factoryMethod();
}
