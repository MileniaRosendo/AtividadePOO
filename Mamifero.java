public abstract class Mamifero extends Animal {
    protected int quantPelos;

  public int getQuantPelos(){
    return quantPelos;
  }
  
  public void alimentacao() {
    System.out.println(getAlimento());
    }
  }