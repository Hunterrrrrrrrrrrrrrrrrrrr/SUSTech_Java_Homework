import java.util.*;
public class a3q1 {
  static class matrix {
    int n, m;
    int[][] a = new int[105][105];
    
    public matrix(int n, int m) {
      this.n = n;
      this.m = m;
      for(int i = 1; i <= n; i ++) {
        for(int j = 1; j <= m; j ++) {
          a[i][j] = 0;
        }
      }
    }
    
    public matrix mul(matrix b) {
      matrix ans = new matrix(n, b.m);
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= b.m; j++) {
          for (int k = 1; k <= m; k++) {
            ans.a[i][j] += a[i][k] * b.a[k][j];
          }
        }
      }
      return ans;
    }
    
    public matrix add(matrix b) {
      matrix ans = new matrix(n, m);
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= b.m; j++) {
          ans.a[i][j] = a[i][j] + b.a[i][j];
        }
      }
      return ans;
    }
    
    public matrix sub(matrix b) {
      matrix ans = new matrix(n, b.m);
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= b.m; j++) {
          ans.a[i][j] = a[i][j] - b.a[i][j];
        }
      }
      return ans;
    }
    
    public matrix trans() {
      matrix ans = new matrix(m, n);
      for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
          ans.a[i][j] = a[j][i];
        }
      }
      return ans;
    }
    
  }
  
  public static void main(String[] args) {
    String q = new String();
    System.out.println(q);
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    matrix A11 = new matrix(n / 2, n / 2);
    matrix A12 = new matrix(n / 2, n / 2);
    matrix A21 = new matrix(n / 2, n / 2);
    matrix A22 = new matrix(n / 2, n / 2);
    
    matrix B11 = new matrix(n / 2, n / 2);
    matrix B12 = new matrix(n / 2, n / 2);
    matrix B21 = new matrix(n / 2, n / 2);
    matrix B22 = new matrix(n / 2, n / 2);
    
    int [][]A = new int[105][105];
    int [][]B = new int[105][105];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        A[i][j] = in.nextInt();
      }
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        B[i][j] = in.nextInt();
      }
    }
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        A11.a[i][j] = A[i][j];
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        A12.a[i][j] = A[i][j + n / 2];
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        A21.a[i][j] = A[i + n / 2][j];
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        A22.a[i][j] = A[i + n / 2][j + n / 2];
    
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        B11.a[i][j] = B[i][j];
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        B12.a[i][j] = B[i][j + n / 2];
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        B21.a[i][j] = B[i + n / 2][j];
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        B22.a[i][j] = B[i + n / 2][j + n / 2];
    
    int[][] ans = new int[n + 1][n + 1];
    A11 = A11.add(B11);
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        ans[i][j] = A11.a[i][j];
    A12 = A12.mul(B12.trans());
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        ans[i][j + n / 2] = A12.a[i][j];
    A21 = B21.mul(A21.trans());
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        ans[i + n / 2][j] = A21.a[i][j];
    A22 = A22.sub(B22);
    for (int i = 1; i <= n / 2; i++)
      for (int j = 1; j <= n / 2; j++)
        ans[i + n / 2][j + n / 2] = A22.a[i][j];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.printf("%d ", ans[i][j]);
      }
      System.out.println("");
    }
  }
}
