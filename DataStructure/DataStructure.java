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

// Lop con Stack
class Stack extends DataStructure {
    private int[] stack; // Mang luu tru cac phan tu cua Stack
    private int size; // Kich thuoc toi da cua Stack

    // Khoi tao Stack voi kich thuoc cho truoc
    public Stack(int size) {
        this.dataStructure = "Stack";
        this.size = size;
        this.stack = new int[size];
        this.pointer = -1; // Con tro ban dau chi vao -1 (Stack rong)
    }

    // Chen phan tu vao Stack
    @Override
    public void insert(int value) {
        if (pointer < size - 1) { // Kiem tra Stack con cho trong
            stack[++pointer] = value; // Tang con tro va them gia tri vao Stack
            System.out.println("Pushed " + value + " to stack.");
        } else {
            System.out.println("Stack is full."); // Bao Stack day
        }
    }

    // Xoa phan tu khoi Stack
    @Override
    public void delete(int value) {
        if (pointer >= 0) { // Kiem tra Stack khong rong
            System.out.println("Popped " + stack[pointer--] + " from stack."); // Giam con tro
        } else {
            System.out.println("Stack is empty."); // Bao Stack rong
        }
    }

    // Tim vi tri cua gia tri trong Stack
    @Override
    public int find(int value) {
        for (int i = 0; i <= pointer; i++) {
            if (stack[i] == value) {
                return i; // Tra ve vi tri neu tim thay
            }
        }
        return -1; // Tra ve -1 neu khong tim thay
    }

    // Hien thi noi dung cua Stack
    @Override
    public void showStructure() {
        System.out.print("Stack: ");
        for (int i = 0; i <= pointer; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// Lop con Queue
class Queue extends DataStructure {
    private int[] queue; // Mang luu tru cac phan tu cua Queue
    private int size; // Kich thuoc toi da cua Queue
    private int front; // Con tro phan tu dau
    private int rear; // Con tro phan tu cuoi

    // Khoi tao Queue voi kich thuoc cho truoc
    public Queue(int size) {
        this.dataStructure = "Queue";
        this.size = size;
        this.queue = new int[size];
        this.front = 0; // Con tro dau bat dau tu 0
        this.rear = 0; // Con tro cuoi bat dau tu 0
    }

    // Them phan tu vao cuoi Queue
    @Override
    public void insert(int value) {
        if (rear < size) { // Kiem tra Queue con cho
            queue[rear++] = value; // Tang con tro rear va them gia tri
            System.out.println("Enqueued " + value + " to queue.");
        } else {
            System.out.println("Queue is full."); // Bao Queue day
        }
    }

    // Xoa phan tu khoi dau Queue
    @Override
    public void delete(int value) {
        if (front < rear) { // Kiem tra Queue khong rong
            System.out.println("Dequeued " + queue[front++] + " from queue."); // Tang con tro front
        } else {
            System.out.println("Queue is empty."); // Bao Queue rong
        }
    }

    // Tim vi tri cua gia tri trong Queue
    @Override
    public int find(int value) {
        for (int i = front; i < rear; i++) {
            if (queue[i] == value) {
                return i; // Tra ve vi tri neu tim thay
            }
        }
        return -1; // Tra ve -1 neu khong tim thay
    }

    // Hien thi noi dung cua Queue
    @Override
    public void showStructure() {
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

// Lop con List (dung thu vien ArrayList cua Java)
class List extends DataStructure {
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
}
