package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Structure Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLayout(null);

        JButton stackButton = new JButton("Stack");
        JButton queueButton = new JButton("Queue");
        JButton listButton = new JButton("List");
        JButton exitButton = new JButton("Exit");
        JButton helpButton = new JButton("Help");

        stackButton.setBounds(50, 50, 100, 30);
        queueButton.setBounds(200, 50, 100, 30);
        listButton.setBounds(350, 50, 100, 30);
        helpButton.setBounds(50, 130, 100, 30);
        exitButton.setBounds(350, 130, 100, 30);

        stackButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame stackFrame = new JFrame("Stack Menu");
                stackFrame.setSize(500, 330);
                stackFrame.setLayout(null);

                JLabel inputLabel = new JLabel("Input: ");
                JTextField inputText = new JTextField();
                JButton createButton = new JButton("Create");
                JButton insertButton = new JButton("Insert");
                JButton sortButton = new JButton("Sort");
                JButton findButton = new JButton("Find");
                JButton deleteButton = new JButton("Delete");
                JButton backButton = new JButton("Back");

                inputLabel.setBounds(50, 50, 100, 30);
                inputText.setBounds(200, 50, 250, 30);
                createButton.setBounds(50, 130, 100, 30);
                insertButton.setBounds(200, 130, 100, 30 );
                sortButton.setBounds(350, 130, 100, 30);
                findButton.setBounds(50, 210, 100, 30);
                deleteButton.setBounds(200, 210, 100, 30);
                backButton.setBounds(350, 210, 100, 30);

                stackFrame.add(inputLabel);
                stackFrame.add(inputText);
                stackFrame.add(createButton);
                stackFrame.add(insertButton);
                stackFrame.add(sortButton);
                stackFrame.add(findButton);
                stackFrame.add(deleteButton);
                stackFrame.add(backButton);

                backButton.addActionListener(event -> stackFrame.dispose());

                stackFrame.setVisible(true);
            }
        });

        queueButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame queueFrame = new JFrame("Queue Menu");
                queueFrame.setSize(500, 330);
                queueFrame.setLayout(null);

                JLabel inputLabel = new JLabel("Input: ");
                JTextField inputText = new JTextField();
                JButton createButton = new JButton("Create");
                JButton insertButton = new JButton("Insert");
                JButton sortButton = new JButton("Sort");
                JButton findButton = new JButton("Find");
                JButton deleteButton = new JButton("Delete");
                JButton backButton = new JButton("Back");

                inputLabel.setBounds(50, 50, 100, 30);
                inputText.setBounds(200, 50, 250, 30);
                createButton.setBounds(50, 130, 100, 30);
                insertButton.setBounds(200, 130, 100, 30 );
                sortButton.setBounds(350, 130, 100, 30);
                findButton.setBounds(50, 210, 100, 30);
                deleteButton.setBounds(200, 210, 100, 30);
                backButton.setBounds(350, 210, 100, 30);

                queueFrame.add(inputLabel);
                queueFrame.add(inputText);
                queueFrame.add(createButton);
                queueFrame.add(insertButton);
                queueFrame.add(sortButton);
                queueFrame.add(findButton);
                queueFrame.add(deleteButton);
                queueFrame.add(backButton);

                backButton.addActionListener(event -> queueFrame.dispose());

                queueFrame.setVisible(true);
            }
        });

        listButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame listFrame = new JFrame("List Menu");
                listFrame.setSize(500, 330);
                listFrame.setLayout(null);

                JLabel inputLabel = new JLabel("Input: ");
                JTextField inputText = new JTextField();
                JButton createButton = new JButton("Create");
                JButton insertButton = new JButton("Insert");
                JButton sortButton = new JButton("Sort");
                JButton findButton = new JButton("Find");
                JButton deleteButton = new JButton("Delete");
                JButton backButton = new JButton("Back");

                inputLabel.setBounds(50, 50, 100, 30);
                inputText.setBounds(200, 50, 250, 30);
                createButton.setBounds(50, 130, 100, 30);
                insertButton.setBounds(200, 130, 100, 30 );
                sortButton.setBounds(350, 130, 100, 30);
                findButton.setBounds(50, 210, 100, 30);
                deleteButton.setBounds(200, 210, 100, 30);
                backButton.setBounds(350, 210, 100, 30);

                listFrame.add(inputLabel);
                listFrame.add(inputText);
                listFrame.add(createButton);
                listFrame.add(insertButton);
                listFrame.add(sortButton);
                listFrame.add(findButton);
                listFrame.add(deleteButton);
                listFrame.add(backButton);

                backButton.addActionListener(event -> listFrame.dispose());

                listFrame.setVisible(true);
            }
        });

        exitButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        helpButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "This GUI allows you to choose between:\n"
                + "- Stack\n- Queue\n- List\nClick Exit to close."));

        frame.add(stackButton);
        frame.add(queueButton);
        frame.add(listButton);
        frame.add(helpButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}