class Solution {
    public long multiplyTwoLists(Node first, Node second) {
            long a = 0;
        long b = 0;
        
        Node f = first;
        while (f != null) {
            a = (a * 10) + f.data;
            f = f.next;
        }
        
        Node s = second;
        while (s != null) {
            b = (b * 10) + s.data;
            s = s.next;
        }
        
        return a * b;
    }
}
