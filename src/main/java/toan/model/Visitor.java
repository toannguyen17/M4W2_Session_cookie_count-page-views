package toan.model;

public class Visitor {
    private int visitor = 0;

    public Visitor (){
    }

    public void plus() {
        visitor++;
    }

    public int getVisitor() {
        return visitor;
    }

    public void setVisitor(int visitor) {
        this.visitor = visitor;
    }
}
