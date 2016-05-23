package issoft.training.java;

class Elements {
    Element[] elements;

    Elements(int elementsNumber) {
        elements = new Element[elementsNumber];
    }

void printQueue () {
        for (Printable e: elements) {   //using interface link for elements
            e.print();
        }
    }
}
