class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.next=head;

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        
            Node node=map.get(key);
            removeNode(node);
            addToFront(node);
            
        return node.value;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            removeNode(node);
            addToFront(node);
        }
        else{
            Node node=new Node(key,value);
            if(map.size()==capacity){
                Node lru=tail.prev;
                removeNode(lru);
                map.remove(lru.key);

            }
            addToFront(node);
            map.put(key,node);
        }

        
    }
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void addToFront(Node node){
        node.next=head.next;
        head.next=node;
        node.next.prev=node;
        node.prev=head;
    }
}
