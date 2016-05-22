package issoft.training.java;

class ElementTest {

    public static void main(String[] p) {
        Elements q = new Elements(5);
        //filling queue of elements with data
        for (int i = 0; i < q.elements.length;i++) {
            if (i > 0) {
                q.elements[i] = new Element(q.elements[i-1]);
            }
            if (i == 0) {
                q.elements[i] = new Element();
            }
        }
        System.out.println("---------Queue1---------");
        q.printQueue();
        //filling queue of elementNumbers with data
        Elements q2 = new Elements("5");
        for (int i = 0; i < q2.elements.length;i++) {
            if (i > 0) {
                q2.elements[i] = new ElementNumber(q2.elements[i-1],i+50);
            }
            if (i == 0) {
                q2.elements[i] = new ElementNumber();
            }
        }
        System.out.println("---------Queue2---------");
        q2.printQueue();
        //testing that countNumber method works
        System.out.println((q2.elements[3]).countNumber());


    }
}