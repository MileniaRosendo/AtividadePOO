public  class Lobo extends Mamifero{
  private boolean ehAlfa;
Lobo(int id, int idade, int peso, String nome, boolean ehAlfa){
    this.nome = nome;
    this.id = id;
    this.peso = peso;
    this.idade = idade;
    this.ehAlfa = ehAlfa;
    }
     public void ehAlfa() {
      if (ehAlfa== true) {
        System.out.println("O lobo é alfa! ");
      } else {
        System.out.println("O lobo não é alfa! ");
       
        
      }
     }
    }
    
  