package sourcecode.GUI;

import sourcecode.DataStructure.Stack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StackGUI extends JFrame {
    // Khai báo stack để lưu các phần tử
    private Stack stack;

    // Các thành phần giao diện
    private JTextField inputField;
    private JTextArea displayArea;
    private JButton pushButton, popButton, clearButton, findButton, backButton;

    public StackGUI() {
        // Khởi tạo stack
        stack = new Stack(100);

        // Thiết lập giao diện JFrame
        setTitle("Stack GUI");
        setSize(500, 500);
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

        // Input field để nhập phần tử vào stack
        inputField = new JTextField(10);
        panel.add(inputField);

        // Nút Push
        pushButton = new JButton("Push");
        pushButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = inputField.getText();
                if (!value.isEmpty()) {
                    int num = Integer.parseInt(value);
                    stack.insert(num);
                    updateDisplay();
                    inputField.setText("");
                }
            }
        });
        panel.add(pushButton);

        // Nút Pop
        popButton = new JButton("Pop");
        popButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    stack.delete();
                    updateDisplay();
                } else {
                    JOptionPane.showMessageDialog(StackGUI.this, "Stack is empty!");
                }
            }
        });
        panel.add(popButton);

        // Nút Clear
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stack.clear();
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
                    int idx = stack.find(num);
                    updateDisplay(idx);
                    inputField.setText("");
                }
            }
        });
        panel.add(findButton);

        // Nút Back
        backButton = new JButton("Back");
        backButton.addActionListener(event -> {
            dispose();
        });
        panel.add(backButton);

        return panel;
    }

    // Panel giữa để hiển thị nội dung của stack
    private JPanel createCenterPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // TextArea để hiển thị các phần tử trong stack
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        panel.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        return panel;
    }

    // Hàm cập nhật nội dung hiển thị của Stack
    private void updateDisplay() {
        displayArea.setText("");  // Xóa nội dung cũ
        displayArea.append(stack.show());
    }

    private void updateDisplay(int idx) {
        displayArea.setText("");  // Xóa nội dung cũ
        displayArea.append("Found at " + Integer.toString(idx+1));
    }
}
