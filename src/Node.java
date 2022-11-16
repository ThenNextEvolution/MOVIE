import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Node {

    public int data;
    private Movie child2;
    private Movie child1;
    List<Movie> go = new ArrayList<Movie>();
    ListIterator<Movie> up = go.listIterator();


    public Node(Movie li,Movie l2, int data) {
        this.data = data;

        this.child2 = li;

        this.child1 =l2;

    }
    public Node(Movie li, int data) {
        this.data = data;

        this.child2 = li;

        this.child1 =null;

    }

    public Node(Movie next) {
    }


    public void setChild1(Movie child1) {
        this.child1 = child1;
    }

    public void setChild2(Movie child2) {
        this.child2 = child2;
    }

    public Movie getChild1() {
        return child1;
    }

    public Movie getChild2() {
        return child2;
    }


    public void test() {

        while (up.hasNext()) {
            Movie see = up.next();
            if(up.hasNext()){
            Node fo = new Node(see,up.next(),1);}
            else {
                Node fo = new Node(up.next(),1);}
            }
            //Node(up.hasNext())
        }
    }



