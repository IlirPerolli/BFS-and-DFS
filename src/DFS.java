import java.util.*;

class DFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Krijimi i grafit
    DFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Shto edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    void DFS(int vertex) {
        String [] nodes = {"S","A","B","C","D","E", "F","H", "I", "J", "G", "K"} ;

        visited[vertex] = true;

        System.out.print(nodes[vertex] + " ");
            if (nodes[vertex].equals("G")) {
                //U gjet
                System.exit(0);
            }
        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {

            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String args[]) {
        DFS g = new DFS(12);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 7);
        g.addEdge(4, 6);
        g.addEdge(4, 8);
        g.addEdge(5, 7);
        g.addEdge(6, 9);
        g.addEdge(7, 10);
        g.addEdge(8, 10);
        g.addEdge(9, 11);
        g.addEdge(10, 11);
        System.out.println("Depth First Search nga S deri tek G: ");

        g.DFS(0);
    }
}