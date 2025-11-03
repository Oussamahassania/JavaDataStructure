import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int [][]matrix;
    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node){
        nodes.add(node);

    }
    public void addEdge(int src,int dest){
      matrix[src][dest]=1;
    }
    public boolean checkEdge(int src,int dest){
        if (matrix[src][dest]==1){
            return true;
        }else{
            return false;
        }
    }
    public void print(){
        System.out.print("  ");
        for (Node node : nodes){
            System.out.print(node.data+" ");
        }
        System.out.println();
     for (int row = 0; row < matrix.length; row++) {
         System.out.print(nodes.get(row).data+" ");
         for (int col = 0; col < matrix[row].length; col++) {
             System.out.print(matrix[row][col]+" ");
         }
         System.out.println();
     }
    }
}
