class Flag {
        public static void print(Object o)
    {
      System.out.print(o);
    }
  public static void main(String[] args) {

    int size = 40;
    for(int i = 1; i <= size; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if((j == i) || (j + i == size + 1) || (i == size / 2) || (i == size / 2 + 1) || (j == size / 2) || (j == size / 2 + 1)) 
          print("*");
        else 
          print(" ");
      }
      System.out.println();
    }
  }
}