
          //U l d r
//  int dr[]={-1,0,1,0};
//  int dc[]={0,-1,0,1};
//  char dir[]={'U','L','D','R'};


// || 

//................in  directd grpah cycle is found when on a same path node is visited again.ans found using 1-vis and 2nd pathvis arr path vis will backtarck 
// boolean isCyclic(g, n){
//   int vis[]= new int[n];
//   int pathvis[]= new int[n];
//   for(int i=0; i< n; i++){
//         if(vis[i] == 0){
//              if( dfs(i , g, vis, pathVis) == true) return true;
//         }
//   }
// }

// maximum diameter or maximum simple path sum 
// int  dfs(int u, int par){
//        int max1=0;
//        int max2=0;
//         for(int v : g.get(u)){
//            if(v!= par){
//               int childGain=  dfs(v, u);
//               if( childGain >  max1){
//                     max2= max1;
//                     max1= childGain;
//               } else if( childGain > max2){
//                     max2= childGain;
//               }
//            }
//        }

//        ans= Math.max( ans, max1 + max2 + a[u]);
//        return Math.max(max1, max2) + a[u];
// }

///////////////////////////////////////////////////////////////////////////////////////////
/// 
// boolean dfs(int node,  ArrayList<ArrayList<Integer>> g, int vis[], int pathvis[]){
//      vis[node] = 1;
//      pathvis[node] = 1;
//      for(int v : g.get(node) ){
//         if(vis[v] == 0){
//             if(dfs(v, g, vis, pathvis) == true){
//                return true;
//             }
//         }
//      else if( pathvis[v] == 1){
//           return true;
//      }
//   }
//    pathvis[node] = 0;
//    return false;
// }


// ..........in undirectd wehenever a node is vis and is not parent then cycle
// boolean  dfs(int i, int vis[], int par){// is cycle in undirectd
//   vis[i] = 1;
//    for(int v: g.get(i) ){
//       if(vis[v] == 0){
//           if ( dfs( v, vis,  i) == true){
//               return true;
//           }
//         }
//       else if( v != par){
//             return true;
//       }
//     }
// return false;
// }
// to find no. of cycles of length m in graph 

//......dis of every node from root;
// int dis[];
//  void dfs(int  curr, int par){
//      for(int v: g.get(curr)){
//          if(v !=par){
//              dis[v]=dis[curr]+1;
//              dfs(v, curr);
//          }
//      }
//  }
// for find max diam use dis fun , find max dis node then again call dfs from that node and find max dis node
//......subtree size of every node

// int dp[];
// void subTreeSize(int u, int p){ with curr node;
//    dp[u]=1;
//    for(int v: g[u]){
//         if(v != p){
//            dfs(v, u);
//              dp[u] += dp[v];
//         }
//    }
//  
// }

// finding leafs;
// void dfs(int u, int p){
//       boolean isL = true;
//       for(int v: g.get(u)){
//           if(v != p){
//                isL = false;
//                dfs(v, u);
//                
//           }
//       }
//       if(isL){
//          cnt++;
//       }
// }

// //find maxdepth for each node not whole just lowe depth
// void findDepth(int curr, int par){
//   maxDepth[curr]=0;
//   for(int v: g.get(curr)){
//       if( v!= par){
//           findDepth( v, curr);
//           maxDepth[curr]= max(maxDepth[curr], maxDepth[v]+1);
//       }
//   }
// }
 
// FIND BRiDGES in Grpah
// List<List<Integer>>g;
// int dp[]; 
// int lvl[];
// int vis[];
// int countBridge;
// void dfs(int u, int p){
//     vis[u]=1;
//     if(p!=-1){
//        lvl[u]=lvl[p]+1;
//     }
//     dp[u] = lvl[u]; // in start each node at same level 
//     for(int v: g.get(u)){
//         if( v != p){
//             if( vis[v]==1) {  // backed edge so connected to an ancestor
//                 dp[u]= min( dp[u], lvl[v]);
//             }else{
//                 dfs(v, u);
//                 dp[u]= min( dp[u], dp[v]); // while comming back;

