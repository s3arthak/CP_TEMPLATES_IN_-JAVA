import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

public class Main{
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

static final long modL= 9223372036854775783L;
static final int mod= (int)1e9 + 7;
static final int max=Integer.MAX_VALUE;
static final long maxx=Long.MAX_VALUE;
static final long INF =(long)1e63 -1 ;
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
void pll(int x){out.println(x);} void pl(int x){out.print(x);}
void pll(double x){out.println(x);} void pl(double x){out.print(x);}
void pll(long x){out.println(x);} void pl(long x){out.print(x);}
void pll(char x){out.println(x);} void pl(char x){out.print(x);}
void pll(String x){out.println(x);} void pl(String x){out.print(x);}
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
//long pow(long b, long e){long res=1;b= b % mod; while(e> 0){ if((e & 1)==1){e-=1; res= (res * b) % mod; }else{ b=(b * b) % mod;e>>=1;}}return res;}
int gcd(int a, int b){if(b==0) {return a;}return gcd(b, a % b);}
long gcd(long a, long b){if(b==0) {return a;}return gcd(b, a % b);}
long lcm(long a, long b){return (a/gcd(a,b)*b);}
long abs(long a) { return Math.abs(a);}
int  abs(int a) { return Math.abs(a);}
int MEX(int a[]){ Set<Integer>st=new HashSet<>(); for(int i=0;i<a.length; i++){ st.add(a[i]);}int mex=0; while(st.contains(mex)) { mex++;} return mex;}

int findMax(int[] a) {int m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] > m) {m = a[i];}} return m;}
long findMax(long [] a) {long m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] > m) {m = a[i];}} return m;}
int findMin(int[] a) {int m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] < m) {m = a[i];}} return m;}
long findMin(long [] a) {long m = a[0];for (int i = 1; i < a.length; i++) {if (a[i] <m) {m = a[i];}} return m;}
long findSum(long a[]){ long sum =0;for(int i=0;i<a.length;i++){ sum+=a[i];} return sum; }
long findSum(ArrayList<Long>a){ long sum =0;for(int i=0;i<a.size();i++){ sum+=a.get(i);} return sum; }

int lower_bound(long[] a,long val) {int l = 0; int r = a.length - 1; int ans = a.length ; while (l <= r) { int m = (l + r) / 2; if (a[m] >= val) { r = m - 1; ans = m;} else {l = m + 1; }} return ans; }// lowest index ele greater then equals to val 
int lower_bound(int[] a,int val) {int l = 0; int r = a.length - 1; int ans = -1 ; while (l <= r) { int m = (l + r) / 2; if (a[m] >= val) { r = m - 1; ans = m;} else {l = m + 1; }} return ans; }// lowest index ele greater then equals to val 
int lower_bound(ArrayList<Integer> ls , int val){ int l=0;int r= ls.size()-1; int ans= -1; while( l<= r){int mid= (l+r)/2; if( ls.get(mid) >= val){  r= mid - 1;ans= mid ; }else{ l=mid+ 1;}  } return ans;}
int upper_bound(int[] a,int val) {int l= 0; int r = a.length - 1; int ans = a.length ; while (l <= r){int m = (l + r) / 2; if (a[m] <= val ) { l = m + 1; ans = m ;} else {r = m - 1 ;} }  return ans; } // gretest index ele less then equals tp val 
int upper_bound(ArrayList<Integer> ls , int val){int l=0;int r=ls.size()-1;  int ans= -1; while( l<= r){int mid= (l+r)/2; if( ls.get(mid)> val){ r=mid-1;  ans= ls.get(mid); }else{ l= mid+1;}}return ans;}

class PairL {long x,y;PairL(long x, long y){this.x = x;this.y=y;}} ;
 class Pair {int x, y;Pair(int x, int y) { this.x = x;this.y = y;}@Override public boolean equals(Object o) { if (this == o) return true;if (o == null || getClass() != o.getClass()) return false; Pair pair = (Pair) o;return x == pair.x && y == pair.y; } @Override  public int hashCode() {return Objects.hash(x, y); }}
class Triple {int x,y,z; Triple(int x, int y,int z){this.x = x;this.y = y; this.z=z;}}

