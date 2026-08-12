class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
class LRUCache {
    HashMap<Integer,Node> hm;
    int capacity;
    Node head;
    Node tail;


    public LRUCache(int capacity) {
       this.capacity = capacity;
       hm = new HashMap<>();

       head = new Node(-1,-1);
       tail = new Node(-1,-1);
       head.next = tail;
       tail.prev = head;
    }
    
    public int get(int key) {
       if(!hm.containsKey(key)) return -1;
       Node node = hm.get(key);
       deleteNode(node);
       insert(node);
       return node.value;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
        Node node = hm.get(key);
        node.value = value;
        deleteNode(node);
        insert(node);
       } else{
        if(hm.size() == capacity){
            Node node = tail.prev;
            hm.remove(node.key);
            deleteNode(node);

        }
        Node newnode = new Node(key,value);
        hm.put(key,newnode);
        insert(newnode);
       }
    }

    private void deleteNode(Node node){
        Node prevnode = node.prev;
        Node nextnode = node.next;

        prevnode.next = nextnode;
        nextnode.prev = prevnode;
    }

    private void insert(Node node){
        Node afterhead = head.next;
        head.next = node;
        node.next = afterhead;
        node.prev = head;
        afterhead.prev = node;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */