package MainProject.DataStructure;

public class Stack extends DataStructure{
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
    public void delete() {
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
            System.out.print(stack[i] + "\n");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public void clear(){
        pointer = -1;
    }

    public String show(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0;i <= pointer;i++){
            str.append(Integer.toString(stack[i]) + "\n");
        }
        return str.toString();
    }
}
