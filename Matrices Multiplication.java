// Here are the rules: 
//https://www.mathsisfun.com/algebra/matrix-multiplying.html

class Main {
  public static void print(Object o){
    System.out.println(o);
  }
  public static int matrixMultiply(int[][] a, int[][] b){
    if(b.length != a[0].length)
      throw new IllegalArgumentException("Matrices are not valid");
    int sum = 0;
    for(int r = 0; r < a.length; r++){  //moves between rows of matrix a.
      for(int i = 0; i <b[0].length; i++){ //This loop makes sure that we dont move on to the next row until we finished multiplying by every column of the second matrix.
        for(int c = 0; c < b.length; c++){ //multiplies all elements in every row of a with all elements in every column of b.
          sum += a[r][c] * b[c][i];
          //print(a[r][c] + " * " + b[c][i]); //Un-comment this to see every single multiplication.
        }
      }  
    }
    return sum;
  }
  public static void main(String[] args) {
    int [][] a = {{1, 2, 3}, {4, 5, 6}};
    int [][] b = {{7, 8}, {9, 10}, {11, 12}};
    
    print(matrixMultiply(a,b));
  }
}
