// Lop cha - Lop truu tuong DataStructure
public abstract class DataStructure {
    protected String dataStructure; // Loai cau truc du lieu (Stack, Queue, List)
    protected int pointer = -1; // Vi tri hien tai (dung cho Stack, mac dinh la -1)

    // Phuong thuc truu tuong - Chen gia tri vao cau truc
    public abstract void insert(int value);

    // Phuong thuc truu tuong - Xoa gia tri khoi cau truc
    public abstract void delete(int value);

    // Phuong thuc truu tuong - Tim kiem gia tri trong cau truc
    public abstract int find(int value);

    // Phuong thuc truu tuong - Hien thi noi dung cua cau truc
    public abstract void showStructure();
}
