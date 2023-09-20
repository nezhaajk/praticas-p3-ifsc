package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
	
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Rex");
        cachorro.setCor("Branco");
        cachorro.setRaca("Labrador");
        cachorro.setComprimento(20f);
        cachorro.setEcossistema("Casa");
        cachorro.setNumeroPatas(4);

		        
		Gato gato = new Gato();
		gato.setNome("Lua");
        gato.setCor("Cinza");
        gato.setRaca("Siamês");
        gato.setComprimento(14f);
        gato.setEcossistema("Casa");
        gato.setNumeroPatas(4);


        
		   
		System.out.println("Informações sobre o Cachorro:");
		System.out.println("Comprimento: " + cachorro.getComprimento() + " cm");
		System.out.println("Número de Patas: " + cachorro.getNumeroPatas());
		System.out.println("Cor: " + cachorro.getCor());
		System.out.println("Ecossistema: " + cachorro.getEcossistema());
		System.out.println("Raça: " + cachorro.getRaca());
		gato.caminha();
		cachorro.late();
		
		        
		System.out.println("\nInformações sobre o Gato:");
		System.out.println("Comprimento: " + gato.getComprimento() + " cm");
		System.out.println("Número de Patas: " + gato.getNumeroPatas());
		System.out.println("Cor: " + gato.getCor());
		System.out.println("Ecossistema: " + gato.getEcossistema());
		System.out.println("Raça: " + gato.getRaca());
		gato.caminha();
		gato.mia();
		
		    }
		

}