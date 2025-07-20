
import java.util.*;


class Graph{
    private int vertices;
    private LinkedList<Integer> adjList[];

    public Graph(int v ){
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); // For undirected graph  remove this line for directed graph
    }

    public void printGraph(){
        for(int i = 0 ;i<vertices ;i++){
            System.out.println("Vertex " + i + ":  ");
            for(Integer node : adjList[i]){
                System.out.print(" -> " + node);
            }
            System.out.println();
        }
    }

    public void bfs (int start){
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        System.out.println("BFS traversal");
        while(!queue.isEmpty()){
            int current = queue.poll();

            System.out.print(current + " ");

            for(int neightbour:adjList[current]){
                if(!visited[neightbour]){
                    visited[neightbour] = true;
                    queue.offer(neightbour);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);  
        
        g.printGraph();
        g.bfs(0);
        // g.dfs(0);


    }
}