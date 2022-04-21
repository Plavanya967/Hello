package arraypratice;

public class graph {
       int V;
       int E;
        int[][] adjmatrix;
        graph(int nodes){
            this.V=nodes;
            this.E=0;
            this.adjmatrix= new int[nodes][nodes];
        }
        void addedge(int u, int v){
            adjmatrix[u][v]=1;
            adjmatrix[v][u]=1;
            E++;
        }
        String toString1(){
            StringBuilder sb= new StringBuilder();
            sb.append(V+" vertices "+E+" edges "+"\n");
            for(int i=0;i<V;i++){
                sb.append(i+":");
                for(int c:adjmatrix[i]){
                    sb.append(c+" ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

    public static void main(String[] args){
        graph g= new graph(4);
        g.addedge(0,1);
        g.addedge(1,2);
        g.addedge(2,3);
        g.addedge(3,0);

        System.out.println(g.toString1());
    }
}
