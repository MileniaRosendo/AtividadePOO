
public class Aguia extends Ave {
    private boolean gerouFilhos;
    Aguia(int id, int idade, int peso, String nome, int envergaduraAsas, boolean voa, boolean gerouFilhos){
      this.id = id;
      this.peso = peso;
      this.idade = idade; 
      this.nome = nome; 
      this.envergaduraAsas = envergaduraAsas;
      this.voa = voa; 
      this.gerouFilhos = gerouFilhos;
    }
    public void getGerouFilhos() {
      if (gerouFilhos) {
        System.out.println("A aguia teve filhos <3! ");
      } else {
        System.out.println("A aguia não teve filhos");
      }
    }
      }
    
  
  