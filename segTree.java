import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

public class segTree{
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
static final int INF=(int)1e9;
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
void inmat(int [][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){a[i][j]=sc.nextInt();}}}
void inmat(long [][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){a[i][j]=sc.nextLong();}}}
void inmat(char[][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){a[i][j]=sc.next().charAt(0);}}}
void inmatS(char[][]a){for(int i=0;i<a.length;i++){String s=ins(); a[i]= s.toCharArray();}}

void yes(){out.println("Yes");}
void no(){out.println("No");}
void pl(){out.println();}
void pl(int x){out.println(x);}
void pl(double x){out.println(x);}
void pl(long x){out.println(x);}
void pl(char x){out.println(x);}
void pl(String x){out.println(x);}
void pArr(int[] a){for(int i=0;i<a.length;i++){out.print(a[i]+" ");} pl();}
void pArr(long[]a){for(int i=0;i<a.length;i++){out.print(a[i]+" "); pl();}}
void pArr(ArrayList<Integer> a){for(int i=0; i<a.size();i++){out.print(a.get(i)+" ");}pl();}
void pArr(int [][]a){for(int i=0;i<a.length;i++){for(int j=0;j<a[0].length;j++){out.print(a[i][j]+" ");} pl();} pl();}
void DEBUG(Object... args) {for (Object arg : args) {if (arg instanceof int[]) {out.println(java.util.Arrays.toString((int[]) arg));} else if (arg instanceof long[]) {System.out.println(java.util.Arrays.toString((long[]) arg)); }else if (arg instanceof double[]){out.println(java.util.Arrays.toString((double[]) arg));} else if (arg instanceof Object[]) {System.out.println(java.util.Arrays.deepToString((Object[]) arg));}else {out.println(arg);}}}

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
long pow(long b, long e){long res=1;b= b % mod; while(e> 0){ if((e & 1)==1){e-=1; res= (res * b) % mod; }else{ b=(b * b) % mod;e>>=1;}}return res;}
int gcd(int a, int b){if(b==0) {return a;}return gcd(b, a % b);}
long gcd(long a, long b){if(b==0) {return a;}return gcd(b, a % b);}
long lcm(long a, long b){return (a/gcd(a,b)*b);}
long abs(long a) { return Math.abs(a);}
int  abs(int a) { return Math.abs(a);}

class PairL {long x,y;PairL(long x, long y){this.x = x;this.y=y;}} ;
class Pair {int x, y;Pair(int x, int y) { this.x = x;this.y = y;}@Override public boolean equals(Object o) { if (this == o) return true;if (o == null || getClass() != o.getClass()) return false; Pair pair = (Pair) o;return x == pair.x && y == pair.y; } @Override  public int hashCode() {return Objects.hash(x, y); }}
class Triple {int x,y,z;Triple(int x, int y,int z){this.x = x;this.y = y; this.z=z;}}

void merge(int[] arr,int l,int m,int h){ArrayList<Integer> t=new ArrayList<>();int i=l;int r=m+1;while(i<=m&&r<=h){if(arr[i]<=arr[r]){t.add(arr[i]);i++;}else{t.add(arr[r]);r++;}}while(i<=m){t.add(arr[i]);i++;}while(r<= h){t.add(arr[r]);r++;}for(int x=l;x<=h;x++){arr[x]=t.get(x-l);}}
void ascSort(int[]arr,int l,int h){if(l>=h)return ;int m=(l+h)/2 ;ascSort(arr, l, m);ascSort(arr,m+1,h);merge(arr,l,m,h);}
void dmerge(int[]arr, int l,int m,int h) {ArrayList<Integer> t=new ArrayList<>();int i=l;int r=m+1;while(i<=m&&r<=h){if(arr[i]>=arr[r]){t.add(arr[i]);i++;}else{t.add(arr[r]);r++;}}while(i<=m){t.add(arr[i]);i++;}while(r<= h){t.add(arr[r]);r++;}for(int x=l;x<=h;x++){arr[x]=t.get(x-l);}}
void descSort(int[] arr,int l,int h){if(l>=h)return ;int m=(l+h)/2 ;descSort(arr,l,m);descSort(arr,m+1,h);dmerge(arr,l,m,h);}
void ascSort(long[]arr,long l,long h){if(l>=h)return ;long m=(l+h)/2 ;ascSort(arr, l, m);ascSort(arr,m+1,h);merge(arr,l,m,h);}
void merge(long[]arr,long l,long m,long h){ArrayList<Long> t=new ArrayList<>();long i=l;long r=m+1;while(i<=m&&r<=h){if(arr[(int)i]<=arr[(int)r]){t.add(arr[(int)i]);i++;}else{t.add(arr[(int)r]);r++;}}while(i<=m){t.add(arr[(int)i]);i++;}while(r<= h){t.add(arr[(int)r]);r++;}for(long x=l;x<=h;x++){arr[(int)x]=t.get((int)(x-l));}}
void descSort(long[] arr, int l, int h) {if (l >= h) return;int m = (l + h) / 2;descSort(arr, l, m);descSort(arr, m + 1, h);dmerge(arr, l, m, h);}
void dmerge(long[] arr, int l, int m, int h) {ArrayList<Long> t = new ArrayList<>();int i = l, r = m + 1; while (i <= m && r <= h) {if (arr[i] >= arr[r]) {t.add(arr[i]); i++;}else {t.add(arr[r]);r++;}}while (i <= m) {t.add(arr[i]);i++;}while (r <= h) { t.add(arr[r]);r++;}for (int x = l; x <= h; x++) {arr[x] = t.get(x - l);}}
void swap(int a, int b){int temp=a;a=b;b=temp;}

public static void main(String args[]){segTree sk_18 = new segTree();sk_18.solve();}
    public void solve() {
          int t=1;
          while (t-- > 0) {
          ans();
    }
    out.close();
}  
// ||

long seg[];//0 based

void build(int a[] , int start , int end, int index ){
    // n, n/2 , n/4 .... o(2n)
    if(start==end){
        seg[index]=a[start];
        return;
    }
    int mid= (start + end) /2;
    int left= 2* index ;
    int right= 2* index + 1;
    build( a, start, mid, left);
    build( a, mid+1, end, right);
    seg[index]= seg[left] ^ seg[right];
}

void update(int a[], int start, int end, int index, int pos, int val){
    //o(logn)
    if(start==end){
         a[pos]=val;
         seg[index]= val;
         return;
    }
    
    int mid= (start + end)/ 2;
    if(mid>= pos){
        update( a, start, mid, 2 * index, pos, val);
    }else{
        update( a, mid+1, end,2 * index + 1, pos, val );
    }
    seg[index]= seg[2 * index]  ^ seg[2 * index+1];
}

long query(int start ,int end ,int index , int l, int r){
    //o(logn)

    if( start >= l && end <= r){ // l  st-end  r // complete overlap
            return seg[index];
    }
    if(l> end || r< start){ // disjoint
            return 0;
    }
    int mid= (start + end)/2; 
    long leftAns= query( start, mid, 2 * index , l , r);// partial so on bth sides
    long rightAns= query(mid+1, end, 2* index + 1 , l, r);
    return leftAns ^ rightAns ;

}



public void ans() {
      int n=ini();
      int q=ini();
      seg=new long[4 * n];
      int a[]=new int[n];

      inArr(a);

      build( a,0, n-1, 1);
      //DEBUG(seg);
      while( q -- > 0){
            int l=ini()-1;
            int r=ini()-1;
            long ans= query(0, n-1, 1, l, r);
            pl(ans);
 
   }
}
}