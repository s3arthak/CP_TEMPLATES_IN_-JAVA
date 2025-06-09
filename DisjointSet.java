import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

    public class DisjointSet{
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
    long ceil(long x,long y){long x1=(long)Math.ceil((double)x /(double)y); return x1;}
    int stoi( String st){String s=st.replaceFirst("^0" ,"");if( s=="0"){return 0;}return Integer.parseInt(s);}
    long log2(long num){return(long)(Math.log(num)/Math.log(2));}
    long pow(long base, long expo){long res = 1;base = base % mod; while (expo > 0) {if ((expo & 1) == 1) { res=(res*base)%mod;}expo = expo >> 1;base = (base * base) % mod;}return res;}
    int gcd(int a, int b){if(b==0) {return a;}return gcd(b, a % b);}
    long gcd(long a, long b){if(b==0) {return a;}return gcd(b, a % b);}
    long lcm(long a, long b){return (a/gcd(a,b)*b);}
    long abs(long a, long b) { return Math.abs(a - b);}
    int  abs(int a, int  b) { return Math.abs(a - b);}
    class PairL {long x,y;PairL(long x, long y){this.x = x;this.y=y;}} ;
    class Pair {int x, y;Pair(int x, int y) { this.x = x;this.y = y;}@Override public boolean equals(Object o) { if (this == o) return true;if (o == null || getClass() != o.getClass()) return false; Pair pair = (Pair) o;return x == pair.x && y == pair.y; } @Override  public int hashCode() {return Objects.hash(x, y); }}
    class Triple {int x,y,z;Triple(int x, int y,int z){this.x = x;this.y = y; this.z=z;}}

    public static void main(String args[]){DisjointSet sk_18 = new DisjointSet();sk_18.solve();}
        public void solve() {
            int t =ini();
            //int t=ini();
            while (t-- > 0) {
                ans();
            }
            out.close();
        }
// || 

// Write  DSU here.......
class DSU {
    int size[];
    int parent[];

    public DSU(int n) {
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = find(parent[node]);
    }

    public void union(int u, int v) {
        int ulp_u = find(u);
        int ulp_v = find(v);
        if (ulp_u == ulp_v) {
            return;
        }
        if (size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        } else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }
    public boolean isConnected(int u, int v) {
        return find(u) == find(v);
    }
}

 
   public void ans() {
       int n=ini();
       int k=ini();

       Triple g[] = new Triple[k];
       for(int i=0; i< k ; i++){
          int u=ini();
           int v=ini();
           int w=ini();
           g[i]=new Triple(u, v, w);
       }
       Arrays.sort(g, (p1, p2)-> Integer.compare(p1.z, p2.z));
       
         int ans= (int)1e9;
            

            for (int l= 0; l< k ; l++) {
                DSU dsu = new DSU(n);
                int  r = l ;

                while (r< k && !dsu.isConnected(1, n)) {
                    dsu.union(g[r].x, g[r].y);
                    r++;
                }

                if (!dsu.isConnected(1, n)) {
                    break;
                }
                ans = min(ans, g[l].z + g[r - 1].z);
            }

            pll(ans);

        }


    }   
  
