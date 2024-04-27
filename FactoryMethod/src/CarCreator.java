//Classe abstrata que representa um criador de carros.
public abstract class CarCreator {
	//M�todo respons�vel por construir um carro. O carro � criado atrav�s do m�todo factoryMethod() 
	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	//M�todo de f�brica abstrato para criar um carro.
	protected abstract Car factoryMethod();
}
