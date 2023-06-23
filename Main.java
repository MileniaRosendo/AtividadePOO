import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Animal>  animais  = new ArrayList<>();
        Scanner leia = new Scanner (System.in);
        Zoologico zoologico = new Zoologico();
        boolean continuar = true; 
        while (continuar) {
            String respostaUsuario;
            System.out.println("Bem vindo ao zoologico! Selecione a operacao que deseja realizar: 1 - Inserir animais,  2 - Remover animais e 3 - Para sair do Zoo.  ");
            respostaUsuario = leia.nextLine();

            switch (respostaUsuario) {
                case "1":
                    zoologico.inserirAnimais();
                    break;
                case"2":
                    zoologico.removerAnimal();
                    break;
                case "3":
                    continuar = false; 
                    System.out.println("Obrigada por visitar o zoo! ");
                    break;    
                default:
                    break;
            }
        }
    }
}
