public class Main {

public static void main(String [] args){

    MyArrayList myList = new MyArrayList();
    MyArrayList myArrayList = new MyArrayList();
    myList.add("Элемент 2");
    myList.add("Элемент 3");
    myList.add("Элемент 4");

    System.out.println("Размер: " + myList.size());
    System.out.println("Элемент по индексу 0: " + myList.get(0));
    myList.remove(0);
    System.out.println("После удаления размер коллекции становит: " + myList.size());
    System.out.println("Элемент по индексу 0: " + myList.get(0));
    myList.clear();
    System.out.println("После удаления размер коллекции становит: " + myList.size());

    myArrayList.add("Элемент 1");
    myArrayList.add("Элемент 2");
    myArrayList.add("Элемент 3");

    System.out.println("Размер myArrayList: " + myArrayList.size());
    System.out.println("Элемент по индексу 0 в myArrayList: " + myArrayList.get(0));
    myArrayList.remove(0);
    System.out.println("После удаления размер коллекции myArrayList становит: " + myArrayList.size());
    System.out.println("Элемент по индексу 0 в myArrayList: " + myArrayList.get(0));
    myArrayList.clear();
    System.out.println("После удаления размер коллекции myArrayList становит: " + myArrayList.size());
}
}