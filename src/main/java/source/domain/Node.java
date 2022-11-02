package source.domain;

public class Node {
    private String label;
    private int degree;
    private int index;

    public Node(String label){
        this.label = label;
        this.degree = 0;
        this.index = 0;
    }

    public int getDegree() {
        return degree;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return this.index;
    }

    public String getLabel(){
        return this.label;
    }
}
