package ifsc;

import java.util.ArrayList;

public class MainProduto {
	
	public static void main(String[] args) {
        ArrayList<Desktop> desktops = new ArrayList<>();
        ArrayList<Smartphone> smartphones = new ArrayList<>();

        Desktop desktop1 = new Desktop();
        desktop1.setNome("Desktop 1");
        desktop1.setPreco(999.99);
        desktop1.setMarca("Dell");
        desktops.add(desktop1);

        Desktop desktop2 = new Desktop();
        desktop2.setNome("Desktop 2");
        desktop2.setPreco(799.99);
        desktop2.setMarca("HP");
        desktops.add(desktop2);

        Desktop desktop3 = new Desktop();
        desktop3.setNome("Desktop 3");
        desktop3.setPreco(1350.90);
        desktop3.setMarca("Lenovo");
        desktops.add(desktop3);

        Smartphone smartphone1 = new Smartphone();
        smartphone1.setNome("Smartphone 1");
        smartphone1.setPreco(650.99);
        smartphone1.setSistemaOperacional("Android");
        smartphones.add(smartphone1);

        Smartphone smartphone2 = new Smartphone();
        smartphone2.setNome("Smartphone 2");
        smartphone2.setPreco(799.99);
        smartphone2.setSistemaOperacional("iOS");
        smartphones.add(smartphone2);

        Smartphone smartphone3 = new Smartphone();
        smartphone3.setNome("Smartphone 3");
        smartphone3.setPreco(495.99);
        smartphone3.setSistemaOperacional("Android");
        smartphones.add(smartphone3);

        System.out.println("Desktops:");
        for (Desktop desktop : desktops) {
            System.out.println("Nome: " + desktop.getNome() + ", Preço: " + desktop.getPreco() + ", Marca: " + desktop.getMarca());
        }

        System.out.println("\nSmartphones:");
        for (Smartphone smartphone : smartphones) {
            System.out.println("Nome: " + smartphone.getNome() + ", Preço: " + smartphone.getPreco() + ", SO: " + smartphone.getSistemaOperacional());
        }
    }
}


