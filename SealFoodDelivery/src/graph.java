public class graph {
        private final int MAX_VERTICES = 20; 	// allow only 20 vertices
	private String[] vertex; 			// list of vertices
	private int[][] adjMatrix; 		// adjacency matrix
	private int numVertices;  			//number of vertices
	int numEdges;
	
	//default constructor
	public graph(){
		//create vertex objects
	    vertex = new String[MAX_VERTICES];
	    //create adjacency matrix objects
	    adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
	    numVertices = 0;
	    numEdges = 0;
	    
	    //set all elements of adjacency matrix to be zero (no edges)
	    for(int i=0; i< MAX_VERTICES; i++) {
	       for(int j=0; j< MAX_VERTICES; j++) {
	         adjMatrix[i][j] = 0;
	       }
	    }
	}
	


	//add new vertex with title
	public void addVertex(String title) {
		vertex[numVertices++] = title;
	}

	//add edge between two vertices
	public void addEdge(int start, int end, int weight) {
		// set value in adjacency matrix
		adjMatrix[start][end] = weight;
		numEdges++;
	}

	//graph's size
	public void showSize(){
		System.out.println("Size of digraph = " + numVertices);
		System.out.println("");
	}
	
	// display each vertex's title
	public void showVertex() {
		System.out.println("=== Vertexes ===");
		for(int i=0; i<numVertices; i++) {
			System.out.print(vertex[i] + " ");
		}
		System.out.println("\n");
	}
	
	//display adjacency matrix
	public void showAdjacency() {
		System.out.println("=== Adjacency Matrix ===");
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	//display all edges
	public void showEdge() {
                
            
		System.out.println("=== Edges ===");
		System.out.println(numEdges);
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				if(adjMatrix[i][j]!=0) {
					System.out.print(vertex[i]+ "-"+vertex[j] + "(" + adjMatrix[i][j] + ") ");
				}
			}			
		}
		System.out.println("\n");
                
	}
	
	//check if the graph complete?
	public void checkComplete() {
		int complete = numVertices*(numVertices-1);
		if(complete==numEdges) {
			System.out.println("This digraph is a complete digraph");
		}
		else {
			System.out.println("This digraph is NOT a complete digraph");
		}
		System.out.println();
	}
	
	//compute path length
	public int findPathLength(int[] path) {
		int pathLength = 0;
		//assume the path is correct
		for(int i=0;i<path.length-1;i++) {
			pathLength += adjMatrix[path[i]][path[i+1]];
		}
		return pathLength;
	}
     
        
        public int shownumEdge(){
            return numEdges;
        }
        
        public int numVertices(){
            return numVertices;
        }
        
        
}


