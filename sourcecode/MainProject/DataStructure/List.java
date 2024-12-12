package MainProject.DataStructure;

import java.util.Collections;

public class List extends DataStructure {
    private java.util.List<Integer> list; // Su dung ArrayList de luu tru

    // Khoi tao List
    public List() {
        this.dataStructure = "List";
        this.list = new java.util.ArrayList<>();
    }

    // Them phan tu vao List
    @Override
    public void insert(int value) {
        list.add(value); // Them gia tri vao ArrayList
        System.out.println("Added " + value + " to list.");
    }

    // Xoa phan tu khoi List
    @Override
    public void delete(int value) {
        if (list.remove((Integer) value)) { // Xoa gia tri neu ton tai
            System.out.println("Removed " + value + " from list.");
        } else {
            System.out.println("Value not found in list."); // Bao gia tri khong ton tai
        }
    }

    // Tim vi tri cua gia tri trong List
    @Override
    public int find(int value) {
        return list.indexOf(value); // Tra ve vi tri neu tim thay, hoac -1
    }

    // Hien thi noi dung cua List
    @Override
    public void showStructure() {
        System.out.println("List: " + list);
    }

    public void clear() {
        list.clear(); // Xóa tất cả các phần tử trong ArrayList
        System.out.println("All elements have been removed from the list.");
    }

    public String show(){
        StringBuilder str = new StringBuilder("");
        for (int i : list){
            str.append(Integer.toString(i) + "\n");
        }
        return str.toString();
    }

    public void sort(){
        Collections.sort(list);
        System.out.println("List sorted");
    }
}