void merge(int[] arr,int l,int m,int h){ArrayList<Integer> t=new ArrayList<>();int i=l;int r=m+1;while(i<=m&&r<=h){if(arr[i]<=arr[r]){t.add(arr[i]);i++;}else{t.add(arr[r]);r++;}}while(i<=m){t.add(arr[i]);i++;}while(r<= h){t.add(arr[r]);r++;}for(int x=l;x<=h;x++){arr[x]=t.get(x-l);}}
void ascSort(int[]arr,int l,int h){if(l>=h)return ;int m=(l+h)/2 ;ascSort(arr, l, m);ascSort(arr,m+1,h);merge(arr,l,m,h);}
void dmerge(int[]arr, int l,int m,int h) {ArrayList<Integer> t=new ArrayList<>();int i=l;int r=m+1;while(i<=m&&r<=h){if(arr[i]>=arr[r]){t.add(arr[i]);i++;}else{t.add(arr[r]);r++;}}while(i<=m){t.add(arr[i]);i++;}while(r<= h){t.add(arr[r]);r++;}for(int x=l;x<=h;x++){arr[x]=t.get(x-l);}}
void descSort(int[] arr,int l,int h){if(l>=h)return ;int m=(l+h)/2 ;descSort(arr,l,m);descSort(arr,m+1,h);dmerge(arr,l,m,h);}
void ascSort(long[]arr,long l,long h){if(l>=h)return ;long m=(l+h)/2 ;ascSort(arr, l, m);ascSort(arr,m+1,h);merge(arr,l,m,h);}
void merge(long[]arr,long l,long m,long h){ArrayList<Long> t=new ArrayList<>();long i=l;long r=m+1;while(i<=m&&r<=h){if(arr[(int)i]<=arr[(int)r]){t.add(arr[(int)i]);i++;}else{t.add(arr[(int)r]);r++;}}while(i<=m){t.add(arr[(int)i]);i++;}while(r<= h){t.add(arr[(int)r]);r++;}for(long x=l;x<=h;x++){arr[(int)x]=t.get((int)(x-l));}}
void descSort(long[] arr, int l, int h) {if (l >= h) return;int m = (l + h) / 2;descSort(arr, l, m);descSort(arr, m + 1, h);dmerge(arr, l, m, h);}
void dmerge(long[] arr, int l, int m, int h) {ArrayList<Long> t = new ArrayList<>();int i = l, r = m + 1; while (i <= m && r <= h) {if (arr[i] >= arr[r]) {t.add(arr[i]); i++;}else {t.add(arr[r]);r++;}}while (i <= m) {t.add(arr[i]);i++;}while (r <= h) { t.add(arr[r]);r++;}for (int x = l; x <= h; x++) {arr[x] = t.get(x - l);}}
void swap(int a, int b){int temp=a;a=b;b=temp;}
 
public static void main(String args[]){Main sk_18 = new Main();sk_18.solve();}
    public void solve() {
          int t= ini();
          while (t-- > 0) {
             ans();
    }
    out.close();
}  
// ||




  public void ans() {
        int n=ini();
        int a[]=new int[n];
        inArr(a);
        int b[]=new int[n];
        inArr(b);
        Map<Integer, Integer>mp1=new HashMap<>();
        Map<Integer, Integer>mp2=new HashMap<>();
        int i;
        for(i= n-1; i>=-1; i--){
             if(i==-1){
                  break;
              }
              if(a[i]==b[i]){
                  break;
              }
              if( i== n-1 ){
                  if( i % 2==1){
                        mp1.put(a[i], 1);
                        mp2.put(b[i], 1);
                  }else{
                        mp1.put(b[i], 1);
                        mp2.put(a[i], 1);
                  }

                  
                  continue;
              }
             
              
               if(i % 2==1){
                    if( mp2.containsKey(a[i])){
                           break;
                    }
                    mp1.put(b[i+1], mp1.get(b[i+1]) -1 );
                    if( mp1.get(b[i+1])==0){
                           mp1.remove(b[i+1]);
                    }
                    if(mp1.containsKey(a[i])){
                          break;
                    }
                    mp1.put(b[i+1], mp1.getOrDefault(b[i+1], 0)+1);

                    if( mp1.containsKey(b[i])){
                           break;
                    }

                    mp2.put(a[i+1], mp2.get(a[i+1])-1);
                    if( mp2.get(a[i+1])==0){
                           mp2.remove(a[i+1]);
                    }
                    if(mp2.containsKey(b[i])){
                           break;
                    }
                    mp2.put(a[i+1], mp2.getOrDefault(a[i+1], 0)+1);

                    mp1.put(a[i], mp1.getOrDefault(a[i], 0) + 1);
                    mp2.put(b[i], mp2.getOrDefault(b[i], 0) + 1);

               }
               else{
                    if( mp1.containsKey(a[i])){
                           break;
                    }
                    mp2.put(b[i+1], mp2.get(b[i+1])  - 1 );
                    if( mp2.get(b[i+1])==0){
                           mp2.remove(b[i+1]);
                    }
                    if(mp2.containsKey(a[i])){
                          break;
                    }
                    mp2.put(b[i+1], mp2.getOrDefault(b[i+1], 0)+1);
                    if( mp2.containsKey(b[i])){
                           break;
                    }

                    mp1.put(a[i+1], mp1.get(a[i+1]) - 1);
                    if( mp1.get(a[i+1])==0){
                           mp1.remove(a[i+1]);
                    }
                    if(mp1.containsKey(b[i])){
                           break;
                    }
                    mp1.put(a[i+1], mp1.getOrDefault(a[i+1], 0)+1);
                      mp2.put(a[i], mp2.getOrDefault(a[i], 0) + 1);
                      mp1.put(b[i], mp1.getOrDefault(b[i], 0) + 1);
                }

              
        }
        pll( i + 1);
            
 
           
      }
    }