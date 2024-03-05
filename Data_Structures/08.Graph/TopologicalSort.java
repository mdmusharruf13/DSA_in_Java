import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 2));
        // graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, stack);
            }
        }

        stack.push(curr);
    }

    static void topSort(ArrayList<Edge>[] graph, int V) {
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[V];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topSort(graph, V);
    }
}
