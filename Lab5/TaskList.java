import java.util.*/*, Math*/;
public class TaskList {
    public static void main(String[] args) {
        //inv Task
        System.out.println("Priority Task List\n------------------");
        // Task task1,task2,task3,task4,task5 = new Task(name, id);
        Task task1 = new Task("Attend class");
        Task task2 = new Task("Homework");
        Task task3 = new Task("Exercise");
        Task task4 = new Task("Eat breakfast");
        Task task5 = new Task("Eat lunch");
        String space="";
        //for(int i=0;i<5;i++)
        // for(){=space.conc}
        task1.setPrirority(1);
        task2.setPrirority(2);
        task3.setPrirority(3);
        task4.setPrirority(4);
        task5.setPrirority(5);
  
  // {  
    /*       */System.out.println(task1.name+space+"\t\tprirority: "+task1.getPrirority());
    /*       */System.out.println(task2.name+space+"\t\tprirority: "+task2.getPrirority());
    /*       */System.out.println(task3.name+space+"\t\tprirority: "+task3.getPrirority());
    /*       */System.out.println(task4.name+space+"\t\tprirority: "+task4.getPrirority());
    /*       */System.out.println(task5.name+space+"\t\tprirority: "+task5.getPrirority());
  /*}*/}
}
