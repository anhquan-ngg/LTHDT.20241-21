import java.util.Collections;

public class ListDemo extends DataStructure {
    private final java.util.List<Integer> list; // Su dung ArrayList de luu tru

    // Khoi tao List
    public ListDemo() {
        this.dataStructure = "List";
        this.list = new java.util.ArrayList<>();
    }

    @Override
    public void insert(int value) {
        list.add(value);
        System.out.println("Added " + value + " to the list.");
    }

    @Override
    public void delete(int value) {
        if (list.contains(value)) {
            list.remove(Integer.valueOf(value));
            System.out.println("Removed " + value + " from the list.");
        } else {
            System.out.println(value + " not found in the list.");
        }
    }

    @Override
    public int find(int value) {
        int index = list.indexOf(value);
        if (index != -1) {
            System.out.println(value + " found at index " + index);
        } else {
            System.out.println(value + " not found in the list.");
        }
        return index;
    }

    @Override
    public void showStructure() {
        System.out.println("List contents: " + list);
    }

    public void sort() {
        Collections.sort(list);
        System.out.println("List sorted: " + list);
    }
}
