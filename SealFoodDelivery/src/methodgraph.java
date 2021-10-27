public class methodgraph {
	private final int MAX_VERTICES = 20; 	// allow only 20 vertices
	private String[] vertex; 			// list of vertices
	private int[][] adjMatrix; 		// adjacency matrix
	private int numVertices;  			//number of vertices
	private int numEdges;
	
	//default constructor
	public methodgraph(){
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
	
	//compute path length
	public int findtimeLength(int[] time) {
		int timeLength = 0;
		
		for(int i=0;i<time.length-1;i++) {
			timeLength += adjMatrix[time[i]][time[i+1]];
		}
		return timeLength;
	}   
}