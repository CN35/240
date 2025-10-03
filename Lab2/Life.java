/*public*/class Life/*l*/{
  String fn;String ln;int age;int term;
  public Life(String fn,String ln,int age,int term){this.fn=fn;this.ln=ln;this.age=age;this.term=term;}
  public double computeCommission(){return term*.2;}
  public String getFirstName(){return fn;}
  public String getLastName(){return ln;}
  public int getAge(){return age;}
  public int getTerm(){return term;}
  //public String toString(){}
}