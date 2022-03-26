package ro.sda.curs10.generycTypes;

//O cutie pentru clasa String
public class GenericBox<T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

}
