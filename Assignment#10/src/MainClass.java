class Node {
    String data;
    Node Link;
    Node(String data, Node Link){
        this.data=data;
        this.Link=Link;
    }
    Node(String data){
        this(data, null);
    }
    public String toString() {
        if (data == null)
            return "null";
        return data;
    }
}

class SList {
    Node head = new Node(null);
    public SListIterator iterateList() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head==null) {
            return "list is empty: ";
        }
        SListIterator iterator = this.iterateList();
        StringBuilder s=new StringBuilder();
        while (iterator.hasLink()) {
            s.append(iterator.Link() + (iterator.hasLink() ? ", " : ""));
        }
        return ""+s;
    }
}
//Iterator for list
class SListIterator {
    Node temp;
    SListIterator(Node node){
        this.temp = node;
    }
    public Node Link() {
        temp = temp.Link;
        return temp;
    }
    //checks link
    public boolean hasLink() {
        return temp.Link!=null;
    }
    //inserts node at last
    public void insertNode(String data) {
        temp.Link = new Node(data, temp.Link);
        temp = temp.Link;
    }
    //removes node at first
    public void removeNode() {
        if(temp.Link != null) {
            temp.Link = temp.Link.Link;
        }
    }
}

class MainClass {

    public static void main(String[] args) {
        SList obj1 = new SList();
        SListIterator obj2 = obj1.iterateList();
        obj2.insertNode("99");
        obj2.insertNode("9");
        obj2.insertNode("Hello");
        System.out.println(obj1);
        SListIterator obj3 = obj1.iterateList();
        obj3.removeNode();
        obj3.removeNode();
        System.out.println(obj1);

    }

}