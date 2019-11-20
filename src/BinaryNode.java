public class BinaryNode<T> {

    private T key;

    private BinaryNode<T> left;

    private BinaryNode<T> right;

    public BinaryNode(T key, BinaryNode<T> left, BinaryNode<T> right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public String preorder() {
        String result = "";
        result += key.toString();
        if (left != null) {
            result += left.preorder();
        }
        if (right != null) {
            result += right.preorder();
        }
        return result;
    }

    public String inorder() {
        String result = "";
        if (left != null) {
            result += left.inorder();
        }
        result += key.toString();
        if (right != null) {
            result += right.inorder();
        }
        return result;
    }

    public String postorder() {
        String result = "";
        if (left != null) {
            result += left.postorder();
        }
        if (right != null) {
            result += right.postorder();
        }
        result += key.toString();
        return result;
    }

    public static BinaryNode<Character> makeTree() {
        BinaryNode<Character> d = new BinaryNode('d');
        BinaryNode<Character> e = new BinaryNode('e');
        BinaryNode<Character> f = new BinaryNode('f');
        BinaryNode<Character> b = new BinaryNode('b', d, e);
        BinaryNode<Character> c = new BinaryNode('c', null, f);
        BinaryNode<Character> a = new BinaryNode('a', b, c);
        return a;
    }

    public static void main(String[] args) {
        BinaryNode<Character> root = makeTree();
        StdOut.println(root.postorder());
    }

}
