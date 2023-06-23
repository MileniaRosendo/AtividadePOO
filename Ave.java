public abstract class Ave extends Animal{
    protected int envergaduraAsas;
    protected boolean voa;

    public int getEnvergaduraAsas(){
      return envergaduraAsas; 
    
    }
    public void ehVoador(){
       if (voa == true) {
         System.out.println("A ave voa!!");
       } else {
        System.out.println("A ave não voa!! ");
       }
      }
    }
  
  
  
    
  