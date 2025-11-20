public class Task implements Prirority{

public String name;
private int id=-1;

  public Task(String name){this.name=name;}
  public Task(int id){this.id=id;}
  
    public void setPrirority(int id) {Task.id=id;}
    public int getPrirority() {return task.id;}
}

