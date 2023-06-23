public abstract class Animal{
    protected int id;
    protected int idade;
    protected int peso;
    protected String nome;
    private String alimento;
    private String comer;
  
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void crescer(){
  
      this.idade = idade + 1;
    }
    public void setAlimento(String alimento){
      this.alimento = alimento;
    }
    public String getAlimento(){
      return alimento;
    }
    public void setComer(String comer) {
        this.comer = comer;
    }
    public void comer(String alimento){
        setAlimento(alimento);
        System.out.println("A ultima refeição do animal foi:" +getAlimento());
        this.comer = comer + 1;
    }
    public void atvFisica() {
        this.peso = peso - 2;
    }
   
        
    }
  