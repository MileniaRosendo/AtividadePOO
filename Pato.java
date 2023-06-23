public class Pato extends Ave {
    private String corPenas;
Pato(int id, int idade, int peso, String nome, int envergaduraAsas, boolean voa, String corPenas){
    this.id = id;
    this.peso = peso;
    this.idade = idade; 
    this.nome = nome; 
    this.envergaduraAsas = envergaduraAsas;
    this.voa = voa; 
    this.corPenas = corPenas;
    }
   public String getCorPenas() {
    System.out.println("A cor da pena do pato é: " +this.corPenas);
    return corPenas;
   }
  }