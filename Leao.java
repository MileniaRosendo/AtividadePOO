public  class Leao extends Mamifero{
    private int vacinas; 
    Leao(int id, int idade, int peso, String nome, int vacinas){
      this.nome = nome;
      this.id = id;
      this.peso = peso;
      this.idade = idade;
      this.vacinas = vacinas;
    }
  public int getVacinas() {
    System.out.println("O leao tomou essa quantidade de vacinas: " +vacinas);
      return vacinas;
    }
  }