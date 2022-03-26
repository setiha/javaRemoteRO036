package ro.sda.curs10.generycTypes;

public class GenericBoxLimited<T extends Phone> {
    private T item;

    public GenericBoxLimited(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void print() {
        this.item.printPhoneDetails();
    }
}
