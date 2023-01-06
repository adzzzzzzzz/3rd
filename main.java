import java.util.*;
  class Main {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    String k = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String m ="";
    String b = a.next();
    for(int i =0;i<b.length();i++)
      {int charPosition = k.indexOf(b.charAt(i));
      int keyVal = (charPosition-3) % 26;
      char replaceVal = k.charAt(keyVal);
      m += replaceVal;}
    System.out.println(m);
    a.close();
  }
}

