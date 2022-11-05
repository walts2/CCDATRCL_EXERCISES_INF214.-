public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 10;
        int noEdges = 10;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Elaine";
        myGraph.edge[0].dest = "Benette";

        // Edge 2
        myGraph.edge[1].src = "Elaine";
        myGraph.edge[1].dest = "Xien";

        // Edge 3
        myGraph.edge[2].src = "Elaine";
        myGraph.edge[2].dest = "Icarus";

        // Edge 4
        myGraph.edge[3].src = "Elaine";
        myGraph.edge[3].dest = "Adler";

        // Edge 5
        myGraph.edge[4].src = "Elaine";
        myGraph.edge[4].dest = "Ellie";

        // Edge 6
        myGraph.edge[5].src = "Elaine";
        myGraph.edge[5].dest = "Thairra";

        // Edge 7
        myGraph.edge[6].src = "Benette";
        myGraph.edge[6].dest = "Xien";

        // Edge 8
        myGraph.edge[7].src = "Icarus";
        myGraph.edge[7].dest = "Adler";

        // Edge 9
        myGraph.edge[8].src = "Ellie";
        myGraph.edge[8].dest = "Benette";

        // Edge 10 
        myGraph.edge[9].src = "Ally";
        myGraph.edge[9].dest = "Thairra";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
