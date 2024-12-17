package sourcecode.DataStructure;

public class Queue extends DataStructure{
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
    public void delete() {
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

    public boolean isEmpty(){
        return front == 0 && rear == 0;
    }

    public void clear(){
        front = 0;
        rear = 0;
    }

    public String show(){
        StringBuilder str = new StringBuilder("");
        for (int i = front;i < rear;i++){
            str.append(Integer.toString(queue[i]) + "\n");
        }
        return str.toString();
    }
}
