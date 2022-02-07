class StringSplit{
    public static void main(String []args){
     String str = "Alpha ,Beta, Delta, Gamma, Sigma";
      String[] arrSplit = str.split(",", 4);
      for (int i=0; i < arrSplit.length; i++){
        System.out.println(arrSplit[i]);
      }
    }
  }