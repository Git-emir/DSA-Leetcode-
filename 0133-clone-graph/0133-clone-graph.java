/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Node cloneg(Node node, HashMap<Node,Node> hm ){
        if (hm.containsKey(node)) {
             return hm.get(node);
        }
       
        Node newNode = new Node(node.val);
        hm.put(node,newNode);
        for(int i=0;i<node.neighbors.size();i++){
            Node nei = node.neighbors.get(i);
            if(!hm.containsKey(nei)){
                newNode.neighbors.add(cloneg(nei,hm));
            }else{
                newNode.neighbors.add(hm.get(nei));
            }
        }return newNode;
        

    }
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node,Node> hm = new HashMap<>();
        return cloneg(node,hm);
    }
}