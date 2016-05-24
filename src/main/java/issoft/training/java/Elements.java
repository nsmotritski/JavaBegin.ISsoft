/*Задание 5. Определите интерфейс, содержащий один метод print (без параметров, не
	возвращающий значения). Объявите оба класса классы, описывающие элементы
	очереди (с именем-номером и без), реализующим интерфейс. В классе очереди и
	в тесте используйте тип интерфейса вместо типа класса - всюду где возможно.*/

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
