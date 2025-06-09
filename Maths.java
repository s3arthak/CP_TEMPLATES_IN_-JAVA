
    
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.io.PrintWriter;
  import java.math.BigDecimal;
  import java.util.*;
  
      public class Maths{
      static class FastReader {
  
      BufferedReader br;
      StringTokenizer st;
      public FastReader() {br=new BufferedReader(new InputStreamReader(System.in));}
      String next() {while (st == null || !st.hasMoreElements()){try {st = new StringTokenizer(br.readLine());}catch(IOException e){e.printStackTrace();}}return st.nextToken();}
      int nextInt() {return Integer.parseInt(next());}
      long nextLong() {return Long.parseLong(next());}
      double nextDouble() {return Double.parseDouble(next());}}
      FastReader sc = new FastReader();
      PrintWriter out = new PrintWriter(System.out);
   
      static final int mod=1000000007;
      static final int max=Integer.MAX_VALUE;
      static final int min=Integer.MIN_VALUE;
      static final BigDecimal pi = new BigDecimal("3.141592653589793238");
      
      int ini(){return sc.nextInt();}
      long inl(){return sc.nextLong();}
      String ins(){return sc.next();}
      char inch(){return sc.next().charAt(0);}
      void inArr(int[]a){for(int i=0;i<a.length;i++){a[i] = sc.nextInt();}}
      void inArr(char[]a){for(int i=0;i<a.length;i++){a[i]=sc.next().charAt(i);}}
      void inArr(long[] a){for(int i=0;i<a.length;i++){a[i]=sc.nextLong();}}
      void inArr(String[] a){for (int i = 0; i < a.length; i++){a[i] = sc.next();}}
      void inList(ArrayList<Integer>a){for(int i=0;i<a.size();i++){a.add(sc.nextInt());}}
      void inArr(int [][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){a[i][j]=sc.nextInt();}}}
      void inArr(long [][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){a[i][j]=sc.nextLong();}}}
      void inArr(char[][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){a[i][j]=sc.next().charAt(0);}}}
      void inMat(char[][]a){for(int i=0;i<a.length;i++){String s=ins(); a[i]= s.toCharArray();}}
      void DEBUG(Object... args) {for (Object arg : args) {if (arg instanceof int[]) {out.println(java.util.Arrays.toString((int[]) arg));} else if (arg instanceof long[]) {System.out.println(java.util.Arrays.toString((long[]) arg)); }else if (arg instanceof double[]){out.println(java.util.Arrays.toString((double[]) arg));} else if (arg instanceof Object[]) {System.out.println(java.util.Arrays.deepToString((Object[]) arg));}else {out.println(arg);}}}

      void yes(){out.println("Yes");}
      void no(){out.println("No");}
      void pll(){out.println();}
      void pll(int x){out.println(x);} void pl(int x){out.print(x +" ");}
      void pll(double x){out.println(x);} void pl(double x){out.print(x +" ");}
      void pll(long x){out.println(x);} void pl(long x){out.print(x +" ");}
      void pll(char x){out.println(x);} void pl(char x){out.print(x +" ");}
      void pll(String x){out.println(x);} void pl(String x){out.print(x +" ");}
      void pArr(int[] a){for(int i=0;i<a.length;i++){out.print(a[i]+" ");} pll();}
      void pArr(long[]a){for(int i=0;i<a.length;i++){out.print(a[i]+" "); pll();}}
      void pArr(ArrayList<Integer> a){for(int i=0; i<a.size();i++){out.print(a.get(i)+" ");}pll();}
      void pArr(int [][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){out.print(a[i][j]+" ");} pll();} pll();}

      int max(int a,int b){return Math.max(a, b);}
      int min(int a,int b){return Math.min(a, b);}
      long max(long a,long b){return Math.max(a, b);}
      long min(long a,long b){return Math.min(a, b);}
      int ceil(int x,int y){int x1=(int)Math.ceil((double)x /(double)y); return x1;}
      long ceil(long x,long y){long x1=(long)Math.ceil((double)x /(double)y);return x1;}
      double ceil( double x){ return Math.log(x)/ Math.log(2);}
      long floor(long x,long y){long x1=(long)Math.floor((double)x/(double)y);return x1;}
      int stoi( String st){String s=st.replaceFirst("^0" ,"");if( s=="0"){return 0;}return Integer.parseInt(s);}
      long log2(long num){return(long)(Math.log(num)/Math.log(2));}
      int log2(int num){return(int)(Math.log(num)/Math.log(2));}
      double log2(double num){return(double)(Math.log(num)/Math.log(2));}
      boolean isPerfectSq( int n){int s= (int)Math.sqrt(n);return  (s*s == n);}
      boolean isPerfectSq( long n){long s= (long)Math.sqrt(n);return  (s*s == n);}
      int gcd(int a, int b){if(b==0) {return a;}return gcd(b, a % b);}
      long gcd(long a, long b){if(b==0) {return a;}return gcd(b, a % b);}
      long lcm(long a, long b){return (a/gcd(a,b)*b);}
      long abs(long a) { return Math.abs(a);}
      int  abs(int a) { return Math.abs(a);}
      
      int getMax(int[] a) {int m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] > m) {m = a[i];}} return m;}
      long getMax(long [] a) {long m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] > m) {m = a[i];}} return m;}
      int getMin(int[] a) {int m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] < m) {m = a[i];}} return m;}
      long getMin(long [] a) {long m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] <m) {m = a[i];}} return m;}
      void swap(int []arr,int i,int j){int temp=arr[i];arr[i]=arr[j]; arr[j]=temp;}
      void merge(int[] arr,int l,int m,int h){ArrayList<Integer> t=new ArrayList<>();int i=l;int r=m+1;while(i<=m&&r<=h){if(arr[i]<=arr[r]){t.add(arr[i]);i++;}else{t.add(arr[r]);r++;}}while(i<=m){t.add(arr[i]);i++;}while(r<= h){t.add(arr[r]);r++;}for(int x=l;x<=h;x++){arr[x]=t.get(x-l);}}
      void ascSort(int[]arr,int l,int h){if(l>=h)return ;int m=(l+h)/2 ;ascSort(arr, l, m);ascSort(arr,m+1,h);merge(arr,l,m,h);}
      void dmerge(int[]arr, int l,int m,int h) {ArrayList<Integer> t=new ArrayList<>();int i=l;int r=m+1;while(i<=m&&r<=h){if(arr[i]>=arr[r]){t.add(arr[i]);i++;}else{t.add(arr[r]);r++;}}while(i<=m){t.add(arr[i]);i++;}while(r<= h){t.add(arr[r]);r++;}for(int x=l;x<=h;x++){arr[x]=t.get(x-l);}}
      void descSort(int[] arr,int l,int h){if(l>=h)return ;int m=(l+h)/2 ;descSort(arr,l,m);descSort(arr,m+1,h);dmerge(arr,l,m,h);}
      void ascSort(long[]arr,long l,long h){if(l>=h)return ;long m=(l+h)/2 ;ascSort(arr, l, m);ascSort(arr,m+1,h);merge(arr,l,m,h);}
      void merge(long[]arr,long l,long m,long h){ArrayList<Long> t=new ArrayList<>();long i=l;long r=m+1;while(i<=m&&r<=h){if(arr[(int)i]<=arr[(int)r]){t.add(arr[(int)i]);i++;}else{t.add(arr[(int)r]);r++;}}while(i<=m){t.add(arr[(int)i]);i++;}while(r<= h){t.add(arr[(int)r]);r++;}for(long x=l;x<=h;x++){arr[(int)x]=t.get((int)(x-l));}}
      void descSort(long[] arr, int l, int h) {if (l >= h) return;int m = (l + h) / 2;descSort(arr, l, m);descSort(arr, m + 1, h);dmerge(arr, l, m, h);}
      void dmerge(long[] arr, int l, int m, int h) {ArrayList<Long> t = new ArrayList<>();int i = l, r = m + 1; while (i <= m && r <= h) {if (arr[i] >= arr[r]) {t.add(arr[i]); i++;}else {t.add(arr[r]);r++;}}while (i <= m) {t.add(arr[i]);i++;}while (r <= h) { t.add(arr[r]);r++;}for (int x = l; x <= h; x++) {arr[x] = t.get(x - l);}}
      class PairL {long x,y;PairL(long x, long y){this.x = x;this.y=y;}} ;
