public class Task implements Prirority{

public String name;
private int id=-1;

  public Task(String name){this.name=name;}
  public Task(int id){this.id=id;}
  
    public void setPrirority(int id) {id=id;}//rename one of the two id variabl
    public int getPrirority() {return id;}
}

