package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
	
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setNumeroRodas(4);
		veiculo1.setFabricante("Toyota");
		veiculo1.setCor("Azul");
		veiculos.add(veiculo1);

		Veiculo veiculo2 = new Veiculo();
		veiculo2.setNumeroRodas(2);
		veiculo2.setFabricante("Honda");
		veiculo2.setCor("Preto");
		veiculos.add(veiculo2);

		Veiculo veiculo3 = new Veiculo();
		veiculo3.setNumeroRodas(4);
	    veiculo3.setFabricante("Ford");
		veiculo3.setCor("Prata");
		veiculos.add(veiculo3);


		for(Veiculo veiculo : veiculos) {
			System.out.println("Número de Rodas: " + veiculo.getNumeroRodas());
            System.out.println("Fabricante: " + veiculo.getFabricante());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println();
		}
		
		    }
}


