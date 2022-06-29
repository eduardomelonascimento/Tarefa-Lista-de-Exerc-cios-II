import java.util.Scanner;

import javax.swing.JOptionPane;

import Immobile.Immobile;
import Immobile.NewImmobile;
import Immobile.OldImmobile;

public class Main {
    public static void main(String[] args) {

        String input = "5";

        while (Integer.parseInt(input) != 1 || Integer.parseInt(input) != 2) {
            input = JOptionPane.showInputDialog("Digite 1 para imóvel novo ou 2 para um imóvel velho");
            String adress = JOptionPane.showInputDialog("Informe o endereço do imóvel");

            if (Integer.parseInt(input) == 1) {
                Double price = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do imóvel"));
                NewImmobile immobile = new NewImmobile(adress, price);
                System.out.println();
                immobile.setAdditionalCost(
                        Double.parseDouble(JOptionPane.showInputDialog("Informe o preço adicional")));
                immobile.setPrice(immobile.getPrice() + immobile.getAdditionalCost());
                JOptionPane.showMessageDialog(null, "Seu imóvel no endereço: " + immobile.getAdress() + "\n"
                        + "Tem um valor de: " + immobile.getPrice() + "R$");
                break;
            } else if (Integer.parseInt(input) == 2) {
                Double price = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do imóvel"));
                OldImmobile immobile = new OldImmobile(adress, price);
                System.out.println();
                immobile.setDiscount(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do desconto")));
                immobile.setPrice(immobile.getPrice() - immobile.getDiscount());
                JOptionPane.showMessageDialog(null, "Seu imóvel no endereço: " + immobile.getAdress() + "\n"
                        + "Tem um valor de: " + immobile.getPrice() + "R$");
                break;
            }
        }
    }
}
