
import java.util.*;

class BFS
{
    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    //Shto edge
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void BFS(int s)
    {

        boolean visited[] = new boolean[V];
        String [] nodes = {"S","A","B","C","D","E", "F","H", "I", "J", "G", "K"} ;

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            if (nodes[s].equals("G")) {
                //U gjet
                break;
            }
            s = queue.poll();
            System.out.print(nodes[s]+" ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[])
    {
        BFS g = new BFS(12);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 8);
        g.addEdge(5, 7);
        g.addEdge(3, 7);
        g.addEdge(7, 10);
        g.addEdge(8, 10);
        g.addEdge(6, 9);
        g.addEdge(9, 11);
        g.addEdge(10, 11);

        System.out.println("Breadth First Search nga S deri tek G: ");

        g.BFS(0);
    }
}