//                 if(lvl[u] < dp[v]){ // child is connected to a node which is at lvl lesser than equals so not bridge
//                     countBridge++;
//                 }
//             }
//         }
//     }
// }

// public static int[] dijkstra(List<List<Edge>> graph, int start) {
//     int n = graph.size();
//     int[] distances = new int[n];
//     Arrays.fill(distances, Integer.MAX_VALUE);
//     distances[start] = 0;

//     // PriorityQueue using lambda comparator on Pair's distance
//     PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
//     pq.offer(new Pair(start, 0));

//     while (!pq.isEmpty()) {
//         Pair current = pq.poll();
//         int u = current.node;
//         int distU = current.distance;

//         if (distU > distances[u]) continue;

//         for (Edge edge : graph.get(u)) {
//             int v = edge.target;
//             int weight = edge.weight;

//             if (distances[u] + weight < distances[v]) {
//                 distances[v] = distances[u] + weight;
//                 pq.offer(new Pair(v, distances[v]));
//             }
//         }
//     }

//     return distances;
// }

// find permuation cycle count

// int count=0;
//         for(int i=0; i< n; i++){
//              if(vis[i]==0){
//                  int curr=i;
//                  count++;
//                  while( vis[curr]==0){
//                      vis[curr]=1;
//                      curr= a[curr]-1;
//                  }
//              }
//         }


// int n= a.length;
// int m= a[0].length;
// inArr(a);

// PriorityQueue<Triple>pq=new PriorityQueue<>((p1, p2)-> Integer.compare(p1.z, p2.z));
// int dis[][]=new int[n][m];
// for(int d[] : dis) Arrays.fill(d, max);
// dis[0][0] = a[0][0];
// pq.add(new Triple(0, 0, dis[0][0])); 


// while(!pq.isEmpty()){
//    Triple curr = pq.poll();
//    for(int x=0; x< 4; x++){
//         int r_ = dr[x]+ curr.x;
//         int c_ = dc[x]+ curr.y;
//         if( r_ >=0 && c_>=0 && r_ < n && c_ < m ){
//                 int newDis = dis[curr.x][curr.y] + (( a[r_][c_] > dis[curr.x][curr.y]) ? a[r_][c_] - dis[curr.x][curr.y] : 0) ;
//                 if(dis[r_][c_] > newDis){
//                      dis[r_][c_] = newDis + 1;                     
//                      pq.add(new Triple(r_, c_, dis[r_][c_]));
//                    }
//         }
//    }
// }
// // DEBUG(dis);
// return (dis[n-1][m-1]);




// void ans() {
//     int n=ini();
//     List<int []>p= new ArrayList<>();
//     for(int i=0; i< n; i++){
//         int l= ini();
//         int r= ini();
//         p.add(new int[]{l, 1});
//         p.add(new int[]{ r, -1});
//     }
//     p.sort((p1,p2)-> {
//         if( p1[0]== p2[0]){
//              return p2[1]- p1[1];
//         }else{
//             return p1[0] - p2[0];
//         }
//     } );    
//     long currSum=0;
//     for(int[] i : p){
//          currSum+=i[1];
//          if(currSum >=3){
//               no();return;
//          }
//     }
//     yes();
    
//    }

// }

// void ans() {
//     int n=ini();
//     Triple a[]=new Triple[n]; 
//     for(int i=0; i< n; i++){
//          int x= ini();
//          int y= ini();
//          a[i]=new Triple(x , y , i);
//     }
//     Arrays.sort(a, (p1, p2)-> (p1.x !=p2.x)? (p1.x- p2.x) : (p1.y- p2.y));
//     int res[]=new int[n];

//     Arrays.fill(res, 1);
//     int prevY=a[0].y;
//     res[a[0].z]= 2;
//     int f=0;

//     for(int i= 1; i< n; i++){
//          if(a[i].x >  prevY){
//               f=1;
//               break;
//          }else{
//              res[a[i].z]= 2;
//          }
//          prevY= max(a[i].y , prevY);
//     }
//     if(f==0){
//          pl(-1);
//     }else{
//         pArr(res);
//     }
//     pl();
    

//    }

// }

