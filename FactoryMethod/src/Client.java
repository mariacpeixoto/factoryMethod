//Classe que representa um cliente que utiliza os criadores de carros concretos.
public class Client {
	public static void main(String[] args) {
		//Cria um criador de carros concreto da Fiat
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		
		//Cria um criador de carros concreto da Volkswagen
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}
}