class Pair {int x, y;Pair(int x, int y) { this.x = x;this.y = y;}@Override public boolean equals(Object o) { if (this == o) return true;if (o == null || getClass() != o.getClass()) return false; Pair pair = (Pair) o;return x == pair.x && y == pair.y; } @Override  public int hashCode() {return Objects.hash(x, y); }}
class Triple {int x,y,z; Triple(int x, int y,int z){this.x = x;this.y = y; this.z=z;}}
      void swap(int a, int b){int temp=a;a=b;b=temp;}
  
      public ArrayList<Integer>getAllDivisors(int x){
        ArrayList<Integer>arr=new ArrayList<>();
           for(int i=1;i *i <= x; i++){
                 if( x % i==0){
                     arr.add(i);
                 }
                 if(i != x/i){
                      arr.add(x/i);
                 }
           }
           Collections.sort(arr);
           return arr;
      }
      
      
      boolean is_prime(int n) { if (n <= 1) return false;for (int i = 2; i * i <= n; i++) {if (n % i == 0) {return false;}} return true;}

      int MAX_N = 6000000;
      boolean[] isPrime ;
       void sieve() {
        isPrime = new boolean[MAX_N];
          Arrays.fill(isPrime, true);
          isPrime[0] = isPrime[1] = false; 
          for (int i = 2; i * i< MAX_N; i++) {
              if (isPrime[i]) {
                  for (int j = i * i; j < MAX_N; j += i) {
                      isPrime[j] = false;
                  }
              }
          }
    }
    
  
    int Max_n=(int)1e8 + 1; 
    int spf[];
    void spf(){
      spf=new int[Max_n];
        for(int i=0;i< Max_n; i++){
           spf[i]=i;
        }
        for(int i=2; i * i< Max_n; i++){
           if(spf[i]==i){
              for(int j=i * i ; j< Max_n ; j+=i){
                 if(spf[j]==j){
                    spf[j]=i; // smallest prime mark
                 }
              }
           }
        }
    }
    int countPrimeFactors(int n){
      int count=0;
       while( n != 1){
            n/=spf[n];
            count++;
       }
       return count;
    }
  
     int MAX= (int)1e5 + 1;
      int divCount[];
      void preCompDiv(){
        divCount=new int[MAX];
          for(int i=1;i<MAX;i++){
              for(int j=i; j< MAX;j+=i){
                  divCount[j]++;
              }  
           }
      }

    long pow( long b, long e){
         long res = 1;
         b= b % mod;
         while( e > 0){
              if(( e & 1)==1){
                 res= (res * b) % mod;
              }
              b= (b * b) % mod;
              e >>= 1;
         }
         return res;
    }

    
     long modInv(long a, int mod){
        return pow(a, mod - 2);
    }

    long fact[]= new long[MAX + 1];
    void findFact(){
        fact[0]=1;
        for(int i=1; i<= MAX; i++){
             fact[i] = (fact[i-1] * i) % mod;
        }
    }

    long nCr(int n, int r){
        if( r> n){ return 0; }
        long deno = (fact[r] * fact[ n- r]) % mod;
        return (fact[n]  *  modInv( deno, mod)) % mod;
    }
    


      public static void main(String args[]){Maths sk_18 = new Maths(); sk_18.solve();}

          public void solve() {
              // findFact();
              // sieve();
              int t=1;
                while (t-- > 0) {
                    ans();
                }
              out.close();
          }
  // ||

  
  public void ans() {
   

  
     
}
  }
  
  