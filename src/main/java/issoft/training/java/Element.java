package issoft.training.java;

class Element implements Printable {
    private Element previous;

    Element() {}

    Element(Element previous) {
        this.previous = previous;
    }

    public void print() {
        if (previous != null) {
            System.out.println("E=" + this + " p=" + previous);
        }  else {
            System.out.println("E=" + this + " p=null" );
        }
    }

    int countNumber() {
        Count c = new Count();
        if (previous != null) {
            countNumber(previous, c);
        }
        return c.f;
    }

    private void countNumber(Printable e, Count c) {
        if (e != null) {
            c.f++;
            countNumber(((Element)e).previous, c);//cast to Element type
        }
    }

    public String toString() {
        return "" + hashCode();
    }
}
