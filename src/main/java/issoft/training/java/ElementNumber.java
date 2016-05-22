package issoft.training.java;

class ElementNumber extends Element implements Printable {
    private int number;

    ElementNumber() {}

    ElementNumber(Element e, int number) {
        super(e);
        this.number = number;
    }

    public String toString() {
        return super.toString() + " n=" + number;
    }
}