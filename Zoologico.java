import java.util.ArrayList;
import java.util.Scanner;

import org.hamcrest.core.IsInstanceOf;
public class Zoologico{
  private ArrayList<Animal>  animais  = new ArrayList<>(); 
  Scanner leia = new Scanner (System.in);
  

public void listarAnimal(Animal animal){
  
    System.out.println("ID do animal delatado: "+animal.getId());
    System.out.println("Idade do animal deletado: "+animal.getIdade());
    System.out.println("Peso do animal deletado: "+animal.getPeso());
    System.out.println("Nome do Animal deletado: " +animal.getNome());

    
    if(animal instanceof Aguia){
      Aguia aguia = (Aguia) animal; 
      aguia.getGerouFilhos();
      System.out.println("O animal é uma Aguia! ");
      System.out.println( "A envergadura da asa: "+aguia.getEnvergaduraAsas());
      aguia.ehVoador();
    }
   else if(animal instanceof Leao){
      Leao leao = (Leao)animal; 
      System.out.println("O animal é um Leão! ");
      System.out.println("Quantidade dos pelos do Leão: " +leao.getQuantPelos());
      leao.getVacinas();
      
      
   }
  else if(animal instanceof Lobo){
    Lobo lobo = (Lobo) animal; 
    System.out.println("O animal é um Lobo! ");
    System.out.println("A quantidade de pelos do lobo:  " +lobo.getQuantPelos());
    lobo.ehAlfa();
    
  }
 else if(animal instanceof Pato){
   Pato pato = (Pato) animal;
   System.out.println("O animal é um Pato ");
   System.out.println("A envergadura das asas do pato: " + pato.getEnvergaduraAsas());
   pato.getCorPenas();
   pato.ehVoador();


 } 
  

}
public void inserirAnimais(){

    
  int id; 
  int idade;
  int peso;
  String nome;
  String respUsuario; 
  String respUsuario2;
  int evergadurasAsas;
  boolean voa;
    
  System.out.println("Qual dos animais voce deseja inserir? Lobo - 1, Leao - 2, Pato - 3 ou Aguia - 4: ");
  respUsuario =  leia.next();

  System.out.println("Digite o nome do animal:");
  nome =  leia.next();
  System.out.println("Digite o id do animal: ");
  id =  leia.nextInt();
  System.out.println("Digite a idade do animal: ");
  idade = leia.nextInt();
  System.out.println("Digite o peso do animal: ");
  peso = leia.nextInt();
    switch(respUsuario){
        case"1":
          
          String respAlfa;
          boolean ehAlfa;
          System.out.println(" É um animal alfa?: Responda com s (sim) ou n (nao): ");
          respAlfa = leia.next();
          if(respAlfa == "s"){
            ehAlfa = true;
            
          }
          else {
            ehAlfa = false;
            
          }
          
          Animal lobo = new Lobo( id,  idade,  peso,  nome, ehAlfa);
          animais.add(lobo);
          System.out.println("Animal adicionado com sucesso: ");
          break;
        
        case"2":
          
          int vacinas;
    
          System.out.println("Digite a quantidade de vacinas: ");
          vacinas = leia.nextInt();
          
          Animal leao= new Leao( id,  idade,  peso,  nome, vacinas);
          animais.add(leao);
          System.out.println("Animal adicionado com sucesso: ");
          break;
        
         case"3":
          
          String corPenas;
    
          System.out.println("Digite a envergadura da ave: ");
          evergadurasAsas = leia.nextInt();
          System.out.println("Digite a cor dominante da pena da ave: ");
          corPenas = leia.next();
          System.out.println("Digite se esse animal plana ou voa? Digite 1 para plana ou 2 para voa: " );
          
          respUsuario2 = leia.next();
          if(respUsuario2 == "1"){
            voa = true;
            
          }
          else{
           voa = false;
            
          }
          Animal pato= new Pato( id,  idade,  peso,  nome, evergadurasAsas, voa, corPenas );
          animais.add(pato);
          
          System.out.println( "Animal adicionado com sucesso");
          
          break;
        
      case "4":
        String respUsuario3;
        Boolean gerouFilhos;
          System.out.println("Digite a envergadura da ave: ");
          evergadurasAsas = leia.nextInt();
          System.out.println("O animal gerou filhos? Responda com s ou n: ");
          respUsuario3 = leia.next();
          System.out.println(respUsuario3);
          if(respUsuario3.equals("s"))
            gerouFilhos = true;
          else{
            gerouFilhos = false;
          }
          System.out.println(gerouFilhos);
          System.out.println("Digite se esse animal plana ou voa? Digite 1 para plana ou 2 para voa: " );
          respUsuario2 = leia.next();
          if(respUsuario2 == "1"){
            voa = true;
          }
          else{
           voa = false;
         }
        
          Animal aguia= new Aguia( id,  idade,  peso,  nome, evergadurasAsas, voa, gerouFilhos );
          animais.add(aguia);
          System.out.println("Animal adicionado com sucesso: ");
          break;
    }
  }
public void removerAnimal(){
    
  int id;
  System.out.println("Digite o id do animal que voce deseja remover da lista?: ");
  id = leia.nextInt();
  for (int i = 0; i < animais.size(); i++) {
    if(animais.get(i).getId() == id){
      listarAnimal(animais.get(i));
      animais.remove(animais.get(i));
      System.out.println("O animal foi removido com sucesso! ");
      
      
      }
}
  }
  
  
}