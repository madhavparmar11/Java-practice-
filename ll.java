class ll {
    class node {
        String data;
        node next;

        public node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private node head;

    public void addfirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public static void main(String[] args) {
        ll a = new ll();
        a.addfirst("hello");
        a.addfirst("world");
    }
}
