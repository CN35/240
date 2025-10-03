/*public*/class Auto/*a*/{
  String fn;String ln;String loc1;String loc2;double liab;double coll;
  public Auto(String fn, String ln, String loc1, String loc2, double liab, double coll){this.fn=fn;this.ln=ln;this.loc1=loc1;this.loc2=loc2;this.liab=liab;this.coll=coll;}
  public double computeCommission(){return liab+coll*.3;}
  //public String toString(){return fn+" "+ln+"-"+loc1+" "+loc2+" | Liability: $"+liab+", Collision: $"+coll;}
}