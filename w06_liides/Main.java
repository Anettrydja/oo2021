public class Main {
    public static void main(String[] args) {
      EstonianID est = new EstonianID("49707230818");
      FinnishID fin = new FinnishID("100190-003");
      
      System.out.println("EESTI:");
      System.out.println(est.getGender());
      System.out.println(est.getFullYear());
      System.out.println(est.getDOB());
      System.out.println("SOOME: ");
      System.out.println(fin.getGender());
      System.out.println(fin.getFullYear());
      System.out.println(fin.getDOB());
    }
  }