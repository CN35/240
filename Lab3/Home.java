/*public*/class Home/*h*/{
  String fn;String ln;int liab;int foot;int dwel;int cont;
  public Home(String fn,String ln,int liab,int foot,int dwel,int cont){this.fn=fn;this.ln=ln;this.liab=liab;this.foot=foot;this.dwel=dwel;this.cont=cont;}
  public void setFirstName(String fn){this.fn=fn;}
  public void setLastName(String ln){this.ln=ln;}
  public void setLiability(int liab){this.liab=liab;}
  public void setFootage(int foot){this.foot=foot;}
  public void setDwelling(int dwel){this.dwel=dwel;}
  public void setContents(int cont){this.cont=cont;}
  public double computeCommission(){return (liab*.3)+((dwel+cont)*.2);}
  // public String toString(){}
}/*a.*/