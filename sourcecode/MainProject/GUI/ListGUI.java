package MainProject.GUI;

import MainProject.DataStructure.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListGUI extends JFrame{
    // Khai báo list để lưu các phần tử
    private List list;

    // Các thành phần giao diện
    private JTextField inputField;
    private JTextArea displayArea;
    private JButton insertButton, deleteButton, clearButton, findButton, sortButton, backButton;

    public ListGUI(){
        // Khởi tạo
        list = new List();

        // Thiết lập giao diện JFrame
        setTitle("List GUI");
        setSize(550, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tạo các thành phần giao diện
        JPanel northPanel = createNorthPanel();
        JPanel centerPanel = createCenterPanel();

        // Thêm các panel vào JFrame
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        // Hiển thị cửa sổ
        setVisible(true);
    }

    // Panel phía trên chứa input field và các nút điều khiển
    private JPanel createNorthPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Input field để nhập phần tử vào list
        inputField = new JTextField(10);
        panel.add(inputField);

        // Nút Push
        insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = inputField.getText();
                if (!value.isEmpty()) {
                    int num = Integer.parseInt(value);
                    list.insert(num);
                    updateDisplay();
                    inputField.setText("");
                }
            }
        });
        panel.add(insertButton);

        // Nút Pop
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = inputField.getText();
                int num = Integer.parseInt(value);
                if (list.find(num) != -1) {
                    list.delete(num);
                    updateDisplay();
                    inputField.setText("");
                } else {
                    JOptionPane.showMessageDialog(ListGUI.this, "Value not found in list!");
                }
            }
        });
        panel.add(deleteButton);

        // Nút Clear
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                list.clear();
                updateDisplay();
            }
        });
        panel.add(clearButton);

        // Nút Find
        findButton = new JButton("Find");
        findButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String value = inputField.getText();
                if (!value.isEmpty()) {
                    int num = Integer.parseInt(value);
                    int idx = list.find(num);
                    updateDisplay(idx);
                    inputField.setText("");
                }
            }
        });
        panel.add(findButton);

        // Nút Sort
        sortButton = new JButton("Sort");
        sortButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                list.sort();
                updateDisplay();
            }
        });
        panel.add(sortButton);

        // Nút Back
        backButton = new JButton("Back");
        backButton.addActionListener(event -> {
            dispose();
        });
        panel.add(backButton);

        return panel;
    }

    // Panel giữa để hiển thị nội dung của list
    private JPanel createCenterPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // TextArea để hiển thị các phần tử trong list
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        panel.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        return panel;
    }

    // Hàm cập nhật nội dung hiển thị của Stack
    private void updateDisplay() {
        displayArea.setText("");  // Xóa nội dung cũ
        displayArea.append(list.show());
    }

    private void updateDisplay(int idx) {
        displayArea.setText("");  // Xóa nội dung cũ
        displayArea.append("Found at " + Integer.toString(idx+1));
    }
}
