public class BinarySearchTree {
    protected BinaryNode root;
    protected int treeSize;
    

    // check if tree is empty method 
    // need to write a javadoc comment for this method COMEBACK
    public boolean isEmpty () {
        if (root == null || treeSize == 0) {
            return true; 
        }
        return false; 
    }
    
    //clears the tree method 
    //NEED TO WRITE JAVADOC METHOD HEADER/COMMENT COMEBACK TO THIS
    public void clear(){ 
        root = null; 
    }

    // finds the size of the tree 
    // COME BACK AND WRITE JAVADOC METHOD HEADER/COMMENT
    public int size() {
        return sizeHelper(this.root);
    }

    //helper method for finding the size of the tree
    // COME BACK AND WRIE JAVADOC METHOD HEADER/COMMENT 
    public int sizeHelper(BinaryNode currentNode){

        int count = 0; 

        // first base case: is the actual root not there --> if so size is zero 
        if (treeSize == 0 || root == null) {
            return 0; 
        }

        // second base case: if current node is a leaf node, return the size
        if (currentNode.downLeft() == null && currentNode.downRight() == null){
            return treeSize; 
        }

        // recursive case 
        // left side 
        if (currentNode.downLeft() != null){ 
            count++; 
            sizeHelper(currentNode.downLeft());
        }

        // right side
        if (currentNode.downRight() != null) {
            count++; 
            sizeHelper(currentNode.downRight());
        }

        count = treeSize; 
        return treeSize; 
    }
}